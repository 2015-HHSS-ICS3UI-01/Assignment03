
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City town = new City();
        Robot jarvis = new Robot(town,1,1,Direction.EAST);
        for(int inc=0;inc!=10;inc++){
            new Thing(town,1,1);
        }
        for(int inc=0;inc!=10;inc++){
            jarvis.pickThing();
            jarvis.move();
            jarvis.putThing();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.turnLeft();
        }
        jarvis.move();
    }
    
}
