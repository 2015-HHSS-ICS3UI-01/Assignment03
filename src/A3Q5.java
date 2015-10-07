
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City
        City cap = new City();
        
        //Make a Robot
        Robot jp = new Robot(cap, 1, 0, Direction.EAST);
        
        //Make 10 Things
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        new Thing(cap, 1, 1);
        
        //Make the Robot move things to next intersection
            jp.move();
            
           while(jp.canPickThing()){
               jp.pickThing();
               jp.move();
               jp.putThing();
               jp.turnLeft();
               jp.turnLeft();
               jp.move();
               jp.turnLeft();
               jp.turnLeft();
               
               
           }
        }
            
        }
        
        
    

