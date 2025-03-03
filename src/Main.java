import javax.swing.*;
import java.awt.*;

public class Main {
    public static void run(final JFrame frame, final int width, final int height) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setTitle(frame.getClass().getSimpleName());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(width, height);
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        String[]op = new String[]{"", null, ""};
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        JTextField text = new JTextField(10);
        text.setEditable(false);
        frame.add(text);
        frame.add(new NumericButton(op, text, "1"));
        frame.add(new NumericButton(op, text, "2"));
        frame.add(new NumericButton(op, text, "3"));
        frame.add(new NumericButton(op, text, "4"));
        frame.add(new NumericButton(op, text, "0"));
        frame.add(new NumericButton(op, text, "."));
        frame.add(new BasicOperationButton(op, text, "+"));
        frame.add(new BasicOperationButton(op, text, "*"));
        frame.add(new BasicOperationButton(op, text, "/"));
        frame.add(new EqualsSignButton(op, text, "="));
        frame.add(new SingleOperationButton(op, text, "√"));
        frame.add(new SingleOperationButton(op, text, "+/-"));
        frame.add(new ClearButton(op, text, "C"));
        frame.add(new MemoryButton(op, text, "M+"));
        frame.add(new MemoryButton(op, text, "MR"));
        run(frame, 500, 300);
    }
}