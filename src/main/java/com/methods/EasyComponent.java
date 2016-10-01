package main.java.com.methods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel on 9/25/2016.
 */
public class EasyComponent
{
    /**
     * Creates a JLabel and adds it yo your frame.
     * @param text The text for the label.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param frame The window to add the label to.
     */
    public EasyComponent(Component component, String text, Icon icon, int horizantalAlignment, int verticalAlignment, int layout, JFrame frame)
    {
        JLabel label = new JLabel(text);




        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label, BorderLayout.NORTH);
    }
}
