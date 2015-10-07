
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
 * @author watsk8668
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();

        //make robot
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);

        //make things
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);

        //make karel move 
        karel.move();

        //make karel pick the things up and move them one at a time
        int moveAmount = 10;
        while (moveAmount > 0) {
            moveAmount--;
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
