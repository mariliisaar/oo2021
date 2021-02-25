import java.util.ArrayList;

public class World {
    private int width;
    private int height;

    private GameCharacter gameCharacter;
    private ArrayList<GameCharacter> characters;
    private ArrayList<Item> items;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addCharacters(ArrayList<GameCharacter> c) {
        this.characters = c;
    }

    public void addItems(ArrayList<Item> i) {
        this.items = i;
    }

    public void render() {
        char symbol;

        for (int y = 0; y <= height; y++) {
            for (int x = 0; x <= width; x++) {
                if (y == 0 || y == height) {
                    symbol = '-';
                } else if (x == 0 || x == width) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }

                for (Item i : items) {
                    if (i.isVisible && i.getXY()[0] == x && i.getXY()[1] == y) {
                        symbol = 'x';
                    }
                }

                for (GameCharacter c : characters) {
                    if (c.isVisible && c.x == x && c.y == y) {
                        symbol = c.getSymbol();
                    }
                }

                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}
