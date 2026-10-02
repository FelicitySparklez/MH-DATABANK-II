import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainFX extends Application {

    @Override
    public void start(Stage stage) {

        // =========================
        // TITEL
        // =========================

        Label titel = new Label("MONSTER HUNTER DATABASE");
        titel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");


        // =========================
        // SUCHLEISTE
        // =========================

        Label suchLabel = new Label("Monster suchen:");

        TextField suchfeld = new TextField();
        suchfeld.setPromptText("Monstername eingeben...");
        suchfeld.setPrefWidth(250);

        Button suchenButton = new Button("Suchen");

        HBox suchBereich = new HBox(
                10,
                suchLabel,
                suchfeld,
                suchenButton
        );

        suchBereich.setAlignment(Pos.CENTER_LEFT);


        // =========================
        // FILTER
        // =========================

        Label kategorieLabel = new Label("Kategorie:");

        ComboBox<String> kategorieBox = new ComboBox<>();
        kategorieBox.getItems().add("Alle");
        kategorieBox.setValue("Alle");


        Label elementLabel = new Label("Element:");

        ComboBox<String> elementBox = new ComboBox<>();
        elementBox.getItems().add("Alle");
        elementBox.setValue("Alle");


        Label generationLabel = new Label("Generation:");

        ComboBox<String> generationBox = new ComboBox<>();
        generationBox.getItems().add("Alle");
        generationBox.setValue("Alle");


        HBox filterBereich = new HBox(
                10,
                kategorieLabel,
                kategorieBox,
                elementLabel,
                elementBox,
                generationLabel,
                generationBox
        );

        filterBereich.setAlignment(Pos.CENTER_LEFT);


        // =========================
        // MONSTERLISTE
        // =========================

        Label listeTitel = new Label("Monsterliste");
        listeTitel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        ListView<String> monsterListe = new ListView<>();

        ArrayList<Monster> alleMonster =
                MonsterRepository.getAllMonsters();

        for (Monster monster : alleMonster) {
            monsterListe.getItems().add(
                    monster.getName()
            );
        }

        // =========================
        // MONSTER DETAILS
        // =========================

        Label detailsTitel = new Label("Monster-Details");
        detailsTitel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Label details = new Label(
                "Wähle ein Monster aus der Liste aus."
        );

        details.setWrapText(true);


        // =========================
        // LIVE-SUCHE
        // =========================

        suchfeld.textProperty().addListener(
                (observable, alterText, neuerText) -> {

                    String suchbegriff = neuerText.trim();

                    monsterListe.getItems().clear();

                    if (suchbegriff.isEmpty()) {

                        for (Monster monster : alleMonster) {
                            monsterListe.getItems().add(
                                    monster.getName()
                            );
                        }

                        details.setText(
                                "Wähle ein Monster aus der Liste aus."
                        );

                        return;
                    }

                    ArrayList<Monster> suchErgebnisse =
                            MonsterRepository.searchByNameContains(
                                    suchbegriff
                            );

                    for (Monster monster : suchErgebnisse) {
                        monsterListe.getItems().add(
                                monster.getName()
                        );
                    }

                    if (suchErgebnisse.isEmpty()) {

                        details.setText(
                                "Keine passenden Monster gefunden."
                        );

                    } else {

                        details.setText(
                                "Bitte ein Monster aus der Liste auswählen."
                        );
                    }
                }
        );


        // =========================
        // MONSTER AUSWÄHLEN
        // =========================

        monsterListe.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable, alterName, neuerName) -> {

                    if (neuerName == null) {
                        return;
                    }

                    for (Monster monster : alleMonster) {

                        if (monster.getName().equals(neuerName)) {

                            StringBuilder text = new StringBuilder();

                            text.append("ID: ")
                                    .append(monster.getMonsterId())
                                    .append("\n\n");

                            text.append("Name: ")
                                    .append(monster.getName())
                                    .append("\n\n");

                            text.append("Kategorie: ")
                                    .append(monster.getCategory().getName())
                                    .append("\n\n");

                            text.append("Generationen:\n");

                            for (Generation generation : monster.getGenerations()) {
                                text.append("- ")
                                        .append(generation.getName())
                                        .append("\n");
                            }

                            text.append("\nElemente:\n");

                            for (Element element : monster.getElements()) {
                                text.append("- ")
                                        .append(element.getName())
                                        .append("\n");
                            }


                            text.append("\nRelated Monster:\n");

                            if (monster.getRelatedMonsterIds().isEmpty()) {

                                text.append("- Keine\n");

                            } else {

                                for (int relatedId : monster.getRelatedMonsterIds()) {

                                    for (Monster relatedMonster : alleMonster) {

                                        if (relatedMonster.getMonsterId() == relatedId) {

                                            text.append("- ")
                                                    .append(relatedMonster.getName())
                                                    .append("\n");

                                            break;
                                        }
                                    }
                                }
                            }


                            details.setText(text.toString());

                            break;
                        }
                    }
                });



        // =========================
        // LINKE SEITE
        // =========================

        VBox linkeSeite = new VBox(
                10,
                listeTitel,
                monsterListe
        );

        linkeSeite.setPadding(new Insets(10));


        // =========================
        // RECHTE SEITE
        // =========================

        VBox rechteSeite = new VBox(
                10,
                detailsTitel,
                details
        );

        rechteSeite.setPadding(new Insets(10));


        // =========================
        // HAUPTBEREICH
        // =========================

        SplitPane hauptbereich = new SplitPane(
                linkeSeite,
                rechteSeite
        );

        hauptbereich.setDividerPositions(0.4);


        // =========================
        // GESAMTES LAYOUT
        // =========================

        VBox root = new VBox(
                15,
                titel,
                suchBereich,
                filterBereich,
                hauptbereich
        );

        root.setPadding(new Insets(20));

        VBox.setVgrow(
                hauptbereich,
                Priority.ALWAYS
        );


        // =========================
        // FENSTER
        // =========================

        Scene scene = new Scene(
                root,
                1000,
                650
        );

        stage.setTitle("Monster Hunter Database");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}