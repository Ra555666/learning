package SierraBeits.Swing13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import static java.awt.BorderLayout.NORTH;

public class TextAreaOne implements ActionListener, ItemListener {
    JTextArea text;
    int count = 0;
    JCheckBox check;

//    public static void main(String[] args) {
//        TextAreaOne gui = new TextAreaOne();
//
//        gui.go();
//    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just click me");
        check = new JCheckBox("Goes to 12");

        check.addItemListener(this);
        button.addActionListener(this);
        text = new JTextArea(10,20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);
        frame.getContentPane().add(NORTH,check);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        check.setSelected(false);
        frame.setSize(350,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){
        text.append("button clicked \n" + count);
        count++;
    }

    public void itemStateChanged(ItemEvent ev){
        String onOrOff = "off";
        if (check.isSelected()){
            onOrOff = "on";
        }
        System.out.println("Check box is "+ onOrOff);
    }
}
