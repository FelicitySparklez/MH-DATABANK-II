import java.util.ArrayList;

public class DatabaseMonsterTest {

    public static void main(String[] args) {

        System.out.println("=== NAME ===");

        Monster monster =
                MonsterRepository.searchByName("Rathalos");

        if (monster != null) {
            monster.showDetails(
                    MonsterData.getMonsterListe()
            );
        }


        System.out.println();
        System.out.println("=== KATEGORIE ===");

        ArrayList<Monster> kategorie =
                MonsterRepository.searchByCategory(2);

        System.out.println(
                "Gefundene Monster: "
                        + kategorie.size()
        );

        for (Monster m : kategorie) {
            System.out.println(
                    "[" + m.getMonsterId() + "] "
                            + m.getName()
            );
        }


        System.out.println();
        System.out.println("=== ELEMENT ===");

        ArrayList<Monster> element =
                MonsterRepository.searchByElement(1);

        System.out.println(
                "Gefundene Monster: "
                        + element.size()
        );

        for (Monster m : element) {
            System.out.println(
                    "[" + m.getMonsterId() + "] "
                            + m.getName()
            );
        }


        System.out.println();
        System.out.println("=== GENERATION ===");

        ArrayList<Monster> generation =
                MonsterRepository.searchByGeneration(5);

        System.out.println(
                "Gefundene Monster: "
                        + generation.size()
        );

        for (Monster m : generation) {
            System.out.println(
                    "[" + m.getMonsterId() + "] "
                            + m.getName()
            );
        }
    }
}