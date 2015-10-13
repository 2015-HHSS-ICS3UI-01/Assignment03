
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
 * @author butlj9437
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make the things
        City town = new City();
        Robot jarvis = new Robot(town,1,1,Direction.EAST);
        new Thing(town,1,6);
        new Wall(town,1,5,Direction.EAST);
        //check if there is a thing or wall. then move
        while(!jarvis.canPickThing() && 
                jarvis.frontIsClear()){
            jarvis.move();
        }
    }
}
