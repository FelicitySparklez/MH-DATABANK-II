import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseQueryTest {

    public static void main(String[] args) {

        String sql = """
            SELECT
                m.monster_id,
                m.name,
                c.name AS category
            FROM MONSTER m
            JOIN CATEGORY c
                ON m.category_id = c.category_id
            WHERE m.monster_id = ?
        """;

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, 1);

            try (ResultSet resultSet =
                         preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    int id = resultSet.getInt("monster_id");
                    String name = resultSet.getString("name");
                    String category = resultSet.getString("category");

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Kategorie: " + category);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}