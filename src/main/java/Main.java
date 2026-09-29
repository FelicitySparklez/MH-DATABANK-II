import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Monster> monsterListe = MonsterRepository.getAllMonsters();


        boolean programmLaueft = true;

        while (programmLaueft) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("   MONSTER HUNTER DATABASE");
            System.out.println("==============================");
            System.out.println();

            System.out.println("[1] Monster suchen");
            System.out.println("[2] Kategorie suchen");
            System.out.println("[3] Element suchen");
            System.out.println("[4] Alle Monster anzeigen");
            System.out.println("[5] Nach Generation suchen");
            System.out.println("[0] Beenden");


            System.out.println();
            System.out.print("Auswahl: ");

            int auswahl = scanner.nextInt();

            switch (auswahl) {

                case 1:
                    boolean monsterSucheLaueft = true;

                    while (monsterSucheLaueft) {

                        System.out.println();
                        System.out.println("==============================");
                        System.out.println("        MONSTER SUCHEN");
                        System.out.println("==============================");
                        System.out.println();

                        System.out.println("[1] Nach ID suchen");
                        System.out.println("[2] Nach Name suchen");
                        System.out.println("[0] Zurück");

                        System.out.println();
                        System.out.print("Auswahl: ");

                        int monsterAuswahl = scanner.nextInt();

                        switch (monsterAuswahl) {

                            case 1:

                                System.out.println();
                                System.out.print("Monster-ID eingeben: ");

                                int monsterId = scanner.nextInt();

                                Monster gefundenesMonster =
                                        MonsterRepository.searchById(
                                                monsterId
                                        );

                                if (gefundenesMonster != null) {

                                    gefundenesMonster.showDetails(monsterListe);

                                } else {

                                    System.out.println();
                                    System.out.println(
                                            "Kein Monster mit dieser ID gefunden."
                                    );
                                }

                                break;

                            case 2:

                                System.out.println();
                                System.out.print("Monstername eingeben: ");

                                scanner.nextLine();

                                String monsterName =
                                        scanner.nextLine();

                                Monster gefundenesMonsterName =
                                        MonsterRepository.searchByName(
                                                monsterName
                                        );
                                if (gefundenesMonsterName != null) {

                                    gefundenesMonsterName.showDetails(monsterListe);

                                } else {

                                    System.out.println();
                                    System.out.println(
                                            "Kein Monster mit diesem Namen gefunden."
                                    );
                                }

                                break;

                            case 0:

                                monsterSucheLaueft = false;

                                break;

                            default:

                                System.out.println();
                                System.out.println(
                                        "Ungültige Auswahl!"
                                );
                        }

                    }

                    break;





                // -------------------------------------------------
                case 2:

                    boolean kategorieSucheLaueft = true;

                    while(kategorieSucheLaueft) {

                        System.out.println();
                        System.out.println("==============================");
                        System.out.println("       KATEGORIE SUCHEN");
                        System.out.println("==============================");
                        System.out.println();

                        Category.showAll();

                        System.out.println();
                        System.out.println("[0] Zurück");
                        System.out.println();

                        System.out.println();
                        System.out.print("Kategorie-ID: ");

                        int categoryId = scanner.nextInt();

                        if (categoryId == 0) {
                            kategorieSucheLaueft = false;
                            break;

                        }

                        ArrayList<Monster> ergebnisKategorie =
                                MonsterRepository.searchByCategory(
                                        categoryId
                                );

                        if (ergebnisKategorie.isEmpty()) {

                            System.out.println();
                            System.out.println(
                                    "Keine Monster gefunden."
                            );

                        } else {

                            System.out.println();
                            System.out.println(
                                    "Gefundene Monster:"
                            );

                            for (Monster monster : ergebnisKategorie) {

                                monster.showDetails(monsterListe);
                            }
                        }

                    }

                    break;

                case 3:

                    boolean elementSucheLaueft = true;

                    while (elementSucheLaueft) {

                        System.out.println();
                        System.out.println("==============================");
                        System.out.println("        ELEMENT SUCHEN");
                        System.out.println("==============================");
                        System.out.println();

                        Element.showAll();
// landet nach auswahl immer direkt wieder im menü
                        System.out.println();
                        System.out.println("[0] Zurück");
                        System.out.println();

                        System.out.println();
                        System.out.print("Element-ID: ");

                        int elementId = scanner.nextInt();

                        if (elementId == 0) {
                            elementSucheLaueft = false;
                            break;
                        }

                        ArrayList<Monster> ergebnisElement =
                                MonsterRepository.searchByElement(
                                        elementId
                                );

                        if (ergebnisElement.isEmpty()) {

                            System.out.println();
                            System.out.println(
                                    "Keine Monster gefunden."
                            );

                        } else {

                            System.out.println();
                            System.out.println(
                                    "Gefundene Monster:"
                            );

                            for (Monster monster : ergebnisElement) {

                                monster.showDetails(monsterListe);
                            }
                        }

                    }

                    break;

                case 4:

                    System.out.println("Alle Monster");

                    ArrayList<Monster> alleMonster =
                            MonsterRepository.getAllMonsters();

                    for (Monster monster : alleMonster) {
                        System.out.println(monster.getName());
                    }

                    break;

                case 5:

                    boolean generationSucheLaueft = true;

                    while (generationSucheLaueft) {

                        System.out.println();
                        System.out.println("==============================");
                        System.out.println("      GENERATION SUCHEN");
                        System.out.println("==============================");
                        System.out.println();

                        Generation.showAll();

                        System.out.println();
                        System.out.println("[0] Zurück");
                        System.out.println();

                        System.out.println("Generation auswählen: ");

                        int generationId = scanner.nextInt();

                        if (generationId == 0) {
                            generationSucheLaueft = false;
                            break;
                        }

                        ArrayList<Monster> ergebnisGeneration =
                                MonsterRepository.searchByGeneration(
                                        generationId
                                );

                        if (ergebnisGeneration.isEmpty()) {

                            System.out.println();
                            System.out.println(
                                    "Keine Monster für diese Generation gefunden."
                            );

                        } else {

                            System.out.println();
                            System.out.println("Gefundene Monster:"
                            );


                            for (Monster monster : ergebnisGeneration) {
                                monster.showDetails(monsterListe);
                            }
                        }
                    }

                    break;

                case 0:
                    programmLaueft = false;
                    System.out.println("Programm wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige Auswahl!");


            }

        }

        scanner.close();

    }

}
