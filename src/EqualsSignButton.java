/*
In  this class we create an equals sign button, that shows the result of operation
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualsSignButton extends CustomButton{

    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!operations[0].isEmpty() && !operations[1].isEmpty() && !operations[2].isEmpty())
            {
                try {
                    double res = ArithmeticOperations.basicOperations(Double.parseDouble(operations[0]), Double.parseDouble(operations[2]), operations[1]);
                    operations[0] = res + "";
                    operations[1] = null;
                    operations[2] = "";
                    display.setText(operations[0]);
                }catch (IllegalArgumentException iae)
                {
                    display.setText("ERROR");
                }
            }
        }
    };

    public EqualsSignButton(String[] operations, JTextField display, String buttonText) {
        super(operations, display, buttonText);
        setText(buttonText);
        addActionListener(al);
    }
}
