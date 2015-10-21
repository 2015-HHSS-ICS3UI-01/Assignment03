/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author malcr1272
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a City
        City kw = new City();
        
        //make a robot
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        //make things
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        
        //make karel pick thing
        for( int pick = 0; pick < 10; pick = pick + 1){
            karel.pickThing();
            karel.move();              
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
            karel.move();
    }
}
