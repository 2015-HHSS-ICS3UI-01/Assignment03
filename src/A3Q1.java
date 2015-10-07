
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City A3Q1 = new City();

        //Make robot
        Robot karel = new Robot(A3Q1, 1, 1, Direction.EAST);

        //Make Things
        new Thing(A3Q1, 1, 3);
        new Thing(A3Q1, 1, 4);

        //Make walls
        new Wall(A3Q1, 1, 4, Direction.EAST);

        //Code solution
        while (true) {
            karel.move();
            if (!karel.frontIsClear() || karel.canPickThing()) {
                break;
            }
        }
        



















    }
}
