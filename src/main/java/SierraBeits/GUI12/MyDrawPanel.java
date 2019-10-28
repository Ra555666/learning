package SierraBeits.GUI12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        Random random = new Random();
        Graphics2D g2d = (Graphics2D)g;

        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        Color startColor = new Color(red,green,blue);

        red = random.nextInt(255);
        green = random.nextInt(255);
        blue = random.nextInt(255);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }


}
