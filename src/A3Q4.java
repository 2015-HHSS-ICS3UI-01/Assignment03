
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
 * @author kulla6503
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the Robot to live in
        City NYC = new City(); 
        
        //Make a robot to live in the city 
        Robot karel = new Robot(NYC, 0, 2, Direction.WEST); 
        
       new Wall(NYC, 1, 1, Direction.NORTH); 
       new Wall(NYC, 1, 2, Direction.NORTH);  
       new Wall(NYC, 1, 1, Direction.WEST); 
       new Wall(NYC, 2, 1, Direction.WEST); 
       new Wall(NYC, 2, 1, Direction.SOUTH); 
       new Wall(NYC, 2, 2, Direction.SOUTH);
       new Wall(NYC, 2, 2, Direction.EAST);
       new Wall(NYC, 1, 2, Direction.EAST); 
       
        //karel does to loops around the square 
       int lap= 0; 
       
         while( lap != 8) {
            karel.move();
            karel.move();
            karel.turnLeft(); 
            karel.move();
            lap++; 
          
         }
         
         
         
         
         
  
       }
   
     
 
       
        
        
   
}


 

