public class DatabaseSetupTest {

    public static void main(String[] args) {

        DatabaseSetup.createTables();

        DatabaseSetup.insertCategories();
        DatabaseSetup.insertElements();
        DatabaseSetup.insertGenerations();

        DatabaseSetup.insertMonsters();
        DatabaseSetup.insertMonsterGenerations();
        DatabaseSetup.insertMonsterElements();
        DatabaseSetup.insertRelatedMonsters();

    }
}