/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author malcr1272
 */
public class A3Q3 {

    public static void main(String[] args) {
        //make new city
        City kw = new City();
        //make robot to live in city
        Robot karel = new Robot(kw, 2, 3, Direction.SOUTH);
        //make walls 
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 6, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);

        new Wall(kw, 4, 6, Direction.EAST);
        new Wall(kw, 5, 6, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);

        //make karel search for the entrance

        while (karel.frontIsClear()) {
            karel.move();
        }
        while (!karel.frontIsClear()) {
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();

            } else {
                karel.turnLeft();
                while (karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
            }
        }

        karel.move();
        karel.move();
    }
}
