
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
 * @author mitrm7692
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a City
        City kw=new City();
        //Make a Robot
        Robot karel=new Robot(kw,0,0,Direction.EAST);
        //Make a Wall
        new Wall(kw,0,4,Direction.WEST);
        //Make a Thing
        new Thing (kw,0,3);
        new Thing (kw,0,4);
        //while the front is clear karel moves forward
        while(karel.frontIsClear()){
            karel.move();
            //if karel can pick a Thing he stops
        if (karel.canPickThing()){
            break;
        }
        }
        
        
        
        
        
        
        
        
        
    }
}
