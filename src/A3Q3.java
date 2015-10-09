
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Make a City for the Robot to live in
        City NYC = new City();
        //Make a Robot 
        Robot karel = new Robot(NYC, 1, 2, Direction.NORTH);

        //Make Walls 
        new Wall(NYC, 1, 1, Direction.NORTH);
        new Wall(NYC, 1, 2, Direction.NORTH);
        new Wall(NYC, 1, 3, Direction.NORTH);
        new Wall(NYC, 1, 4, Direction.NORTH);
        new Wall(NYC, 1, 5, Direction.NORTH);
        new Wall(NYC, 1, 5, Direction.EAST);
        new Wall(NYC, 2, 5, Direction.EAST);
        new Wall(NYC, 3, 5, Direction.EAST);
       
        new Wall(NYC, 5, 5, Direction.EAST);
        new Wall(NYC, 5, 5, Direction.SOUTH);
        new Wall(NYC, 5, 4, Direction.SOUTH);
        new Wall(NYC, 5, 3, Direction.SOUTH);
        new Wall(NYC, 5, 2, Direction.SOUTH);
        new Wall(NYC, 5, 1, Direction.SOUTH);
        new Wall(NYC, 1, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.WEST);
        new Wall(NYC, 3, 1, Direction.WEST);
        new Wall(NYC, 4, 1, Direction.WEST);
        new Wall(NYC, 5, 1, Direction.WEST);
      
        //karel turns to the same direction as the exit
         while(karel.getDirection() != Direction.EAST) {
           karel.turnLeft();
       }
         //karel keeps moving that direction as long as the front is clear 
          while(karel.frontIsClear() ) {
           karel.move();
       }  
         //karel moves and rotates if the front is not clear 
          while(true) 
              if(!karel.frontIsClear()) {
           karel.turnLeft();
           karel.turnLeft(); 
           karel.turnLeft();  
           karel.move();
           karel.turnLeft(); 
           
          }else{
                  karel.move(); 
                 break; 
              }
           
           
        
            
        
        
        
        
        
        
        
        
        
        
    }
}
