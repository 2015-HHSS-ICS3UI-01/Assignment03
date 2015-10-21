
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
 * @author agott2059
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city, robot and environment

        City thomas = new City();

        Robot tom = new Robot(thomas, 0, 2, Direction.WEST);

        new Wall(thomas, 1, 1, Direction.NORTH);
        new Wall(thomas, 1, 1, Direction.WEST);
        new Wall(thomas, 2, 1, Direction.WEST);
        new Wall(thomas, 2, 1, Direction.SOUTH);
        new Wall(thomas, 1, 2, Direction.NORTH);
        new Wall(thomas, 1, 2, Direction.EAST);
        new Wall(thomas, 2, 2, Direction.SOUTH);
        new Wall(thomas, 2, 2, Direction.EAST);

        //loop until the number of sides passed = 8        
        for (int timesTurned = 0; timesTurned < 8; timesTurned = timesTurned + 1) {
            //move robot
            tom.move();
            tom.move();
            tom.turnLeft();
            tom.move();
        }
    }
}
