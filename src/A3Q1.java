
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make new city kw
        City kw = new City();

        //make new robotSE karl
        RobotSE karl = new RobotSE(kw, 0, 0, Direction.EAST);

        //make things and walls
        new Thing(kw, 0, 4);
        new Thing(kw, 0, 3);
        new Wall(kw, 0, 3, Direction.EAST);

        //make new integer thing
        int thing = 0;


        //check for things and walls
        while (thing != 1) {
            karl.move();
            if (karl.canPickThing()) {
                thing++;
            }
            if (thing == 1) {
                break;
            }
            if (!karl.frontIsClear()) {
                thing++;
            }
        }


    }
}
