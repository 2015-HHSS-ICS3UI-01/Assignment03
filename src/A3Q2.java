
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make new city
        City kw = new City();

        //make new robot
        RobotSE karl = new RobotSE(kw, 1, 1, Direction.EAST);

        //make new things and walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);
        new Thing(kw, 2, 4);

        //pick up liter on the way
        while (karl.frontIsClear()) {
            while (karl.frontIsClear()) {
                karl.move();
                if (karl.canPickThing()) {
                    karl.pickThing();
                }
            }
            karl.turnRight();
            if (!karl.frontIsClear()) {
                break;
            }
            karl.move();
            if (karl.canPickThing()) {
                karl.pickThing();
            }

            karl.turnRight();
            while (karl.frontIsClear()) {
                karl.move();
                if (karl.canPickThing()) {
                    karl.pickThing();
                }
            }
            karl.turnLeft();
            if (!karl.frontIsClear()) {
                break;
            }
            karl.move();
            if (karl.canPickThing()) {
                karl.pickThing();
                karl.turnLeft();
            }

        }
        karl.turnAround();
        while (karl.frontIsClear()) {
            karl.move();
        }
        karl.turnLeft();
        while (karl.frontIsClear()) {
            karl.move();
        }
        karl.turnAround();

    }
}
