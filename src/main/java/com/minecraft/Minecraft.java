package main.java.com.minecraft;

import main.java.com.methods.Methods;
import main.java.com.minecraft.handlers.KeyHandler;
import main.java.com.minecraft.handlers.MainHandler;
import main.java.com.minecraft.handlers.Updater;

import javax.swing.*;
import java.awt.*;

public class Minecraft
{
    public static JFrame frame = new JFrame();

    public static void main(String[] args)
    {
        final int height = 500;
        final int width = 500;

        String title = "Minecraft";

        MainHandler.handle();
        Methods.createWindow(title + KeyHandler.pauseString, height, width, true, Cursor.getDefaultCursor(), frame);

        for (int i = 0; i > -1; i++)
        {
            if (i == 100000)
            {
                i = 0;
                Updater.update();
            }
        }
    }
}


