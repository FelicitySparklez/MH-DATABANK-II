import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MonsterRepository {

    public static Monster searchById(int id) {

        String sql = """
                SELECT
                    monster_id,
                    name,
                    category_id
                FROM MONSTER
                WHERE monster_id = ?
                """;

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                if (resultSet.next()) {

                    int monsterId =
                            resultSet.getInt("monster_id");

                    String name =
                            resultSet.getString("name");

                    int categoryId =
                            resultSet.getInt("category_id");

                    Monster monster = new Monster(
                            monsterId,
                            name,
                            categoryId,
                            new int[]{}
                    );

                    loadMonsterDetails(connection, monster);

                    return monster;
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Fehler bei der Monster-Suche."
            );

            e.printStackTrace();
        }

        return null;
    }

    public static Monster searchByName(String name) {

        String sql = """
            SELECT
                monster_id,
                name,
                category_id
            FROM MONSTER
            WHERE LOWER(name) = LOWER(?)
            """;

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                if (resultSet.next()) {

                    int monsterId =
                            resultSet.getInt("monster_id");

                    String monsterName =
                            resultSet.getString("name");

                    int categoryId =
                            resultSet.getInt("category_id");

                    Monster monster = new Monster(
                            monsterId,
                            monsterName,
                            categoryId,
                            new int[]{}
                    );

                    loadMonsterDetails(connection, monster);

                    return monster;
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Fehler bei der Namenssuche."
            );

            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Monster> searchByNameContains(String name) {

        ArrayList<Monster> monsterListe = new ArrayList<>();

        String sql = """
            SELECT monster_id, name, category_id
            FROM MONSTER
            WHERE LOWER(name) LIKE LOWER(?)
            ORDER BY name
            """;

        try (Connection connection = Database.connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "%" + name + "%");

            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {

                    int monsterId =
                            resultSet.getInt("monster_id");

                    String monsterName =
                            resultSet.getString("name");

                    int categoryId =
                            resultSet.getInt("category_id");

                    Monster monster = new Monster(
                            monsterId,
                            monsterName,
                            categoryId,
                            new int[]{}
                    );

                    loadMonsterDetails(
                            connection,
                            monster
                    );

                    monsterListe.add(monster);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return monsterListe;
    }

    public static java.util.ArrayList<Monster> searchByCategory(
            int categoryId) {

        java.util.ArrayList<Monster> ergebnis =
                new java.util.ArrayList<>();

        String sql = """
            SELECT
                monster_id,
                name,
                category_id
            FROM MONSTER
            WHERE category_id = ?
            ORDER BY monster_id
            """;

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, categoryId);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    int monsterId =
                            resultSet.getInt("monster_id");

                    String name =
                            resultSet.getString("name");

                    int resultCategoryId =
                            resultSet.getInt("category_id");

                    Monster monster = new Monster(
                            monsterId,
                            name,
                            resultCategoryId,
                            new int[]{}
                    );

                    loadMonsterDetails(connection, monster);

                    ergebnis.add(monster);
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Fehler bei der Kategoriensuche."
            );

            e.printStackTrace();
        }

        return ergebnis;
    }

    public static java.util.ArrayList<Monster> searchByElement(
            int elementId) {

        java.util.ArrayList<Monster> ergebnis =
                new java.util.ArrayList<>();

        String sql = """
            SELECT
                m.monster_id,
                m.name,
                m.category_id
            FROM MONSTER m
            JOIN MONSTER_ELEMENT me
                ON m.monster_id = me.monster_id
            WHERE me.element_id = ?
            ORDER BY m.monster_id
            """;

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, elementId);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    int monsterId =
                            resultSet.getInt("monster_id");

                    String name =
                            resultSet.getString("name");

                    int categoryId =
                            resultSet.getInt("category_id");

                    Monster monster = new Monster(
                            monsterId,
                            name,
                            categoryId,
                            new int[]{}
                    );

                    loadMonsterDetails(connection, monster);

                    ergebnis.add(monster);
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Fehler bei der Elementsuche."
            );

            e.printStackTrace();
        }

        return ergebnis;
    }

    public static java.util.ArrayList<Monster> searchByGeneration(
            int generationId) {

        java.util.ArrayList<Monster> ergebnis =
                new java.util.ArrayList<>();

        String sql = """
            SELECT
                m.monster_id,
                m.name,
                m.category_id
            FROM MONSTER m
            JOIN MONSTER_GENERATION mg
                ON m.monster_id = mg.monster_id
            WHERE mg.generation_id = ?
            ORDER BY m.monster_id
            """;

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, generationId);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    int monsterId =
                            resultSet.getInt("monster_id");

                    String name =
                            resultSet.getString("name");

                    int categoryId =
                            resultSet.getInt("category_id");

                    Monster monster = new Monster(
                            monsterId,
                            name,
                            categoryId,
                            new int[]{}
                    );

                    loadMonsterDetails(connection, monster);

                    ergebnis.add(monster);
                }
            }

        } catch (Exception e) {

            System.out.println(
                    "Fehler bei der Generationssuche."
            );

            e.printStackTrace();
        }

        return ergebnis;
    }

    private static void loadMonsterDetails(
            Connection connection,
            Monster monster) {

        // Generationen laden
        String generationSql = """
            SELECT generation_id
            FROM MONSTER_GENERATION
            WHERE monster_id = ?
            ORDER BY generation_id
            """;

        try (PreparedStatement statement =
                     connection.prepareStatement(generationSql)) {

            statement.setInt(1, monster.getMonsterId());

            try (ResultSet resultSet =
                         statement.executeQuery()) {

                while (resultSet.next()) {

                    int generationId =
                            resultSet.getInt("generation_id");

                    Generation generation =
                            Generation.getById(generationId);

                    if (generation != null) {
                        monster.getGenerations().add(generation);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        // Elemente laden
        String elementSql = """
            SELECT element_id
            FROM MONSTER_ELEMENT
            WHERE monster_id = ?
            ORDER BY element_id
            """;

        try (PreparedStatement statement =
                     connection.prepareStatement(elementSql)) {

            statement.setInt(1, monster.getMonsterId());

            try (ResultSet resultSet =
                         statement.executeQuery()) {

                while (resultSet.next()) {

                    int elementId =
                            resultSet.getInt("element_id");

                    Element element =
                            Element.getById(elementId);

                    if (element != null) {
                        monster.getElements().add(element);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        // Verwandte Monster laden
        String relatedSql = """
            SELECT related_monster_id
            FROM MONSTER_RELATED
            WHERE monster_id = ?
            ORDER BY related_monster_id
            """;

        try (PreparedStatement statement =
                     connection.prepareStatement(relatedSql)) {

            statement.setInt(1, monster.getMonsterId());

            try (ResultSet resultSet =
                         statement.executeQuery()) {

                while (resultSet.next()) {

                    int relatedMonsterId =
                            resultSet.getInt("related_monster_id");

                    monster.addRelatedMonster(
                            relatedMonsterId
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Monster> getAllMonsters() {

        ArrayList<Monster> monsterListe = new ArrayList<>();

        String sql = """
            SELECT monster_id, name, category_id
            FROM MONSTER
            ORDER BY monster_id
            """;

        try (Connection connection = Database.connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                int monsterId = resultSet.getInt("monster_id");
                String name = resultSet.getString("name");
                int categoryId = resultSet.getInt("category_id");

                Monster monster = new Monster(
                        monsterId,
                        name,
                        categoryId,
                        new int[]{}
                );

                loadMonsterDetails(connection, monster);

                monsterListe.add(monster);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return monsterListe;
    }

}