package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TitleAction extends AbstractAction {

    private String name;
    private JFrame frame;


    public TitleAction(String name, JFrame frame) {
        super( name );

        this.name = name;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.frame.setTitle( this.name );
    }
}
