
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
 * @author sevcm7279
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make boxes
        new Wall (eep, 1, 1, Direction.NORTH);
        new Wall (eep, 1, 1, Direction.WEST);
        new Wall (eep, 2, 1, Direction.WEST);
        new Wall (eep, 2, 1, Direction.SOUTH);
        new Wall (eep, 1, 2, Direction.NORTH);
        new Wall (eep, 1, 2, Direction.EAST);
        new Wall (eep, 2, 2, Direction.EAST);
        new Wall (eep, 2, 2, Direction.SOUTH);
        
        new Wall (eep, 1, 4, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.WEST);
        new Wall (eep, 2, 4, Direction.WEST);
        new Wall (eep, 2, 4, Direction.SOUTH);
        new Wall (eep, 1, 5, Direction.NORTH);
        new Wall (eep, 1, 5, Direction.EAST);
        new Wall (eep, 2, 5, Direction.EAST);
        new Wall (eep, 2, 5, Direction.SOUTH);
        
        new Wall (eep, 4, 1, Direction.NORTH);
        new Wall (eep, 4, 1, Direction.WEST);
        new Wall (eep, 5, 1, Direction.WEST);
        new Wall (eep, 5, 1, Direction.SOUTH);
        new Wall (eep, 4, 2, Direction.NORTH);
        new Wall (eep, 4, 2, Direction.EAST);
        new Wall (eep, 5, 2, Direction.EAST);
        new Wall (eep, 5, 2, Direction.SOUTH);
        
        new Wall (eep, 4, 4, Direction.NORTH);
        new Wall (eep, 4, 4, Direction.WEST);
        new Wall (eep, 5, 4, Direction.WEST);
        new Wall (eep, 5, 4, Direction.SOUTH);
        new Wall (eep, 4, 5, Direction.NORTH);
        new Wall (eep, 4, 5, Direction.EAST);
        new Wall (eep, 5, 5, Direction.EAST);
        new Wall (eep, 5, 5, Direction.SOUTH);
        
        //make robot
        Robot jimbo = new Robot(eep, 3, 3, Direction.SOUTH);
        
        //moves
        for (int cycles = 0; cycles < 4; cycles = cycles + 1){
            for (int loop = 0; loop < 3; loop = loop + 1){
                jimbo.move();
                jimbo.move();
                jimbo.move();
                jimbo.turnLeft();
            }for (int run = 0; run < 3; run = run + 1){
                jimbo.move();
            }
        }
    }
}
