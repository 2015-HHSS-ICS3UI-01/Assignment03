
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
 * @author sevcm7279
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make things
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        new Thing (eep, 1, 1);
        
        //make robot
        Robot jimbo = new Robot (eep, 1, 1, Direction.EAST);
        
        for (int things = 0; things < 10; things = things + 1){
            jimbo.pickThing();
            jimbo.move();
            jimbo.putThing();
            jimbo.turnLeft();
            jimbo.turnLeft();
            
            
            jimbo.move();
            jimbo.turnLeft();
            jimbo.turnLeft();
            
            
            
        }jimbo.move();
    }
    
}
    

