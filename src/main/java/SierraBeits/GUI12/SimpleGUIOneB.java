package SierraBeits.GUI12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIOneB implements ActionListener {
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;
    JButton buttonFive;
    JFrame frame;

//    public static void main(String[] args) {
//        SimpleGUIOneB gui = new SimpleGUIOneB();
//        gui.go();
//    }

    public void go(){
        frame = new JFrame();
        buttonOne = new JButton("north");
        buttonTwo = new JButton("south");
        buttonThree = new JButton("center");
        buttonFour = new JButton("west");
        buttonFive = new JButton("east");

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);

        frame.getContentPane().add(BorderLayout.NORTH,buttonOne);
        frame.getContentPane().add(BorderLayout.SOUTH,buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER,buttonThree);
        frame.getContentPane().add(BorderLayout.WEST,buttonFour);
        frame.getContentPane().add(BorderLayout.EAST,buttonFive);
//        frame.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }



    public void actionPerformed(ActionEvent event){
        buttonOne.setText("Fuck you");
    }
}
