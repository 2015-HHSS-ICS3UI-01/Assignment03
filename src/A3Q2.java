
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
        
        karel.move();
        while(karel.getAvenue() != 1){
            while(karel.getDirection() == Direction.EAST || karel.getDirection() == Direction.WEST){
                if(karel.frontIsClear()){
                karel.move();
                }else{
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
            }      
            while(karel.getDirection() == Direction.SOUTH || karel.getDirection() == Direction.NORTH){
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
    }
}
