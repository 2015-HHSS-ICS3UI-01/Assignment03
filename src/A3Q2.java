
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
        
        // make walls within city
        new Wall (kw, 0, 0, Direction.NORTH);
        new Wall (kw, 0, 0, Direction.WEST);
        new Wall (kw, 0, 1, Direction.NORTH);
        new Wall (kw, 0, 2, Direction.NORTH);
        new Wall (kw, 0, 3, Direction.NORTH);
        new Wall (kw, 1, 0, Direction.WEST);
        new Wall (kw, 2, 0, Direction.WEST);
        new Wall (kw, 2, 0, Direction.SOUTH);
    }
}
