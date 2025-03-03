import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericButton extends CustomButton{

    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (operations[1] == null)
            {
                String text = ((JButton)e.getSource()).getText();
                operations[0] += text;
                display.setText(operations[0]);
            }
            else
            {
                display.setText("");
                String text = ((JButton)e.getSource()).getText();
                operations[2] += text;
                display.setText(operations[2]);
            }
        }
    };


    public NumericButton(String[] operations, JTextField display, String buttonText) {
        super(operations, display, buttonText);
        setText(buttonText);
        addActionListener(al);
    }

}
