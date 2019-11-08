package CodeWars;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JPanel windowContent;
    JFormattedTextField mainDisplayFieldText;
    private JButton[] buttonsWithNumbers;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivide;
    JButton buttonMultiply;
    private JPanel numberButtonsPanel;
    private JPanel arithmeticalOperators;

    Calculator() {
        windowContent = new JPanel();

        BorderLayout borderOne = new BorderLayout();
        windowContent.setLayout(borderOne);
        mainDisplayFieldText = new JFormattedTextField();
        mainDisplayFieldText.setHorizontalAlignment(SwingConstants.RIGHT);
        windowContent.add("North", mainDisplayFieldText);

        buttonsWithNumbers = new JButton[10];
        for (int i = 0; i < buttonsWithNumbers.length; i++) {
            String buttonName = Integer.toString(i);
            buttonsWithNumbers[i] = new JButton(buttonName);
        }
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonMinus = new JButton("-");
        buttonPlus = new JButton("+");

        numberButtonsPanel = new JPanel();
        GridLayout gridOne = new GridLayout(4, 3);
        numberButtonsPanel.setLayout(gridOne);

        arithmeticalOperators = new JPanel();
        GridLayout arithmeticalGrid = new GridLayout(4, 1);
        arithmeticalOperators.setLayout(arithmeticalGrid);

        for (JButton button : buttonsWithNumbers) {
            numberButtonsPanel.add(button);
        }

        numberButtonsPanel.add(buttonPoint);
        numberButtonsPanel.add(buttonEqual);

        arithmeticalOperators.add(buttonDivide);
        arithmeticalOperators.add(buttonMultiply);
        arithmeticalOperators.add(buttonMinus);
        arithmeticalOperators.add(buttonPlus);

        windowContent.add("Center", numberButtonsPanel);
        windowContent.add("East", arithmeticalOperators);

        JFrame mainFrame;
        mainFrame = new JFrame("CodeWars.Calculator");
        mainFrame.setContentPane(windowContent);

        mainFrame.pack();
        mainFrame.setVisible(true);

        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        for (JButton button : buttonsWithNumbers) {
            button.addActionListener(calculatorEngine);
        }
        buttonPoint.addActionListener(calculatorEngine);
        buttonMultiply.addActionListener(calculatorEngine);
        buttonDivide.addActionListener(calculatorEngine);
        buttonMinus.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);
        buttonPoint.addActionListener(calculatorEngine);
    }

//    public static void main(String[] args) {
//        CodeWars.Calculator test = new CodeWars.Calculator();
//    }

}
