
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City
        City A3Q5 = new City();

        //Make Robot
        Robot karel = new Robot(A3Q5, 1, 1, Direction.EAST);

        //Make Things
        for (int placeThing = 10; placeThing > 0; placeThing--) {
            new Thing(A3Q5, 1, 1);
        }

        for (int pickThing = 10; pickThing > 0; pickThing--) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
        karel.move();
    }
}
