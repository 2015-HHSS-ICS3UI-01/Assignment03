
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
 * @author bettk6516
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    City jw=new City();
    Robot rob = new Robot(jw,1,1,Direction.EAST);
    new Wall(jw,1,5,Direction.EAST);
   
    
    while(true){
     //rob will move untill he can pick thing
        rob.move();
       //if rob can pick thing it will then stop
        if(rob.canPickThing()){
           rob.pickThing();
           break;
       }
        //if rob is bloacked by a wall it will stop
        if(!rob.frontIsClear()){
            break;
        }
        
        
    }
        
    
    
    }
}
