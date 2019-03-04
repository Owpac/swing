package exercice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import configuration.Base;

public class AddRemove extends JFrame implements ActionListener {

    static private int cpt = 0;

    private JButton addButton;
    private JButton resetButton;
    private ArrayList<JButton> listButton;

    public AddRemove() {
        super();

        //Attribute's initiaisation
        this.listButton = new ArrayList<>();

        //Frame's configuration
        Base.frame( this,"Exercice 4 : Auditeurs", 400, true);

        //Panel's initialisation
        JPanel panel = new JPanel();

        //Add Button configuration
        this.addButton = new JButton( "Add" );
        this.addButton.addActionListener( this );
        panel.add( this.addButton );

        //Reset Button configuration
        this.resetButton = new JButton( "Reset" );
        this.resetButton.addActionListener( this );
        panel.add( this.resetButton );

        this.setContentPane( panel );
        this.setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == this.addButton) {

            //We create one button
            cpt++;
            JButton button = new JButton( "Boutton " + cpt );
            button.addActionListener( this );
            this.listButton.add( button );
            this.getContentPane().add( button );
            this.setContentPane( this.getContentPane() );

        } else if (source == this.resetButton) {

            //We remove all created button with the Add button
            for (JButton button : listButton) {
                this.getContentPane().remove( button );
            }

            cpt = 0;
            this.listButton.clear();
            this.setContentPane( this.getContentPane() );

        } else {

            //We remove only one button
            this.getContentPane().remove( source );
            this.listButton.remove( source );
            this.setContentPane( this.getContentPane() );

        }
    }
}
