
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make new city kw
        City kw = new City();

        //make new robot karl
        RobotSE karl = new RobotSE(kw, 3, 3, Direction.NORTH);

        //make new walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        //new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);


        while (karl.frontIsClear()) {
            karl.move();
        }
        karl.turnLeft();
        while (true) {

            if (karl.frontIsClear()) {
                karl.move();
            }
            karl.turnRight();
            if (karl.frontIsClear()) {
                break;
            }
            karl.turnLeft();
            if (!karl.frontIsClear()) {
                karl.turnLeft();
            }
        }
        karl.move();
    }
}
