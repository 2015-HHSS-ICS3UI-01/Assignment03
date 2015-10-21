
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
 * @author eadil1765
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City L = new City();
        Robot Liam = new Robot (L,1,1,Direction.EAST);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        new Thing (L,1,1);
        
        if (!Liam.canPickThing()){
                
            }
        while (Liam.canPickThing()){
            Liam.pickThing();
            Liam.move();
            Liam.putThing();
            Liam.turnLeft();
            Liam.turnLeft();
            Liam.move();
            Liam.turnLeft();
            Liam.turnLeft();
        
    if (!Liam.canPickThing()){
             
        
 
          
       
       
            
        }
        
        

        }
    }
}

