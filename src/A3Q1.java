
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
        
        // make wall within city for robot to stop infornt of
        new Wall (kw, 0, 4, Direction.WEST);
        
        // make things for robot to stop on
        new Thing (kw, 0 ,2);
        new Thing (kw, 0, 3);
        
        // make karel move forward stopping on things or infront of walls
        
        // make karel move as long as he can not pick up a thing and his front is clear
        while(!karel.canPickThing() && karel.frontIsClear()){
            karel.move();
        }
            
    }
}
