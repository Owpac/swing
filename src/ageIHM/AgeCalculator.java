package ageIHM;

import configuration.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class AgeCalculator extends JFrame implements ActionListener {

    private JTextField nameInput;
    private JTextField firstnameInput;
    private JTextField birthdayInput;
    private JButton ageButton;
    private JButton reverseButton;
    private JPanel oldPanel;

    public AgeCalculator() {

        //Frame's configurations
        Base.frame(this, "Exercice 6 : Mais quel est donc votre age?", 400, true);

        JPanel row1 = new JPanel();
        row1.setLayout( new GridLayout( 2, 2 ) );

        JLabel name = new JLabel( "Votre nom :" );
        row1.add( name );
        this.nameInput = new JTextField();
        row1.add( nameInput );

        JLabel firstname = new JLabel( "Votre prenom :" );
        row1.add( firstname );
        this.firstnameInput = new JTextField();
        row1.add( firstnameInput );


        JPanel row2 = new JPanel();
        JLabel birthday = new JLabel( "Votre annee de naissance :" );
        row2.add( birthday );
        this.birthdayInput = new JTextField( 10 );
        row2.add( birthdayInput );

        JPanel row3 = new JPanel();

        this.ageButton = new JButton( "Age?" );
        this.ageButton.addActionListener( this );
        row3.add( this.ageButton );
        this.reverseButton = new JButton( "Reverse" );
        this.reverseButton.addActionListener( this );
        row3.add( this.reverseButton );


        JPanel container = new JPanel();
        container.setLayout( new BoxLayout( container, BoxLayout.PAGE_AXIS ) );
        container.add( row1 );
        container.add( row2 );
        container.add( row3 );

        this.setContentPane( container );
        this.setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == ageButton) {

            try {

                int age = Integer.parseInt( this.birthdayInput.getText() );

                int year = Calendar.getInstance().get( Calendar.YEAR );

                if (this.oldPanel != null) {
                    this.getContentPane().remove( oldPanel );
                }

                JPanel panel = new JPanel();

                this.oldPanel = panel;

                panel.add( new JLabel( "En " + year + " vous avez " + (year - age) + " ans." ) );

                this.getContentPane().add( panel );

                this.setContentPane( this.getContentPane() );

            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(
                        null,
                        "Errorr : veuillez saisir un nombre correct.",
                        "Erreur",
                        JOptionPane.ERROR_MESSAGE );
            }

        } else if (source == reverseButton) {

            StringBuilder nameInputInverse = new StringBuilder( this.nameInput.getText() ).reverse();

            this.nameInput.setText( nameInputInverse.toString() );

            StringBuilder firstnameInputInverse = new StringBuilder( this.firstnameInput.getText() ).reverse();

            this.firstnameInput.setText( firstnameInputInverse.toString() );

            StringBuilder birthdayInputInverse = new StringBuilder( this.birthdayInput.getText() ).reverse();

            this.birthdayInput.setText( birthdayInputInverse.toString() );

        }
    }
}
