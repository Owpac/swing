package exercice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import configuration.Base;

public class ActionButton extends JFrame implements ActionListener {
    private JButton testButton;
    private ArrayList<JButton> listButton;

    public ActionButton() {
        super();

        //Attribute's initiaisation
        this.listButton = new ArrayList<>();

        //Frame's configuration
        Base.frame( this,"Exercice 3 : Associer des actions aux boutons", 400, true);

        //Panel's initialisation
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel container = new JPanel();

        //Test Button configuration
        this.testButton = new JButton( "Test clic" );
        this.testButton.addActionListener( this );
        row1.add( this.testButton );

        //Title Button configuration
        for (int i = 0; i < 3; i++) {
            this.listButton.add( new JButton( "Titre : " + (i + 1) ) );
            this.listButton.get( i ).addActionListener( this );
            row2.add( this.listButton.get( i ) );
        }

        //Panel's configuration
        container.setLayout( new BoxLayout( container, BoxLayout.PAGE_AXIS ) );
        container.add( row1 );
        container.add( row2 );

        this.setContentPane( container );
        this.setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == this.testButton) {
            System.out.println( "Test Clic !" );
        } else {
            for (JButton button : listButton) {
                if (source == button) {
                    this.setTitle( button.getText() );
                }
            }
        }
    }
}
