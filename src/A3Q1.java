
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
        // TODO code application logic here
        
        City thomas = new City();
        
        Robot tom = new Robot (thomas, 1,1, Direction.EAST);
        
        new Thing(thomas, 1,3);
        new Thing(thomas, 1,4);
        new Wall(thomas,1,5, Direction.WEST);
        

        while(tom.frontIsClear())
        {
            tom.move();
        if(tom.canPickThing())
        {
            break;
        }
        }
                    
    }
}
