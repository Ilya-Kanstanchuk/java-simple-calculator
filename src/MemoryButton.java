import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoryButton extends CustomButton{
    private static double storage;
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton)e.getSource()).getText();
            switch (command)
            {
                case "M+":
                    if (operations[1] == null)
                    {
                        storage += Double.parseDouble(operations[0]);
                    }
                    else if (!operations[2].isEmpty())
                    {
                        storage += Double.parseDouble(operations[2]);
                    }
                    break;
                case "M-":
                    if (!operations[0].isEmpty() && operations[1] == null)
                    {
                        storage -= Double.parseDouble(operations[0]);
                    }
                    else if (!operations[2].isEmpty())
                    {
                        storage -= Double.parseDouble(operations[2]);
                    }
                    break;
                case "MR":
                    if (operations[1] == null)
                    {
                        operations[0] = storage + "";
                        display.setText(operations[0]);
                    }
                    else
                    {
                        operations[2] = storage + "";
                        display.setText(operations[2]);
                    }
                    break;
                case "MC":
                    storage = 0;
                    break;
            }
        }
    };
    public MemoryButton(String[] operations, JTextField display, String buttonText) {
        super(operations, display, buttonText);
        setText(buttonText);
        addActionListener(al);
    }

}
