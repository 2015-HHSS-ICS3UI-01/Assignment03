
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //made a new city in order to place and program objects in
        City kw = new City();
        //made a new robot named beep
        Robot beep = new Robot(kw, 1, 1, Direction.EAST);
        //made walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        //made things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //commands in this loop will always be completed
        while (true) {
            //if beep's front is clear, he will execute the following command
            if (beep.frontIsClear()) {
                beep.move();
            }
            //if beep is standing on a thing,
            //he will execute the following command
            if (beep.canPickThing()) {
                beep.pickThing();
            }
            //if beep's front is not clear, 
            //he will execute the following commands
            if (!beep.frontIsClear()) {
                beep.turnLeft();
                beep.turnLeft();
                beep.turnLeft();
            }
            //if beep is standing on the given location, 
            //he will execute the following commands
            if (beep.getStreet() == 1) {
                if (beep.getAvenue() == 1) {
                    //breaks the program out of the while loop
                    break;
                }
            }
        }
        //commands in this loop will always be completed
        while (true) {
            //if beep is standing on a thing,
            //he will execute the following command
            if (beep.canPickThing()) {
                beep.pickThing();
            }
            //if beep's front is clear, he will execute the following command
            if (beep.frontIsClear()) {
                beep.move();
                beep.turnLeft();
                //if beep's front is clear, 
                //he will execute the following command
                if (beep.frontIsClear()) {
                    beep.move();
                }
                //if beep's front isn't clear, 
                //he will execute the following commands
                if (!beep.frontIsClear()) {
                    beep.turnLeft();
                    beep.turnLeft();
                    beep.turnLeft();
                }
            }
            //while beep's front isn't clear, 
            //he will execute the following commands
            while (!beep.frontIsClear()) {
                beep.turnLeft();
            }
            //if beep is standing on the given location, 
            //he will execute the following commands
            if (beep.getStreet() == 1) {
                if (beep.getAvenue() == 1) {
                    //if beep is facing the given direction, 
                    //he will execute the following commands
                    if (beep.getDirection() == Direction.NORTH) {
                        beep.turnLeft();
                        beep.turnLeft();
                        beep.turnLeft();
                    }
                    //if beep is facing the given direction, 
                    //he will execute the following commands
                    if (beep.getDirection() == Direction.WEST) {
                        beep.turnLeft();
                        beep.turnLeft();
                    }
                    //if beep is facing the given direction, 
                    //he will execute the following commands
                    if (beep.getDirection() == Direction.SOUTH) {
                        beep.turnLeft();
                    }
                    //if beep is facing the given direction, 
                    //he will execute the following commands
                    if (beep.getDirection() == Direction.EAST) {
                        //breaks the program out of the while loop   
                        break;
                    }
                }
            }




        }

    }
}
