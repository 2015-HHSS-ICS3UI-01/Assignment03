
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City A3Q3 = new City();

        //Make robot
        Robot karel = new Robot(A3Q3, 2, 2, Direction.WEST);
        karel.setColor(Color.white);

        //MAKE WALLS
        //Top wall
        new Wall(A3Q3, 1, 1, Direction.NORTH);
        new Wall(A3Q3, 1, 3, Direction.NORTH);
        new Wall(A3Q3, 1, 4, Direction.NORTH);

        //Right wall
        new Wall(A3Q3, 1, 4, Direction.EAST);
        new Wall(A3Q3, 2, 4, Direction.EAST);
        new Wall(A3Q3, 3, 4, Direction.EAST);

        //Bottom wall
        new Wall(A3Q3, 3, 4, Direction.SOUTH);
        new Wall(A3Q3, 3, 3, Direction.SOUTH);
        new Wall(A3Q3, 3, 2, Direction.SOUTH);
        new Wall(A3Q3, 3, 1, Direction.SOUTH);

        //Left wall
        new Wall(A3Q3, 3, 1, Direction.WEST);
        new Wall(A3Q3, 2, 1, Direction.WEST);
        new Wall(A3Q3, 1, 1, Direction.WEST);

        //Code Solution
        while (karel.frontIsClear()) {
            karel.move();
        }
        karel.turnLeft();
        while (true) {
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (!karel.frontIsClear()) {
                karel.turnLeft();
                if (!karel.frontIsClear()) {
                    karel.turnLeft();
                }
                karel.move();
            } else {
                karel.move();
                break;
            }
        }
















    }
}
