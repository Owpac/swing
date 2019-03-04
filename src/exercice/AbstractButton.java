package exercice;

import javax.swing.*;
import java.util.ArrayList;

import listener.TestAction;
import listener.TitleAction;
import configuration.Base;


public class AbstractButton extends JFrame {
    private JButton testButton;
    private ArrayList<JButton> listButton;

    public AbstractButton() {
        super();

        //Attribute's initiaisation
        this.listButton = new ArrayList<>();

        //Frame's configuration
        Base.frame(this, "Exercice 3 bis : Associer des actions aux boutons", 400, true);

        //Panel's initialisation
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel container = new JPanel();

        //Test Button configuration
        this.testButton = new JButton( new TestAction( "Test clic" ) );
        row1.add( this.testButton );

        //Title Button configuration
        for (int i = 0; i < 3; i++) {
            this.listButton.add( new JButton( new TitleAction( "Titre : " + (i + 1), this ) ) );
            row2.add( this.listButton.get( i ) );
        }

        //Panel's configuration
        container.setLayout( new BoxLayout( container, BoxLayout.PAGE_AXIS ) );
        container.add( row1 );
        container.add( row2 );

        this.setContentPane( container );
        this.setVisible( true );
    }
}
