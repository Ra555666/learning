package SierraBeits.Swing13;

import javax.swing.*;
import java.awt.*;

public class PanelOne {
//    public static void main(String[] args) {
//        PanelOne gui = new PanelOne();
//        gui.go();
//    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBackground(Color.black);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Click me");
        JButton button2 = new JButton("Click me too");
        JButton button3 = new JButton("And me");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        frame.pack();
        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
