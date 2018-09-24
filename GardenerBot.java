import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GardenerBot extends UrRobot
{
    /**
     * Constructor for objects of class Pinsetter
     */
    public GardenerBot(int st, int ave, Direction dir, int beeps)
    {
        super (2,2, South, 28);
    }
    
    public void plantGarden()
    {
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        wall();
        next();
        wall();
        next();
        wall();
        next();
        wall();
        turnRight();
        move();
        move();
        move();
        turnLeft();
        
        
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
    public void wall()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
       
        
        
    }   
    public void next()
    {
        turnLeft();
        move();
        turnLeft();
       
        
    }
   
}
