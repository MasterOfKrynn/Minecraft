package main.java.com.minecraft.entities;

import java.awt.image.BufferedImage;

public class Entity
{
    /**
     * Each entity has an image.
     */
    public static BufferedImage image;

    /**
     * Each entity has a speed.
     */
    public static float speed;

    /**
     * Each entity has an x position.
     */
    public static int x = 0;

    /**
     * Each entity has a y position.
     */
    public static int y = 0;

    /**
     * Creates a new Entity. Used for all Entities.
     * @param imageLocation The image location, which is used in an ImageStream.
     * @param speed The speed of the Entity.
     */
    public Entity(String imageLocation, float speed)
    {
        this.speed = speed;

        try
        {
     //       image = ImageIO.read(Entity.class   (imageLocation));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
