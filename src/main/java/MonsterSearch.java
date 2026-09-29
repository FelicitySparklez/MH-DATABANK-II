import java.lang.reflect.Array;
import java.util.ArrayList;

public class MonsterSearch {

    // ========================================
    // Suche nach ID
    // ========================================

    public static Monster searchById(
            ArrayList<Monster> monsterListe,
            int id) {

        for (Monster monster : monsterListe) {

            if (monster.getMonsterId() == id) {
                return monster;
            }
        }

        return null;
    }

    // ========================================
    // Suche nach Name
    // ========================================

    public static Monster searchByName(
            ArrayList<Monster> monsterListe,
            String name) {

        for (Monster monster : monsterListe) {

            if (monster.getName().equalsIgnoreCase(name)) {
                return monster;
            }
        }

        return null;
    }

    // ========================================
    // Suche nach Kategorie
    // ========================================

    public static ArrayList<Monster> searchByCategory(
            ArrayList<Monster> monsterListe,
            int categoryId) {

        ArrayList<Monster> ergebnis = new ArrayList<>();

        for (Monster monster : monsterListe) {

            if (monster.getCategory() !=null &&
                    monster.getCategory().getId() == categoryId) {

                ergebnis.add(monster);
            }
        }

        return ergebnis;
    }

    // ========================================
    // Suche nach Element
    // ========================================

    public static ArrayList<Monster> searchByElement(
            ArrayList<Monster> monsterListe,
            int elementId) {

        ArrayList<Monster> ergebnis = new ArrayList<>();

        for (Monster monster : monsterListe) {

            for (Element element : monster.getElements()) {

                if (element.getId() == elementId) {

                    ergebnis.add(monster);

                    break;
                }
            }
        }

        return ergebnis;
    }

    // ========================================
    // Suche nach Generation
    // ========================================

    public static ArrayList<Monster> searchByGeneration(
            ArrayList<Monster> monsterListe, int generationId) {

        ArrayList<Monster> ergebnis = new ArrayList<>();

        for (Monster monster : monsterListe) {

            for (Generation generation : monster.getGenerations()) {

                if (generation.getId() == generationId) {
                    ergebnis.add(monster);
                    break;
                }
            }
        }

        return ergebnis;
    }
}
