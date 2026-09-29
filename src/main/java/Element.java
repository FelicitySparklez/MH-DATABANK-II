public enum Element {
    NONE(0, "None"),
    FIRE(1, "Fire"),
    WATER(2, "Water"),
    THUNDER(3, "Thunder"),
    ICE(4, "Ice"),
    DRAGON(5, "Dragon"),
    POISON(6,"Poison");
    // "Blast" und "Bleed" usw. als neue klasse "Ailments" einfügen//
    // Elemente die nur unter bestimmten voraussetzungen vorhandend sind (z.b. Arzuros im wasser oder schnee)


    private final int id;
    private final String name;

    Element(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Element getById(int id) {

        for (Element element : Element.values()) {

            if (element.getId() == id) {
                return element;
            }
        }

        return null;
    }

    public static void showAll() {

        for (Element element : Element.values()) {

            System.out.println(
                    "[" + element.getId() + "] "
                            + element.getName()
            );
        }
    }

}
