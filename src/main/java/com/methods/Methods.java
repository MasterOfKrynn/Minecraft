package main.java.com.methods;

import main.java.com.minecraft.Screen;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel on 9/28/2016.
 */
public class Methods
{
    /**
     * Creates a window, obviously.
     * @param paramTitle Sets the title of your window.
     * @param paramWidth Sets the width and minimum width of your window.
     * @param paramHeight Sets the height and minimum height of your window.
     * @param isResizable Chooses if the window is resizable.
     * @param cursor Sets the cursor for your window.
     * @param frame The window.
     */
    public static void createWindow(String paramTitle, int paramWidth, int paramHeight, Boolean isResizable, Cursor cursor, JFrame frame)
    {
        String title = paramTitle;
        frame.setTitle(title);

        int width = paramWidth;
        int height = paramHeight;
        frame.setSize(width, height);
        frame.setResizable(isResizable);
        frame.setMinimumSize(new Dimension(paramWidth, paramHeight));

        frame.setCursor(cursor);

        frame.add(new Screen(), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }








}
