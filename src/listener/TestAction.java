package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TestAction extends AbstractAction {

    public TestAction(String name) {
        super( name );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Test Clic !");
        JOptionPane.showMessageDialog(
                null,
                "Test Clic !",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
