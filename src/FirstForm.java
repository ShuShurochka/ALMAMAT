import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstForm {
    JPanel panel;
    private JTextField textField;
    private JButton button;

    public FirstForm() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField.getText());
            }
        });
    }
}
