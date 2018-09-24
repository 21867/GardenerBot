import kareltherobot.*;
/**
 * Write a description of class NasaBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GardenerBotDriver implements Directions
{
    public static void main(String args[])
    {
        GardenerBot karel = new GardenerBot(1,6,North, 0);
        karel.plantGarden();
    }
    static
    {
        World.reset();  
        World.readWorld("ch3_7.kwld");
        World.setDelay(5);
        World.setVisible(true);     
    }
    
}
