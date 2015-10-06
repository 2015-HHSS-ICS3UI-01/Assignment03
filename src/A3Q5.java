
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
 * @author moore3607
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//made a city in which to program in
        City kw = new City();
        //made a new robot named beep
        Robot beep = new Robot(kw, 0, 0, Direction.EAST);
//made things
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
//made the variable "moveamount" equal 10
        int moveamount = 10;
        //the following commands will always be executed
        while (true) {
            //if "moveamount" equals anything above zero, 
            //the following commands will be executed
            if (moveamount > 0) {
                beep.pickThing();
                beep.move();
                beep.putThing();
                moveamount = moveamount - 1;
            }
            //if "moveamount" equals anything above zero, 
            //the following commands will be executed
            if (moveamount > 0) {
                beep.turnLeft();
                beep.turnLeft();
                beep.move();
                beep.turnLeft();
                beep.turnLeft();
            }
        }



    }
}
