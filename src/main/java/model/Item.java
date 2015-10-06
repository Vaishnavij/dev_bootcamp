package model;

public class Item {

    private static int itemCounter = 0;

    private Integer itemId = null;
    private String name = null;

    public Item(String name) throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("Please give a valid Name to Item!");
        }
        this.name = name;
        this.itemId = ++itemCounter;
    }

    public String getName() {
        return name;
    }
}
