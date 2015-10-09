
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
 * @author kulla6503
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City for the Robot to live in
        City NYC = new City();
        //Make a Robot 
        Robot steve = new Robot(NYC, 1, 1, Direction.EAST);
        Robot karel = new Robot(NYC, 2, 1, Direction.EAST);

        //Make Walls 
        new Wall(NYC, 1, 5, Direction.WEST);
        new Wall(NYC, 2, 5, Direction.EAST);

        //Make Thing 
        new Thing(NYC, 1, 3);
        new Thing(NYC, 1, 4);
        new Thing(NYC, 2, 6);


        //Robot karel will only move if his front is clear
        while (true) {


            if (karel.frontIsClear()) {
                karel.move();
            } else if (!steve.canPickThing()) {
                steve.move();
            }


        }




    }
}
