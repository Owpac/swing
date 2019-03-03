import ageIHM.AgeCalculator;
import configuration.Base;
import exercice.*;
import exercice.AbstractButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame implements ActionListener {

    ArrayList<JButton> buttons;

    public Menu() {
        Base.frame( this, "Menu", 400, true );

        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        this.buttons = new ArrayList<>();

        JPanel panel = new JPanel();
        panel.setLayout( new GridLayout( 4, 2 ) );

        for (int i = 0; i < 7; i++) {

            if (i < 3) {
                this.buttons.add( new JButton( "Exercice " + (i + 1) ) );
            } else if (i == 3) {
                this.buttons.add( new JButton( "Exercice 3 Bis" ) );
            } else {
                this.buttons.add( new JButton( "Exercice " + i ) );
            }

            this.buttons.get( i ).addActionListener( this );
            panel.add( this.buttons.get( i ) );
        }

        this.setContentPane( panel );
        this.setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == this.buttons.get( 0 )) {
            new SimpleFrame();
        } else if (source == this.buttons.get( 1 )) {
            new DiscoverFrame();
        } else if (source == this.buttons.get( 2 )) {
            new ActionButton();
        } else if (source == this.buttons.get( 3 )) {
            new AbstractButton();
        } else if (source == this.buttons.get( 4 )) {
            new AddRemove();
        } else if (source == this.buttons.get( 5 )) {
            new Factorial();
        } else if (source == this.buttons.get( 6 )) {
            new AgeCalculator();
        }
    }
}
