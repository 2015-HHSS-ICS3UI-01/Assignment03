
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
 * @author dawsr2694
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City
        City A3Q6 = new City();

        //Make Robots
        Robot karel = new Robot(A3Q6, 3, 3, Direction.SOUTH);

        //Make Walls
        for (int wall = 1; wall <= 5; wall++) {
            if (wall != 3) {
                new Wall(A3Q6, 1, wall, Direction.NORTH);
                new Wall(A3Q6, wall, 1, Direction.WEST);
                new Wall(A3Q6, 5, wall, Direction.SOUTH);
                new Wall(A3Q6, wall, 5, Direction.EAST);

                new Wall(A3Q6, wall, 2, Direction.EAST);
                new Wall(A3Q6, wall, 4, Direction.WEST);

                new Wall(A3Q6, 2, wall, Direction.SOUTH);
                new Wall(A3Q6, 4, wall, Direction.NORTH);
            }

        }
        //Code Solution
        for (int loop = 4; loop > 0; loop--) {

            for (int move = 4; move > 0; move--) {
                karel.move();
                karel.move();
                karel.move();
                if (move != 1) {
                    karel.turnLeft();
                }
            }

        }
    }
}
