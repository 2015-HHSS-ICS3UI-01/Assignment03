
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City kw = new City();
        
        //Place things
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        new Thing (kw, 0,0);
        
        //Make robot
        Robot jonny = new Robot (kw, 0,0, Direction.EAST);
        
        //Program robot to pick up things
        int timesTurned = 0;
        while(timesTurned < 10){
            if( jonny.canPickThing()){
                jonny.pickThing();
            }jonny.move();
            jonny.putThing();
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.move();
            jonny.turnLeft();
            jonny.turnLeft();
            timesTurned = timesTurned + 1;
        }
        
    }
}
