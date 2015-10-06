
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
 * @author moore3607
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //created a city (grid) in which to program in
        City kw = new City();
        //created a new robot (beep) in which to command
        Robot beep = new Robot(kw, 1, 1, Direction.EAST);
        //created things
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Wall(kw, 1, 5, Direction.WEST);


        //the following commands will be executed no matter what
        while (true) {
            beep.move();
            //if beep is standing onn a thing, 
            //he will execute the following commands
            if (beep.canPickThing()) {
                break;
            }
            //if beep's front in clear, he will execute the following commands
            if (!beep.frontIsClear()) {
                //breaks the program out of the while loop
                break;
            }

        }


    }
}
