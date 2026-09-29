public enum Category {

    BIRD_WYVERN(1, "Bird Wyvern"),
    FLYING_WYVERN(2, "Flying Wyvern"),
    BRUTE_WYVERN(3, "Brute Wyvern"),
    FANGED_WYVERN(4, "Fanged Wyvern"),
    ELDER_DRAGON(5, "Elder Dragon"),
    PISCINE_WYVERN(6, "Piscine Wyvern"),
    LEVIATHAN(7, "Leviathan"),
    CEPHALOPOD(8, "Cephalopod"),
    TEMNOCERAN(9, "Temnoceran"),
    CONSTRUCT(10, "Construct"),
    FANGED_BEAST(11, "Fanged Beast"),
    AMPHIBIAN(12, "Amphibian");

    private final int id;
    private final String name;

    Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Category getById(int id) {

        for (Category category : Category.values()) {

            if (category.getId() == id) {
                return category;
            }
        }

        return null;
    }

    public static void showAll() {

        for (Category category : Category.values()) {

            System.out.println(
                    "[" + category.getId() + "]"
                            + category.getName()
            );
        }
    }
}

