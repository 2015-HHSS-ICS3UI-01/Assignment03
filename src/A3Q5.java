
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make new city kw
        City kw = new City();

        //make new robot karl
        RobotSE karl = new RobotSE(kw, 0, 0, Direction.EAST);

        int bag = 0;

        //make new things
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);

        while (true) {
            karl.pickThing();
            karl.move();
            karl.putThing();
            bag++;
            if (bag == 10) {
                break;
            }
            karl.turnAround();
            karl.move();
            karl.turnAround();
        }



    }
}
