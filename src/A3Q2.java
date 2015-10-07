
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
 * @author snowc4636
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City kw = new City();

        //Make a wall
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);

        //Make a thing
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //Make the robot to live in the city
        Robot Carter = new Robot(kw, 1, 1, Direction.EAST);
        while (true) {
            while (Carter.frontIsClear()) {
               if (Carter.canPickThing()) {
                    Carter.pickThing();
                }
                Carter.move();
            }
            Carter.turnLeft();
            Carter.turnLeft();
            if (Carter.canPickThing()) {
                    Carter.pickThing();
                }
            while (Carter.frontIsClear()) {
                Carter.move();
            }
            Carter.turnLeft();
            if (!Carter.frontIsClear()){
                break;
            }
            Carter.move();
            Carter.turnLeft();
        }
        Carter.turnLeft();
        Carter.turnLeft();
        while (Carter.frontIsClear()){
            Carter.move();
        }
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();








    }
}
