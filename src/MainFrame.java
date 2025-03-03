/*
In this class we create a frame with all elements like buttons and text field
 */


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextField display;
    private JPanel upperPanel;
    private JPanel lowerPanel;
    private String[]memoryLog;
    public MainFrame()
    {
        display = new JTextField(14);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        upperPanel = new JPanel();
        lowerPanel = new JPanel(new GridLayout(5, 5, 5, 5));
        memoryLog = new String[]{"", null, ""};
        upperPanel.setPreferredSize(new Dimension(300, 70));
        display.setPreferredSize(new Dimension(300, 70));
        upperPanel.add(display, BorderLayout.CENTER);
        add(upperPanel, BorderLayout.NORTH);
        lowerPanel.setPreferredSize(new Dimension(300, 250));
        lowerPanel.add(new MemoryButton(memoryLog, display, "MC"));
        lowerPanel.add(new MemoryButton(memoryLog, display, "MR"));
        lowerPanel.add(new MemoryButton(memoryLog, display, "M+"));
        lowerPanel.add(new MemoryButton(memoryLog, display, "M-"));
        lowerPanel.add(new ClearButton(memoryLog, display, "C"));
        lowerPanel.add(new NumericButton(memoryLog, display, "7"));
        lowerPanel.add(new NumericButton(memoryLog, display, "8"));
        lowerPanel.add(new NumericButton(memoryLog, display, "9"));
        lowerPanel.add(new BasicOperationButton(memoryLog, display, "/"));
        lowerPanel.add(new SingleOperationButton(memoryLog, display, "√"));
        lowerPanel.add(new NumericButton(memoryLog, display, "4"));
        lowerPanel.add(new NumericButton(memoryLog, display, "5"));
        lowerPanel.add(new NumericButton(memoryLog, display, "6"));
        lowerPanel.add(new BasicOperationButton(memoryLog, display, "*"));
        lowerPanel.add(new SingleOperationButton(memoryLog, display, "%"));
        lowerPanel.add(new NumericButton(memoryLog, display, "1"));
        lowerPanel.add(new NumericButton(memoryLog, display, "2"));
        lowerPanel.add(new NumericButton(memoryLog, display, "3"));
        lowerPanel.add(new BasicOperationButton(memoryLog, display, "-"));
        lowerPanel.add(new SingleOperationButton(memoryLog, display, "1/x"));
        lowerPanel.add(new NumericButton(memoryLog, display, "0"));
        lowerPanel.add(new NumericButton(memoryLog, display, "."));
        lowerPanel.add(new SingleOperationButton(memoryLog, display, "+/-"));
        lowerPanel.add(new BasicOperationButton(memoryLog, display, "+"));
        lowerPanel.add(new EqualsSignButton(memoryLog, display, "="));
        add(lowerPanel, BorderLayout.SOUTH);
    }

}
