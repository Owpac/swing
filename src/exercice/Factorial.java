package exercice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import configuration.Base;

public class Factorial extends JFrame implements ActionListener {

    private int number;
    private JTextField input;
    private JButton execute;

    public Factorial() {
        super();

        //Frame's configuration
        Base.frame( this, "Exercice 5 : Factorielle", 400, true );

        //Panel's initialisation
        JPanel panel = new JPanel();

        //Input configuration
        this.input = new JTextField();
        this.input.setPreferredSize( new Dimension( this.getWidth() - 20, 40 ) );
        this.input.setHorizontalAlignment( JTextField.CENTER );
        panel.add( this.input );

        //Button configuration
        this.execute = new JButton( "Calculer" );
        this.execute.addActionListener( this );
        panel.add( this.execute );

        this.setContentPane( panel );
        this.setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        //Securisation for Integer.parseInt (if this is letters in the input instead of numbers)
        try {
            int number = Integer.parseInt( this.input.getText() );
            if (source == this.execute) {
                if (number < 17 && number > 1) {
                    int resultat = 1;
                    for (int i = 1; i < number + 1; i++) {
                        resultat *= i;
                    }
                    JOptionPane.showMessageDialog(
                            null,
                            "Le factorielle de " + this.input.getText() + " = " + resultat );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Erreur : nombre saisi incorrect, le nombre doit etre entre 1 et 17.",
                            "Erreur",
                            JOptionPane.ERROR_MESSAGE );
                }
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erreur : saisi incorrect.",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE );
        }
    }
}
