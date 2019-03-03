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

        //Frame's configurations
        Base.frame( this,"Exercice 4 : Auditeurs", 400, true);

        this.listButton = new ArrayList<>();

        //Panel's configurations
        JPanel panel = new JPanel();

        //Test Button configurations
        this.addButton = new JButton( "Add" );
        this.addButton.addActionListener( this );
        panel.add( this.addButton );

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

            cpt++;
            JButton button = new JButton( "Boutton " + cpt );
            button.addActionListener( this );
            this.listButton.add( button );
            this.getContentPane().add( button );
            this.setContentPane( this.getContentPane() );

        } else if (source == this.resetButton) {

            for (JButton button : listButton) {
                cpt--;
                this.getContentPane().remove( button );
            }
            this.listButton.clear();
            this.setContentPane( this.getContentPane() );

        } else {

            this.getContentPane().remove( source );
            this.listButton.remove( source );
            this.setContentPane( this.getContentPane() );

        }
    }
}
