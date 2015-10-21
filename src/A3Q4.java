
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
 * @author eadil1765
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     City L = new City();
     new Wall (L,2,2,Direction.WEST);
     new Wall (L,3,2,Direction.WEST);
     new Wall (L,2,2,Direction.NORTH);
     new Wall (L,2,3,Direction.NORTH);
     new Wall (L,2,3,Direction.EAST);
     new Wall (L,3,3,Direction.EAST);
     new Wall (L,3,2,Direction.SOUTH);
     new Wall (L,3,3,Direction.SOUTH);
     Robot Liam = new Robot(L,1,1,Direction.EAST);
     while (Liam.frontIsClear()){
             Liam.move();
             Liam.move();
             Liam.move();
             Liam.turnLeft();
             Liam.turnLeft();
             Liam.turnLeft();
         }
    }
}
