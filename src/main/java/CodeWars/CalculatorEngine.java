package CodeWars;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    Calculator parent;
    char selectedArithmeticAction = ' ';
    double currentResult = 0;

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickButton = (JButton) e.getSource();
        String displayFieldText = parent.mainDisplayFieldText.getText();
        double displayValue = 0;

        if (!"".equals(displayFieldText)) {
            try {
                displayValue = Double.parseDouble(displayFieldText);
            }catch (NumberFormatException e1){
                javax.swing.JOptionPane.showConfirmDialog(null,"Input number beatch","Wrong input", JOptionPane.PLAIN_MESSAGE);
                return;
            }

        }

        Object src = e.getSource();

        if (src == parent.buttonPlus) {
            selectedArithmeticAction = '+';
            currentResult = displayValue;
            parent.mainDisplayFieldText.setText("");
        }
        else if (src == parent.buttonMinus) {
            selectedArithmeticAction = '-';
            currentResult = displayValue;
            parent.mainDisplayFieldText.setText("");
        }
        else if (src == parent.buttonDivide) {
            selectedArithmeticAction = '/';
                currentResult = displayValue;
                parent.mainDisplayFieldText.setText("");
        }
        else if (src == parent.buttonMultiply) {
            selectedArithmeticAction = '*';
            currentResult = displayValue;
            parent.mainDisplayFieldText.setText("");
        }
        else if (src == parent.buttonEqual) {
            if (selectedArithmeticAction == '+') {
                currentResult += displayValue;
                parent.mainDisplayFieldText.setText("" + currentResult);
            }
            else if (selectedArithmeticAction == '-') {
                currentResult -= displayValue;
                parent.mainDisplayFieldText.setText("" + currentResult);
            }
            else if (selectedArithmeticAction == '/' ) {
                if (displayValue == 0){
                    parent.mainDisplayFieldText.setText("Divide by zero is wrong!!!");
                }else {
                    currentResult /= displayValue;
                    parent.mainDisplayFieldText.setText("" + currentResult);
                }
            }
            else if (selectedArithmeticAction == '*') {
                currentResult *= displayValue;
                parent.mainDisplayFieldText.setText("" + currentResult);
            }
        } else {
            String clickedButtonLabel = clickButton.getText();
            parent.mainDisplayFieldText.setText(displayFieldText + clickedButtonLabel);
        }

    }
}
