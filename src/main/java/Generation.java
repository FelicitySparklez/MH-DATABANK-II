public enum Generation {

    GENERATION_1(1, "Generation 1"),
    GENERATION_2(2, "Generation 2"),
    GENERATION_3(3, "Generation 3"),
    GENERATION_4(4, "Generation 4"),
    GENERATION_5(5, "Generation 5"),
    GENERATION_6(6, "Generation 6");

    private int id;
    private String name;

    Generation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Generation getById(int id) {

        for (Generation generation : Generation.values()) {

            if (generation.getId() == id) {
                return generation;

            }
        }

        return null;

    }

    public static void showAll() {

        for (Generation generation : Generation.values()) {

            System.out.println(
                    "[" + generation.getId() + "]"
                            + generation.getName()
            );
        }
    }
}
