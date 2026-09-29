import java.sql.Connection;
import java.sql.Statement;

public class DatabaseSetup {

    public static void createTables() {

        String categoryTable = """
                CREATE TABLE IF NOT EXISTS CATEGORY (
                    category_id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL
                );
                """;

        String elementTable = """
                CREATE TABLE IF NOT EXISTS ELEMENT (
                    element_id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL
                );
                """;

        String generationTable = """
                CREATE TABLE IF NOT EXISTS GENERATION (
                    generation_id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL
                );
                """;

        String monsterTable = """
                CREATE TABLE IF NOT EXISTS MONSTER (
                    monster_id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL,
                    category_id INTEGER NOT NULL,
                    FOREIGN KEY (category_id) REFERENCES CATEGORY(category_id)
                );
                """;

        String monsterElementTable = """
                CREATE TABLE IF NOT EXISTS MONSTER_ELEMENT (
                    monster_id INTEGER NOT NULL,
                    element_id INTEGER NOT NULL,
                    PRIMARY KEY (monster_id, element_id),
                    FOREIGN KEY (monster_id) REFERENCES MONSTER(monster_id),
                    FOREIGN KEY (element_id) REFERENCES ELEMENT(element_id)
                );
                """;

        String monsterGenerationTable = """
                CREATE TABLE IF NOT EXISTS MONSTER_GENERATION (
                    monster_id INTEGER NOT NULL,
                    generation_id INTEGER NOT NULL,
                    PRIMARY KEY (monster_id, generation_id),
                    FOREIGN KEY (monster_id) REFERENCES MONSTER(monster_id),
                    FOREIGN KEY (generation_id) REFERENCES GENERATION(generation_id)
                );
                """;

        String monsterRelatedTable = """
                CREATE TABLE IF NOT EXISTS MONSTER_RELATED (
                    monster_id INTEGER NOT NULL,
                    related_monster_id INTEGER NOT NULL,
                    PRIMARY KEY (monster_id, related_monster_id),
                    FOREIGN KEY (monster_id) REFERENCES MONSTER(monster_id),
                    FOREIGN KEY (related_monster_id) REFERENCES MONSTER(monster_id)
                );
                """;

        try (Connection connection = Database.connect();
             Statement statement = connection.createStatement()) {

            statement.execute(categoryTable);
            statement.execute(elementTable);
            statement.execute(generationTable);
            statement.execute(monsterTable);
            statement.execute(monsterElementTable);
            statement.execute(monsterGenerationTable);
            statement.execute(monsterRelatedTable);

            System.out.println("Datenbanktabellen wurden erfolgreich erstellt.");

        } catch (Exception e) {
            System.out.println("Fehler beim Erstellen der Tabellen.");
            e.printStackTrace();
        }

    }

    public static void insertCategories() {

        String sql = """
            INSERT OR IGNORE INTO CATEGORY (category_id, name)
            VALUES (?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            for (Category category : Category.values()) {

                preparedStatement.setInt(1, category.getId());
                preparedStatement.setString(2, category.getName());

                preparedStatement.executeUpdate();
            }

            System.out.println("Kategorien wurden eingefügt.");

        } catch (Exception e) {
            System.out.println("Fehler beim Einfügen der Kategorien.");
            e.printStackTrace();
        }
    }

    public static void insertElements() {

        String sql = """
            INSERT OR IGNORE INTO ELEMENT (element_id, name)
            VALUES (?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            for (Element element : Element.values()) {

                preparedStatement.setInt(1, element.getId());
                preparedStatement.setString(2, element.getName());

                preparedStatement.executeUpdate();
            }

            System.out.println("Elemente wurden eingefügt.");

        } catch (Exception e) {
            System.out.println("Fehler beim Einfügen der Elemente.");
            e.printStackTrace();
        }
    }

