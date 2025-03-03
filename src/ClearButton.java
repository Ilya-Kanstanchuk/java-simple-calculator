/*
In this class we create button that clean all the information from the text field
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButton extends CustomButton{

    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            operations[0] = "";
            operations[1] = null;
            operations[2] = "";
            display.setText("");
        }
    };
    public ClearButton(String[] operations, JTextField display, String buttonText) {
        super(operations, display, buttonText);
        setText(buttonText);
        addActionListener(al);
    }
}
