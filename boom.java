import greenfoot.*; 
import java.util.Random; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boom extends Actor
{
    /**
     * Act - do whatever the boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int offsetX = 5;
    private int offsetY = 5;
    private Random random=new Random();
    public boom(){
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
        
    }
    }

