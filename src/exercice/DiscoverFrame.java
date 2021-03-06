package exercice;

import javax.swing.*;
import java.awt.*;

import configuration.Base;

public class DiscoverFrame extends JFrame {
    public DiscoverFrame() {
        super();

        //Frame's configuration
        Base.frame( this,"Exercice 2 : A la découverte de nouveaux composants", 400, true);

        //Panel's initialisation
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel container = new JPanel();

        //Button's configuration
        JButton button = new JButton("Bouton inoperant");
        button.setToolTipText( "Ce bouton est inoperant." );
        button.setEnabled( false );
        button.setForeground( Color.YELLOW );
        button.setBackground( Color.GRAY );
        row1.add(button);

        //TextField's configuration
        JTextField textField = new JTextField( "Ceci est un TextField non editable" );
        textField.setEditable( false );
        textField.setPreferredSize( new Dimension( this.getWidth()-20,40 ));
        textField.setHorizontalAlignment(JTextField.CENTER);
        row2.add(textField);

        //TextArea's configuration
        JTextArea textArea = new JTextArea( "Ceci est un TextArea" );
        textArea.setPreferredSize( new Dimension( this.getWidth()-20,80 ));
        textArea.setBorder( BorderFactory.createLineBorder( Color.YELLOW, 3 ) );
        textArea.setCaretPosition( textArea.getCaretPosition() + 1 );
        row3.add(textArea);

        //Panel's configuration
        container.setLayout( new BoxLayout( container, BoxLayout.PAGE_AXIS ) );
        container.add( row1 );
        container.add( row2 );
        container.add( row3 );

        this.setContentPane( container );
        this.setVisible( true );

    }
}
