
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
 * @author agott2059
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create city, robot, walls and things
        
        City thomas = new City();
        
        Robot tom = new Robot (thomas, 1,1, Direction.EAST);
        
        new Thing(thomas, 1,3);
        new Thing(thomas, 1,4);
        new Wall(thomas,1,5, Direction.WEST);
        
//move forward if front is clear but stop when thing is found
        while(tom.frontIsClear())
        {
            tom.move();
            //if tom can pick thing, thing is found, so end loop
        if(tom.canPickThing())
        {
            break;
        }
        }
                    
    }
}