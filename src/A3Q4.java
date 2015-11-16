
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make walls 
        new Wall (eep, 1, 1, Direction.WEST);
        new Wall (eep, 1, 1, Direction.NORTH);
        new Wall (eep, 1, 2, Direction.NORTH);
        new Wall (eep, 1, 2, Direction.EAST);
        new Wall (eep, 2, 1, Direction.WEST);
        new Wall (eep, 2, 1, Direction.SOUTH);
        new Wall (eep, 2, 2, Direction.SOUTH);
        new Wall (eep, 2, 2, Direction.EAST);
        
        //make robot
        Robot jimbo = new Robot(eep, 0, 2, Direction.WEST);
        
        //make jimbo move around box
        for (int moves = 0; moves < 8; moves = moves +1){
            jimbo.move();
            jimbo.move();
            jimbo.turnLeft();
            jimbo.move();
         
  
}
}
}
