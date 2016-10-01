package main.java.com.minecraft.handlers;

import main.java.com.minecraft.Minecraft;
import main.java.com.minecraft.Screen;
import main.java.com.minecraft.entities.EntityCreator;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Daniel on 9/23/2016.
 */
public class KeyHandler
{
    public static Screen screen = new Screen();
    static boolean pause = false;
    public static String pauseString = "";

    /**
     * This is called when you press the up arrow key(or whatever key you set when you call handleKeys).
     */
    public static void handleUp()
    {
        EntityCreator.steve.y -= EntityCreator.steve.speed;
    }

    /**
     * This is called when you press the down arrow key.
     */
    public static void handleDown()
    {
        EntityCreator.steve.y += EntityCreator.steve.speed;
    }

    /**
     * This is called when you press the left arrow key.
     */
    public static void handleLeft()
    {
        EntityCreator.steve.x -= EntityCreator.steve.speed;
    }

    /**
     * This is called when you press the right arrow key.
     */
    public static void handleRight()
    {
        EntityCreator.steve.x += EntityCreator.steve.speed;
    }

    /**
     * This is called when you press the space bar.
     */
    public static void handleSpaceBar()
    {
       if (pause == true)
       {
           pause = false;
           pauseString = "";
       }
       else
       {
           pause = true;
           pauseString = " (Pause)";
       }
    }

    public static void handleKeys()
    {
        screen.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent key)
            {
                super.keyTyped(key);
            }

            @Override
            public void keyPressed(KeyEvent key)
            {
                super.keyPressed(key);

                switch (key.getKeyCode())
                {
                    case KeyEvent.VK_UP:
                        handleUp();
                    case KeyEvent.VK_DOWN:
                        handleDown();
                    case KeyEvent.VK_LEFT:
                        handleLeft();
                    case KeyEvent.VK_RIGHT:
                        handleRight();
                    case KeyEvent.VK_SPACE:
                        handleSpaceBar();
                }
            }

            @Override
            public void keyReleased(KeyEvent key)
            {
                super.keyReleased(key);

                if (key.getKeyCode() == KeyEvent.VK_ESCAPE)
                {
                    System.exit(0);
                }
            }
        });

        Minecraft.frame.setFocusable(true);
    }
}
