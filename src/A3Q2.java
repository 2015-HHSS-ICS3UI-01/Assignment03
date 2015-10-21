/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author malcr1272
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();

        // make robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //make walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);

        //New things
        new Thing(kw, 3, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 3, 4);

        while (true) {
            if (karel.canPickThing()) {
                karel.pickThing();
            }
            if (karel.frontIsClear()) {
                karel.move();

            } else {
                if (karel.getDirection() == Direction.EAST) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.SOUTH && (!karel.frontIsClear())) {
                    karel.turnLeft();
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.SOUTH) {
                    karel.move();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.WEST && (!karel.frontIsClear())) {
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.NORTH && (!karel.frontIsClear())) {
                    karel.turnLeft();
                }
                if (karel.getDirection() == Direction.WEST) {
                    karel.move();
                }


            }

            if (karel.getAvenue() == 1 && (karel.getStreet()) == 1) {

                karel.turnLeft();
                karel.turnLeft();
                break;
            }

        }
    }
}
