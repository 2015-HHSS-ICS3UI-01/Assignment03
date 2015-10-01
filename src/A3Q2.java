
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
 * @author richj0985
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        // make walls within city
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.SOUTH);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Wall (kw, 3, 4, Direction.SOUTH);
        new Wall (kw, 3, 4, Direction.EAST);
        new Wall (kw, 2, 4, Direction.EAST);
        new Wall (kw, 1, 4, Direction.EAST);
        
        // make things within the city for the robot to pick up and put down
        new Thing (kw, 1, 2);
        new Thing (kw, 2, 2);
        new Thing (kw, 3, 1);
        new Thing (kw, 1, 2);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 4);
        new Thing (kw, 3, 4);
        
        // move through the avenues and streets picking up the things
        // until we have travelled all avenues and streets 
        do {
            // pick up all things at current location
            while ( karel.canPickThing() ) {
                karel.pickThing();
            }
            
            // if front is clear for current direction, continue to move
            // in that curent direction
            if(karel.frontIsClear()){
                karel.move();
                
            // if front is not clear we have hit a wall
            // if our current direction is east then 
            // we have hit the east wall, turn south
            // and see if we can move south, if so move south
            // otherwise we have hit the end of the room
            // time to return home
            }else if(karel.getDirection() == Direction.EAST){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                
                // check to see if we can move south
                if(karel.frontIsClear()){
                    // move south 1 street and then turn to point east
                    karel.move();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                
            // the front is not clear so we hit a wall
            // if our direction is west then we have hit the
            // west wall, turn south and see if we can move south
            // if we can move south then move otherwise we have hit
            // the end of room, return home. 
            }else if(karel.getDirection() == Direction.WEST){
                // Turn left to poiht direction south
                karel.turnLeft();
                
                // check to see if we can move south
                if(karel.frontIsClear()){
                    karel.move();
                    karel.turnLeft();
                } 
            }

        // If we are facing south, we have traveled the entire room
        } while(karel.getDirection() != Direction.SOUTH); 
          
        // we have move through the entire room, time to return 
        // to the home position (1,1). Travel west until
        // hit a wall and then north to hit the wall.
        // We always finish moving through the city pointing 
        // south, so turn to point West and move until we hit a wall
       
        // point west and move until hit a wall
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        while( karel.frontIsClear() ){
           karel.move();
        }
         
        // we have hit west wall, 
        // point karel north 
        // and move until we hit a wall.
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        while( karel.frontIsClear() ){
           karel.move();
        }
    }
}
