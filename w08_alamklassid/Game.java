public class Game {
    public static void main(String[] args) {
        GameCharacter char1 = new GameCharacter(4, 5, "Juku", 'J');
        GameCharacter char2 = new GameCharacter(5, 6, "Mari", 'M');

        Obstacle obs = new Obstacle(8, 8, "Rock", 'r');

        World world = new World(15, 10);

        world.worldObjects.add(char1);
        world.worldObjects.add(char2);
        world.worldObjects.add(obs);

        world.render();
        world.getDefinitions();
    }
}
