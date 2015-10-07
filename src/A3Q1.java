
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
 * @author snowc4636
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        //Make a Thing
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 3, 6);
        
        //Make a Wall
        new Wall(kw,1, 5, Direction.WEST);
        new Wall(kw,3, 5, Direction.EAST);
        
        //Make a robot to live in the City
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        int moveAmount = 2;
        while (moveAmount > 0){
            bob.move();
            moveAmount--;
        }
        
        Robot fred = new Robot(kw, 3, 1, Direction.EAST);
        while(fred.frontIsClear()){
            fred.move();
        }
        
        
        

        

        

        
    }
}
