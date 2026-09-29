import java.util.ArrayList;

public class Monster {

    private int monsterId;
    private String name;
    private Category category;
    private ArrayList<Generation> generations;
    private ArrayList<Element> elements;

    private ArrayList<Integer> relatedMonsterIds;


    public Monster(
            int monsterId,
            String name,
            int categoryId,
            int[]generationIds,
            int... elementIds) {

        this.monsterId = monsterId;
        this.name = name;
        this.category = Category.getById(categoryId);

        this.generations = new ArrayList<>();
        for (int generationId : generationIds) {
            Generation generation = Generation.getById(generationId);

            if (generation != null) {
                this.generations.add(generation);
            }
        }

        this.elements = new ArrayList<>();

        for (int elementId : elementIds) {

            Element element = Element.getById(elementId);

            if (element != null) {
                this.elements.add(element);
            }
        }


        this.relatedMonsterIds = new ArrayList<>();


    }

    public int getMonsterId() {
        return monsterId;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public ArrayList<Generation> getGenerations() {
        return generations;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    //----
    public void addRelatedMonster(int monsterId) {

        if (!relatedMonsterIds.contains(monsterId)) {
            relatedMonsterIds.add(monsterId);
        }
    }

    public ArrayList<Integer> getRelatedMonsterIds() {
        return relatedMonsterIds;
    }
//----




    // ========================================
    // Monster anzeigen
    // ========================================

    public void showDetails(ArrayList<Monster> monsterListe) {

        System.out.println();
        System.out.println("Monster gefunden:");
        System.out.println();

        System.out.println("ID: " + monsterId);
        System.out.println("Name: " + name);
        System.out.println("Kategorie: " + category.getName());

        for (Generation generation : generations) {
            System.out.println("Generation: " + generation.getName());
        }

        for (Element element : elements) {

            System.out.println(
                    "Element: " + element.getName()
            );
        }
//-----------------------------------------------
        System.out.println();
        System.out.println("Related Monster:");

        if (relatedMonsterIds.isEmpty()) {

            System.out.println("- Keine");

        } else {

            for (int relatedId : relatedMonsterIds) {

                for (Monster monster : monsterListe) {

                    if (monster.getMonsterId() == relatedId) {

                        System.out.println("- " + monster.getName());
                        break;
                    }
                }
            }
        }
//------------------------------------------------
        System.out.println();
    }
}
