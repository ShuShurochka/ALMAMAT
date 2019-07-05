import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondForm {
    JPanel panel;
    private JCheckBox checkBox2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox3;
    private JButton ОКButton;

    public SecondForm() {
        ОКButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2.isSelected() && !checkBox1.isSelected() && !checkBox3.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Мухтар доволен.");
                } else {
                    JOptionPane.showMessageDialog(null, "Мухтар не доволен.");
                }
            }
        });
    }
}
