
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
 * @author snowc4636
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        //Make a robot to live in the city
        Robot ciara = new Robot(kw, 2, 2, Direction.EAST);
        
        //Make a thing
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        
        
        ciara.move();
        
        while (ciara.canPickThing()) {
            ciara.pickThing();
            ciara.move();
            ciara.putThing();
            ciara.turnLeft();
            ciara.turnLeft();
            ciara.move();
            ciara.turnLeft();
            ciara.turnLeft();

            
        }
    }
}
