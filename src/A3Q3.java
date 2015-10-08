
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 1, 1, Direction.SOUTH);
        
        // make walls to create a room for the robot to escape
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.NORTH);
        
        // make karel escape the room by checking the whole perimeter of the room
        // make karel check every unit of wall until there is a break
        // make karel then travel out of the break and stop right after 
        
        // make variable for karel to know if he is out of the room
        boolean foundExit = false;
        
        // move karel forward until he hits a wall 
        while( karel.frontIsClear() ){
            karel.move();
        }
           
        // make karel find the exit if the variable is false
        while( !foundExit ){
            // make karel then move forward if his front is clear
            // to check if there is a break until he can find one
            if( karel.frontIsClear() ){
                // move along the wall
                karel.move();

                // turn to face the wall to see if opening in wall
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();

                // if clear than there is a break in the wall
                // move forward and out doorway and stop 
                if(karel.frontIsClear()){
                    karel.move();
                    foundExit = true;
                }
            } else {
                // hit a wall, turn left to travel along the wall
                karel.turnLeft();
            }
        }
    }
}
