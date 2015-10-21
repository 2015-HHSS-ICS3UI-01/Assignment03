
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
 * @author preej0747
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City kw = new City();
        
        //Place walls and things
        new Wall (kw, 0,4, Direction.WEST);
        new Wall (kw, 1,4, Direction.EAST);
        new Thing (kw, 0,2);
        new Thing (kw, 0,3);
        new Thing (kw, 1,5);
        
        //Make new robot
        Robot jonny = new Robot (kw, 0,0, Direction.EAST);
        Robot jon = new Robot (kw, 1,0, Direction.EAST);
        
        //Program while loops
        while( jonny.frontIsClear()){
            jonny.move();
            if( jonny.canPickThing()){
                break;
            }
        }
        while( jon.frontIsClear()){
            jon.move();
        }
        
        
        
        
        
        
    }
}
