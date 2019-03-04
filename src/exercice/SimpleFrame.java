package exercice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import configuration.Base;

public class SimpleFrame extends JFrame implements ActionListener {
    public SimpleFrame() {

        super();

        //Frame's configuration
        Base.frame( this,"Exercice 1 : Exemple de JFrame", 400, true);

        //Set BorderLayout to our ContentPane
        this.setLayout( new BorderLayout() );

        //Label's creation
        JLabel label = new JLabel( "Bienvenue dans l'exercice 1 !" );
        label.setHorizontalAlignment( SwingConstants.CENTER );

        //Button creation
        JButton button = new JButton( "OK" );
        button.addActionListener( this );

        //Add our label and button to the ContentPane
        this.getContentPane().add( label );
        this.getContentPane().add( button, BorderLayout.SOUTH );

        this.setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                null,
                "OK !",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}