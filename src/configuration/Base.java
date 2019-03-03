package configuration;

import javax.swing.*;

public class Base {

    /**
     * Default configuration for init a Frame.
     * @param frame The frame that we want to configure
     * @param title The title's frame
     * @param width The width's frame
     * @param height The height's frame
     * @param resizable
     */
    public static void frame(JFrame frame, String title, int width, int height, boolean resizable) {

        frame.setTitle( title );
        frame.setSize( width, height );
        frame.setLocationRelativeTo( null );
        frame.setResizable( resizable );
//        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     *
     * @param frame
     * @param title
     * @param size
     * @param resizable
     */
    public static void frame(JFrame frame, String title, int size, boolean resizable) {
        frame( frame, title, size, size, resizable );
    }
}
