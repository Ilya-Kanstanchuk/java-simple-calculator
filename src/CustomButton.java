import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CustomButton extends JButton {
    protected String[] operations;
    protected JTextField display;
    protected String buttonText;

    public CustomButton(String[] operations, JTextField display, String buttonText)
    {
        this.operations = operations;
        this.display = display;
        this.buttonText = buttonText;
        setFont(new Font("Arial", Font.BOLD, 14));
    }

}
