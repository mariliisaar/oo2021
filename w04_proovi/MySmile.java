import java.io.IOException;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MySmile {
    public static void main(String[] args) throws IOException{
        int width = 100;
        int height = 100;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.GREEN);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.fillArc(0, 0, width, height, 0, 360);

        g.setColor(Color.YELLOW);
        // Left eye
        g.fillOval(20, 30, 20, 20);
        g.drawArc(20, 20, 15, 5, 0, 180);

        // Right eye
        g.fillOval(60, 30, 20, 20);
        g.drawArc(60, 20, 15, 5, 0, 180);

        // Nose
        g.fillOval(45, 50, 10, 10);

        // Mouth
        g.drawArc(20, 50, 60, 30, 0, -180);
        
        


        ImageIO.write(picture, "png", new File("smile.png"));
    }
}
