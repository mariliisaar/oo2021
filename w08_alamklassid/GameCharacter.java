public class GameCharacter extends WorldObject {
    public GameCharacter(int x, int y, String name, char symbol) {
        super(x, y, name, symbol);
    }

    @Override
    public String getDefinition() {
        return "I'm a game character";
    }
}
