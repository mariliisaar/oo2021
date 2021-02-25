public class Item {
    private int x;
    private int y;
    private ItemType type;
    private String name;
    Boolean isVisible = true;

    public Item(int w, int h, String name, ItemType type) {
        this.x = (int)(Math.random() * w - 1) + 1;
        this.y = (int)(Math.random() * h - 1) + 1;
        this.name = name;
        this.type = type;
    }

    public int[] getXY() {
        return new int[] { x, y };
    }

    public void removeItem() {
        isVisible = false;
    }

    @Override
    public String toString() {
        return "Item: " + name + " Type: " + type;
    }
}
