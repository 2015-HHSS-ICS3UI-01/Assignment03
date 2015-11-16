
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
 * @author sevcm7279
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // make city
        City eep = new City();
        
        // make things and walls in the distance
        new Wall (eep, 1, 5, Direction.EAST);
        new Thing (eep, 1, 5);
        
        //make robot
        Robot jimbo = new Robot (eep, 1, 1, Direction.EAST);
        
        //make move
        int moveS = 0;
            while (moveS < 4 ){
            jimbo.move();
            moveS = moveS + 1;
            
    }
}}
