package SierraBeits.GUI12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIThreeC implements ActionListener {
    private JFrame frame;
    private JButton button;

//    public static void main(String[] args) {
//        SimpleGUIThreeC gui = new SimpleGUIThreeC();
//        gui.go();
//    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        frame.repaint();
        button.setText("Do it again");

    }
}
