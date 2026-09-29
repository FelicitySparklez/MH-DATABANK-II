import java.sql.Connection;

public class DatabaseTest {

    public static void main(String[] args) {

        try (Connection connection = Database.connect()) {

            System.out.println("SQLite-Verbindung erfolgreich!");

        } catch (Exception e) {

            System.out.println("Fehler bei der Datenbankverbindung!");
            e.printStackTrace();
        }
    }
}