
import becker.robots.City;
import becker.robots.Direction;
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
        
        //boxes
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.EAST);
        
        }
    }
}
