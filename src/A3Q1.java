
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
 * @author hadik9595
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,1,1, Direction.EAST);
        Robot steve = new Robot(kw,3,1, Direction.EAST);
        new Wall(kw,1,5, Direction.WEST);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Wall(kw,3,4, Direction.EAST);
        new Thing(kw,3,5);
        while(true){
            if(!karel.canPickThing()){
                karel.move();
                
            }else if(steve.frontIsClear()){
                steve.move();
            }
        }
            
        
        
        }
    }

