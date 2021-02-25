import java.util.ArrayList;

public class GameCharacter {
    public int x;
    public int y;
    public String name;
    private char symbol;
    public boolean isVisible = true;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int strength = 5;

    private Direction direction;

    private GameCharacterType gameCharacterType;

    public GameCharacter(String name, int x, int y, char symbol, GameCharacterType gameCharacterType) {
        this.name = name;
        this.gameCharacterType = gameCharacterType;
        this.direction = Direction.RIGHT;
        this.symbol = symbol;

        this.x = x;
        this.y = y;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setDirection(Direction d, int w, int h) {
        this.direction = d;
        move(w, h);
    }

    public void move(int w, int h) {
        switch(this.direction) {
            case UP:
                if (this.y > 1) {
                    this.y--;
                } else {
                    this.y = h - 1;
                }
                break;
            case RIGHT:
                if (this.x < w - 1) {
                    this.x++;
                } else {
                    this.x = 1;
                }
                break;
            case DOWN:
                if (this.y < h - 1) {
                    this.y++;
                } else {
                    this.y = 1;
                }
                break;
            case LEFT:
                if (this.x > 1) {
                    this.x--;
                } else {
                    this.x = w - 1;
                }
                break;
            default:
                break;
        }
    }

    public void moveToRandom(int w, int h) {
        this.x = (int)(Math.random() * w - 1) + 1;
        this.y = (int)(Math.random() * h - 1) + 1;
    }

    public void addToInventory(Item i) {
        if (this.inventory.size() < this.strength) {
            inventory.add(i);
            System.out.println("Your current inventory:");
            for (int j = 0; j < this.getInventory().size(); j++) {
                System.out.println(j + 1 + ". " + this.getInventory(j));
            }
        } else {
            System.out.println("Inventory too full, cannot pick up item. Drop an item to pick this one up");
        }
        
    }

    public String dropItem(int i) {
        if (i - 1 <= this.inventory.size()) {
            this.inventory.remove(i - 1);
            return "Success!";
        } else {
            return "Uh-oh! An item with that number does not exist in your inventory!";
        }
    }

    public String dropItem(String a) {
        if (a.equals("all")) {
            this.inventory.clear();;
            return "Success! All items removed from inventory.";
        } else {
            return "Uh-oh! An item with that number does not exist in your inventory!";
        }
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public Item getInventory(int i) {
        return inventory.get(i);
    }

    @Override
    public String toString() {
        return "My name is " + name + " and x: " + x + " and y: " + y;
    }
}
