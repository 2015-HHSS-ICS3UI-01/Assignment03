
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
        
        while(true){
            // make karel first travel to be beside the set of walls
            if(karel.frontIsClear()){
                karel.move();
            // make karel turn left to start to move down the wall
            }else{
                karel.turnLeft();
                // make karel then move forward if his front is clear
                // to check if there is a break until he can find one
                if(karel.frontIsClear()){
                    karel.move();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    // make karel move forward once and stop if he finds a break
                    if(karel.frontIsClear()){
                        karel.move();
                        break;
                    }
                }
            }
            
            // to shorten one while loop to get him to the walls 
            // and then another to get him to check till there is a break
        }
    }
}
