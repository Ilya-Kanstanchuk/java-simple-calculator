import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleOperationButton extends CustomButton{

    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!operations[0].isEmpty() && operations[1] == null)
            {
                try
                {
                    String sign = ((JButton)e.getSource()).getText();
                    operations[0] = "" + ArithmeticOperations.singleNumberOperation(Double.parseDouble(operations[0]), sign);
                    display.setText(operations[0]);
                }catch (IllegalArgumentException iae)
                {
                    display.setText("ERROR");
                }
            }
            else if (!operations[2].isEmpty())
            {
                try
                {
                    String sign = ((JButton)e.getSource()).getText();
                    operations[2] = "" + ArithmeticOperations.singleNumberOperation(Double.parseDouble(operations[2]), sign);
                    display.setText(operations[2]);
                }catch (IllegalArgumentException iae)
                {
                    display.setText("ERROR");
                }
            }
        }
    };
    public SingleOperationButton(String[] operations, JTextField display, String buttonText) {
        super(operations, display, buttonText);
        setText(buttonText);
        addActionListener(al);
    }
}
