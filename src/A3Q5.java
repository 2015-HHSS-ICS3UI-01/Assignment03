
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
 * @author kulla6503
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Make a City for the Robot to live in
        City NYC = new City();
        //Make a Robot 
        Robot karel = new Robot(NYC, 1, 1, Direction.EAST);
        
        //Make things 
        new Thing(NYC, 1, 1); 
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
        new Thing(NYC, 1, 1);
       
        
      
        
// karel picks up one pile of things and puts them in a new intersection
int bag =0; 

  while(true) {
        karel.pickThing(); 
        karel.move(); 
        karel.putThing();
        bag++; 
        if(bag ==10 ) {
            break; 
        }
        
        karel.turnLeft();
        karel.turnLeft(); 
        karel.move(); 
        karel.turnLeft();
        karel.turnLeft(); 
          
    
  
} 
    
    
           
            
        
         
          
           
          
       
       
        
        } 
}
