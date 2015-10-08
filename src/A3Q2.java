
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
        
        // make karel move through the avenues and streets picking up the things
        // until karel has travelled all avenues and streets 
        do {
            // make karel pick up all things at current location
            while ( karel.canPickThing() ) {
                karel.pickThing();
            }
            
            // if karel's front is clear for current direction, continue to move
            // in that curent direction
            if(karel.frontIsClear()){
                karel.move();
                
            // if karel's front is not clear we have hit a wall
            // if karel's current direction is east then 
            // karel has hit the east wall, turn south and see if we can move south, 
            // if so move south, otherwise karel has hit the end of the room
            // make karel go back to start
            }else if(karel.getDirection() == Direction.EAST){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                
                // make karel check to see if we can move south
                if(karel.frontIsClear()){
                    // make karel move south 1 street and then turn to point east
                    karel.move();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                
            // the front is not clear so karel has hit a wall
            // if karel's direction is west then karel has hit the
            // west wall, turn south and see if karel can move south
            // if karel can move south then move otherwise karel has hit
            // the end of room, return to start. 
            }else if(karel.getDirection() == Direction.WEST){
                // Turn left to point direction south
                karel.turnLeft();
                
                // check to see if karel can move south
                if(karel.frontIsClear()){
                    karel.move();
                    karel.turnLeft();
                } 
            }

        // if karel is facing south, karel has traveled the entire room
        } while(karel.getDirection() != Direction.SOUTH); 
          
        // make karel move through the entire room, time to return 
        // to the start position (1,1). Travel west until
        // hit a wall and then north to hit the wall.
        // make karel always finish moving through the city pointing 
        // south, so turn to point West and move until we hit a wall
       
        // point west and move until hit a wall
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        while( karel.frontIsClear() ){
           karel.move();
        }
         
        // karel has hit west wall, 
        // point karel north 
        // and move until karel has hit a wall.
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        while( karel.frontIsClear() ){
           karel.move();
        }
    }
}
