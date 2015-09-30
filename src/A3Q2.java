
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
 * @author dawsr2694
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City A3Q2 = new City();

        //Make robot
        Robot karel = new Robot(A3Q2, 1, 1, Direction.EAST);

        //Make room
        //Top Wall
        new Wall(A3Q2, 1, 1, Direction.NORTH);
        new Wall(A3Q2, 1, 2, Direction.NORTH);
        new Wall(A3Q2, 1, 3, Direction.NORTH);
        new Wall(A3Q2, 1, 4, Direction.NORTH);

        //Left Wall
        new Wall(A3Q2, 1, 1, Direction.WEST);
        new Wall(A3Q2, 2, 1, Direction.WEST);
        new Wall(A3Q2, 3, 1, Direction.WEST);
        new Wall(A3Q2, 4, 1, Direction.WEST);

        //Bottom Wall
        new Wall(A3Q2, 4, 1, Direction.SOUTH);
        new Wall(A3Q2, 4, 2, Direction.SOUTH);
        new Wall(A3Q2, 4, 3, Direction.SOUTH);
        new Wall(A3Q2, 4, 4, Direction.SOUTH);

        //Right wall
        new Wall(A3Q2, 4, 4, Direction.EAST);
        new Wall(A3Q2, 3, 4, Direction.EAST);
        new Wall(A3Q2, 2, 4, Direction.EAST);
        new Wall(A3Q2, 1, 4, Direction.EAST);

        //Make Litter
        new Thing(A3Q2, 1, 2);

        new Thing(A3Q2, 2, 2);
        new Thing(A3Q2, 2, 3);
        new Thing(A3Q2, 2, 4);

        new Thing(A3Q2, 3, 1);
        new Thing(A3Q2, 3, 4);

        //Code solution
        while (true) {
            while (karel.frontIsClear()) {
                karel.move();
                if (karel.canPickThing()) {
                    karel.pickThing();
                }
            }
            karel.turnLeft(); //turn Around
            karel.turnLeft();
            while (karel.frontIsClear()) { //Go back
                karel.move();
            }
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
            } else {
                karel.turnLeft();
                karel.turnLeft();
                while (karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft(); //Right turn
                karel.turnLeft();
                karel.turnLeft();
                break;
            }
            if (karel.canPickThing()) {
                karel.pickThing();
            }
        }
    }
}
