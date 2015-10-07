
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
 * @author watsk8668
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();

        //make robot
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);

        //make things
        new Thing(kw, 0, 2);
        new Thing(kw, 0, 3);

        //make wall
        new Wall(kw, 0, 4, Direction.WEST);

        //make karel stop at the first thing or wall
        while (true) {
            if (karel.canPickThing()) {
                break;
            } else if (karel.frontIsClear() == false) {
                break;
            } else if (karel.frontIsClear()) {
                karel.move();
            }
        }

    }
}
