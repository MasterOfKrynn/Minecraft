package main.java.com.minecraft.handlers;

import main.java.com.minecraft.Minecraft;

/**
 * Created by Daniel on 9/30/2016.
 */
public class Updater
{
    /**
     * Updates every 100000 time units.
     */
    public static void update()
    {
        CursorHandler.setCursor(Minecraft.frame);
    }
}
