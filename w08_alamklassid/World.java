import java.util.ArrayList;
import java.util.List;

public class World {
    private int width;
    private int height;

    public List<WorldObject> worldObjects = new ArrayList<>();

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void getDefinitions() {
        for (WorldObject wo : worldObjects) {
            System.out.println(wo.getDefinition());
        }
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

                for (WorldObject wo : worldObjects) {
                    if (x == wo.x && y == wo.y) {
                        symbol = wo.symbol;
                    }
                }

                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}
