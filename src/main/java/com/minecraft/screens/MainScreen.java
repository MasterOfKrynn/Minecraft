package main.java.com.minecraft.screens;

import main.java.com.methods.EasyComponent;
import main.java.com.minecraft.Minecraft;

/**
 * Created by Daniel on 9/25/2016.
 */
public class MainScreen {
    /**
     * Shows the menu screen, called when you start.
     */
    public static void showMainScreen()
    {
        new EasyComponent("Minecraft", 100, 250, 20, 20, Minecraft.frame);
        //new Button("Singleplayer/Multiplayer", 50, 50, 90, 50, Minecraft.frame);
    }
}
