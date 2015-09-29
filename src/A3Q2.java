
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        // make box
        new Wall (eep, 1, 1, Direction.WEST);
        new Wall (eep, 1, 1, Direction.NORTH);
        new Wall (eep, 1, 2, Direction.NORTH);
        new Wall (eep, 1, 3, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.NORTH);
        new Wall (eep, 1, 5, Direction.NORTH);
        new Wall (eep, 1, 5, Direction.EAST);
        new Wall (eep, 2, 5, Direction.EAST);
        new Wall (eep, 3, 5, Direction.EAST);
        new Wall (eep, 3, 5, Direction.SOUTH);
        new Wall (eep, 3, 4, Direction.SOUTH); 
        new Wall (eep, 3, 3, Direction.SOUTH);
        new Wall (eep, 3, 2, Direction.SOUTH);
        new Wall (eep, 3, 1, Direction.SOUTH);
        new Wall (eep, 3, 1, Direction.WEST);
        new Wall (eep, 2, 1, Direction.WEST);
        
        //make litter
        
        //make robot
        Robot jimbo = new Robot (eep, 1, 1, Direction.EAST);
    }
}
