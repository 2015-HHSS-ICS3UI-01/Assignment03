
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City
        City cap = new City();
        
        //Make a Robot
        Robot ross = new Robot(cap, 1, 1, Direction.EAST);
        Robot bro = new Robot(cap, 2, 1, Direction.EAST);
        
        //Make a Wall
        new Wall(cap, 1, 6, Direction.EAST);
        new Wall(cap, 2, 6, Direction.EAST);
        
        //Make new Thing
        new Thing(cap, 1, 7);
        new Thing(cap, 2, 6);
        new Thing(cap, 2, 5);
        
        
        while(ross.frontIsClear()){
            ross.move();
            }
        
        while(bro.frontIsClear()){
            bro.move();
            
            if(bro.canPickThing()){
                break;
            }
        }
        
        
        
                
    }
}
