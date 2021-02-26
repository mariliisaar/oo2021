import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;


public class MyHouse {
    public static void main(String[] args) throws IOException {
        int width = 100;
        int height = 100;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.drawString("My House", 20, 20);

        g.setColor(Color.BLUE);
        g.drawLine(25, 50, 50, 25);
        g.drawLine(50, 25, 75, 50);
        g.fillRect(25, 50, 50, 50);
        g.setColor(Color.WHITE);
        g.fillRect(34, 65, 8, 8);
        g.fillRect(58, 65, 8, 8);
        g.fillRect(45, 85, 10, 15);

        ImageIO.write(picture, "png", new File("house.png"));
    }
}
