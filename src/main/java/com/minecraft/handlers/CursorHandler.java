package main.java.com.minecraft.handlers;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel on 9/30/2016.
 */
public class CursorHandler
{
    /**
     * Handles the cursor.
     * @param frame The window.
     */
    public static void setCursor(JFrame frame)
    {
        frame.setCursor(Cursor.CROSSHAIR_CURSOR);
    }
}
