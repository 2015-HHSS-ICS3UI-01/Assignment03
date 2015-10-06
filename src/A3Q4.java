
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City
        City A3Q4 = new City();

        //Make Robot
        Robot karel = new Robot(A3Q4, 0, 2, Direction.WEST);

        //Make Walls
        for (int wall = 1; wall < 3; wall++) {
            new Wall(A3Q4, 1, wall, Direction.NORTH);
            new Wall(A3Q4, 2, wall, Direction.SOUTH);
            new Wall(A3Q4, wall, 1, Direction.WEST);
            new Wall(A3Q4, wall, 2, Direction.EAST);
        }
        //Code solution
        for (int moveCount = 8; moveCount > 0; moveCount--) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
        }
    }
}
