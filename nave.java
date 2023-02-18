import greenfoot.*; 
import java.util.Random; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    /**
     * Act - do whatever the nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int offsetX = 5;
    private int offsetY = 5;
    private Random random=new Random();
    public nave(){
        offsetX = random.nextInt(5)+3;
        offsetY = random.nextInt(5)+3;
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x+offsetX,y+offsetY);
        if(getY()>=378||getY()<=0){
        offsetY*=-1;
        }
        if(getX()>=540||getX()<=0){
        offsetX*=-1;
        }
        boom boom=new boom();
        cangrejo cangre=(cangrejo)getOneIntersectingObject(cangrejo.class);
        if(cangre!=null){
            
            World world=getWorld();
            world.addObject(boom,x+offsetX,y+offsetY);
        }
    }
}
