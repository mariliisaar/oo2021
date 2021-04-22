public abstract class WorldObject {
    public int x;
    public int y;

    public String name;
    public char symbol;

    public WorldObject(int x, int y, String name, char symbol) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.symbol = symbol;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public abstract String getDefinition();
}
