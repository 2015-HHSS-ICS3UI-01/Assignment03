
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
 * @author agott2059
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create city, robot and things
        
        City thomas = new City();
        
        Robot tom = new Robot(thomas, 1,1, Direction.EAST);
        
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        new Thing(thomas,1,1);
        
        //loop program until number of things moves
        for(int thingsMoved = 0; thingsMoved < 10; thingsMoved = thingsMoved + 1){
        //actions required to move one thing and come back to original pile
            tom.pickThing();
            tom.move();
            tom.putThing();
            tom.turnLeft();
            tom.turnLeft();
            tom.move();
            tom.turnLeft();
            tom.turnLeft();
        }
        //move on top of pile
        tom.move();
        
    }
}