    public static void insertGenerations() {

        String sql = """
            INSERT OR IGNORE INTO GENERATION (generation_id, name)
            VALUES (?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            for (Generation generation : Generation.values()) {

                preparedStatement.setInt(1, generation.getId());
                preparedStatement.setString(2, generation.getName());

                preparedStatement.executeUpdate();
            }

            System.out.println("Generationen wurden eingefügt.");

        } catch (Exception e) {
            System.out.println("Fehler beim Einfügen der Generationen.");
            e.printStackTrace();
        }
    }

    public static void insertMonsters() {

        String sql = """
            INSERT OR IGNORE INTO MONSTER
            (monster_id, name, category_id)
            VALUES (?, ?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            var monsterListe = MonsterData.getMonsterListe();

            for (Monster monster : monsterListe) {

                // Monster ohne gültige Kategorie überspringen
                if (monster.getCategory() == null) {
                    System.out.println(
                            "Überspringe Monster ohne Kategorie: "
                                    + monster.getName()
                    );
                    continue;
                }

                preparedStatement.setInt(
                        1,
                        monster.getMonsterId()
                );

                preparedStatement.setString(
                        2,
                        monster.getName()
                );

                preparedStatement.setInt(
                        3,
                        monster.getCategory().getId()
                );

                preparedStatement.executeUpdate();
            }

            System.out.println("Monster wurden eingefügt.");

        } catch (Exception e) {

            System.out.println(
                    "Fehler beim Einfügen der Monster."
            );

            e.printStackTrace();
        }
    }

    public static void insertMonsterGenerations() {

        String sql = """
            INSERT OR IGNORE INTO MONSTER_GENERATION
            (monster_id, generation_id)
            VALUES (?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            var monsterListe = MonsterData.getMonsterListe();

            for (Monster monster : monsterListe) {

                if (monster.getCategory() == null) {
                    continue;
                }

                for (Generation generation : monster.getGenerations()) {

                    preparedStatement.setInt(
                            1,
                            monster.getMonsterId()
                    );

                    preparedStatement.setInt(
                            2,
                            generation.getId()
                    );

                    preparedStatement.executeUpdate();
                }
            }

            System.out.println(
                    "Monster-Generationen wurden eingefügt."
            );

        } catch (Exception e) {

            System.out.println(
                    "Fehler beim Einfügen der Monster-Generationen."
            );

            e.printStackTrace();
        }
    }

    public static void insertMonsterElements() {

        String sql = """
            INSERT OR IGNORE INTO MONSTER_ELEMENT
            (monster_id, element_id)
            VALUES (?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            var monsterListe = MonsterData.getMonsterListe();

            for (Monster monster : monsterListe) {

                if (monster.getCategory() == null) {
                    continue;
                }

                for (Element element : monster.getElements()) {

                    preparedStatement.setInt(
                            1,
                            monster.getMonsterId()
                    );

                    preparedStatement.setInt(
                            2,
                            element.getId()
                    );

                    preparedStatement.executeUpdate();
                }
            }

            System.out.println(
                    "Monster-Elemente wurden eingefügt."
            );

        } catch (Exception e) {

            System.out.println(
                    "Fehler beim Einfügen der Monster-Elemente."
            );

            e.printStackTrace();
        }
    }

    public static void insertRelatedMonsters() {

        String sql = """
            INSERT OR IGNORE INTO MONSTER_RELATED
            (monster_id, related_monster_id)
            VALUES (?, ?)
            """;

        try (Connection connection = Database.connect();
             var preparedStatement = connection.prepareStatement(sql)) {

            var monsterListe = MonsterData.getMonsterListe();

            for (Monster monster : monsterListe) {

                if (monster.getCategory() == null) {
                    continue;
                }

                for (int relatedMonsterId : monster.getRelatedMonsterIds()) {

                    preparedStatement.setInt(
                            1,
                            monster.getMonsterId()
                    );

                    preparedStatement.setInt(
                            2,
                            relatedMonsterId
                    );

                    preparedStatement.executeUpdate();
                }
            }

            System.out.println(
                    "Verwandte Monster wurden eingefügt."
            );

        } catch (Exception e) {

            System.out.println(
                    "Fehler beim Einfügen der verwandten Monster."
            );

            e.printStackTrace();
        }
    }

}