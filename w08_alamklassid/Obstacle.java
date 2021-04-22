public class Obstacle extends WorldObject {

    public Obstacle(int x, int y, String name, char symbol) {
        super(x, y, name, symbol);
    }

    @Override
    public String getDefinition() {
        return "I'm an obstacle";
    }
    
}
