
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Make a City for the Robot to live in
        City NYC = new City();
        //Make a Robot 
        Robot karel = new Robot(NYC, 1, 1, Direction.EAST);

        //Make Walls 
        new Wall(NYC, 1, 1, Direction.NORTH);
        new Wall(NYC, 1, 2, Direction.NORTH);
        new Wall(NYC, 1, 3, Direction.NORTH);
        new Wall(NYC, 1, 4, Direction.NORTH);
        new Wall(NYC, 1, 4, Direction.EAST);
        new Wall(NYC, 2, 4, Direction.EAST);
        new Wall(NYC, 3, 4, Direction.EAST);
        new Wall(NYC, 3, 4, Direction.SOUTH);
        new Wall(NYC, 3, 3, Direction.SOUTH);
        new Wall(NYC, 3, 2, Direction.SOUTH);
        new Wall(NYC, 3, 1, Direction.SOUTH);
        new Wall(NYC, 1, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.WEST);
        new Wall(NYC, 3, 1, Direction.WEST);



        //Make Thing 
        new Thing(NYC, 1, 2);
        new Thing(NYC, 2, 2);
        new Thing(NYC, 2, 4);
        new Thing(NYC, 3, 4);
        new Thing(NYC, 2, 3);
        new Thing(NYC, 3, 1);
        new Thing(NYC, 3, 3);


        //karel starts picking things in first street


        while (karel.frontIsClear()) {
            karel.move();

            if (karel.canPickThing()) {
                karel.pickThing();
            }
        }
        //karel makes a transition to second street 
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();

        //karel starts picking things on second street      
        while (karel.frontIsClear()) {
            karel.pickThing();
            karel.move();

        }
        //karel makes a transition to third street 
        karel.turnLeft();
        karel.move();
        karel.turnLeft();

        //karel starts picking things on third street 
        while (karel.frontIsClear()) {
            if (karel.canPickThing()) {
                karel.pickThing();
                karel.move();
            } else {
                karel.move();
            }

        }
        karel.pickThing();

        //karel travels back to origin(1,1)
        while (karel.getDirection() != Direction.NORTH) {
            karel.turnLeft();
        }
        while (karel.getStreet() != 1) {
            karel.move();
        }

        while (karel.getDirection() != Direction.WEST) {
            karel.turnLeft();
        }
        while (karel.getAvenue() != 1) {
            karel.move();
        }

        karel.turnLeft();
        karel.turnLeft();
















    }
}
