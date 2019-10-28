package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIOneB implements ActionListener {
    JButton button;
    JFrame frame;

    public static void main(String[] args) {
        SimpleGUIOneB gui = new SimpleGUIOneB();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
//        frame.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }



    public void actionPerformed(ActionEvent event){
        button.setText("i've been clicked!");
    }
}
