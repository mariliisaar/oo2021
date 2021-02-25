import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;

        World world = new World(width, height);
        GameCharacter player = new GameCharacter("Marilii", 7, 2, 'C', GameCharacterType.WIZARD);
        GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WIZARD);
        GameCharacter witch = new GameCharacter("Witch", 8, 9, '?', GameCharacterType.WIZARD);

        Item gold = new Item(20, 10, "Gold", ItemType.GOLD);
        Item sting = new Item(20, 10, "Sting", ItemType.WEAPON);
        Item grass = new Item(20, 10, "Grass", ItemType.GRASS);
        Item pear = new Item(20, 10, "Pear tree", ItemType.TREE);
        Item shield = new Item(20, 10, "Shield", ItemType.SHIELD);
        Item apple = new Item(20, 10, "Apple", ItemType.FOOD);
        Item bread = new Item(20, 10, "Bread", ItemType.FOOD);

        ArrayList<GameCharacter> characters = new ArrayList<>();
        characters.add(player);
        characters.add(dummy);
        characters.add(witch);

        world.addCharacters(characters);

        ArrayList<Item> items = new ArrayList<>();
        items.add(gold);
        items.add(sting);
        items.add(grass);
        items.add(pear);
        items.add(shield);
        items.add(apple);
        items.add(bread);

        world.addItems(items);

        world.render();
        System.out.println(player);

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("end")) {
            input = scanner.nextLine().toLowerCase();

            if (input.equals("")) {
                player.move(width, height);
            } else if (input.equals("l")) {
                player.setDirection(Direction.LEFT, width, height);
            } else if (input.equals("r")) {
                player.setDirection(Direction.RIGHT, width, height);
            } else if (input.equals("u")) {
                player.setDirection(Direction.UP, width, height);
            } else if (input.equals("d")) {
                player.setDirection(Direction.DOWN, width, height);
            } else if (input.equals("i")) {
                checkInventory(player);
            } else if (input.equals("x")) {
                checkInventory(player);
                System.out.println("Type in the number of the item you'd like to discard. Type 'A' to discard everything.");
                String next = scanner.nextLine();
                int remove = -1;
                if (isInt(next)) {
                    remove = Integer.valueOf(next);
                    System.out.println(player.dropItem(remove));
                    checkInventory(player);
                } else if (next.toLowerCase().equals("a")) {
                    System.out.println(player.dropItem("all"));
                    checkInventory(player);
                } else {
                    System.out.println("Well, that didn't go to plan! Try again.");
                }
            }

            // player == witch => teleport player to a random location on the board
            if (player.x == witch.x && player.y == witch.y) {
                player.moveToRandom(width, height);

                dummy.isVisible = dummy.isVisible ? false : true;
                
            }
            world.render();
            System.out.println(player);

            // pick up item?
            for (Item i : items) {
                if (player.x == i.getXY()[0] && player.y == i.getXY()[1]) {
                    System.out.println("Do you want to pick up " + i + "?");
                    if (input.equals("y")) {
                        player.addToInventory(i);
                        i.removeItem();
                    } else if (input.equals("n")) {
                        i.removeItem();
                    }
                    world.render();
                }
            }
        }
    }

    public static boolean isInt(String s) {
        if (s == null) {
            return false;
        }
        try {
            int i = Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void checkInventory(GameCharacter c) {
        ArrayList<Item> inventory = c.getInventory();
        if (inventory.size() == 0) {
            System.out.println("Inventory is empty");
        } else {
            System.out.println("Your current inventory:");
            for (int i = 0; i < c.getInventory().size(); i++) {
                System.out.println(i + 1 + ". " + c.getInventory(i));
            }
        }
    }
}
