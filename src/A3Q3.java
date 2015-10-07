
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
 * @author watsk8668
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();

        //make walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);

        //make robot
        Robot karel = new Robot(kw, 2, 2, Direction.SOUTH);


        //make karel reach the wall
        while (true) {
            if (karel.frontIsClear()) {
                karel.move();
            } else if (karel.frontIsClear() == false) {
                break;
            }
        }

        //make karel escape the room
        while (true) {
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                {
                    if (karel.frontIsClear()) {
                        break;
                    }
                }
            } else if (karel.frontIsClear() == false) {
                karel.turnLeft();
            }
        }
        //make karel move out of the room
        karel.move();
    }
}
