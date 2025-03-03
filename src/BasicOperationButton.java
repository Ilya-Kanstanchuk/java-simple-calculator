/*
In this class we create a button that executes operations on 2 numbers
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicOperationButton extends CustomButton{
    Color basicColor = getBackground();
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!operations[0].isEmpty() && operations[2].isEmpty())
            {
                String sign = ((JButton)e.getSource()).getText();
                operations[1] = sign;
            }
            else if (!operations[2].isEmpty())
            {
                try {
                    double res = ArithmeticOperations.basicOperations(Double.parseDouble(operations[0]), Double.parseDouble(operations[2]), operations[1]);
                    operations[0] = res + "";
                    String sign = ((JButton)e.getSource()).getText();
                    operations[1] = sign;
                    operations[2] = "";
                    display.setText(operations[0]);
                }catch (IllegalArgumentException iae)
                {
                    display.setText("ERROR");
                }
            }
        }
    };
    FocusListener fl = new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            ((JButton)e.getSource()).setBackground(Color.ORANGE);
        }

        @Override
        public void focusLost(FocusEvent e) {
            ((JButton)e.getSource()).setBackground(basicColor);
        }
    };

    public BasicOperationButton(String[] operations, JTextField display, String buttonText) {
        super(operations, display, buttonText);
        setText(buttonText);
        addActionListener(al);
        addFocusListener(fl);
    }
}
