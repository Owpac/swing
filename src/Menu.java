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
        super();

        //Attribute's initiaisation
        this.buttons = new ArrayList<>();

        //Frame's configuration
        Base.frame( this, "Menu", 400, true );

        //If we close this frame, we close all the program
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        //Panel's connfiguration
        JPanel panel = new JPanel();
        panel.setLayout( new GridLayout( 4, 2 ) );

        //Button's configuration
        for (int i = 0; i < 7; i++) {

            //One button's name isn't a simple number (Exercice 3 Bis)
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
        JButton source = (JButton) e.getSource();
        
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
