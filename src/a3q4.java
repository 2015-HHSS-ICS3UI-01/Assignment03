
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
 * @author lalim9800
 */
public class a3q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city 
        City kw=new City();
        Robot lali=new Robot(kw,1,2,Direction.WEST);
        
        //make walls west 
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,3,1,Direction.WEST);
        
        //make walls north side 
        new Wall(kw,2,1,Direction.NORTH);
        new Wall(kw,2,2,Direction.NORTH);
        
        //make walls south side 
        new Wall(kw,3,1,Direction.SOUTH);
        new Wall(kw,3,2,Direction.SOUTH);
        
        //make walls easdt side
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,3,2,Direction.EAST);
        
        
        //make robot move 2 times around wall(8 times around sides)
        
        
        int lap=0;
       
        
       
        
                
         while(lap!=8){
         
         lali.move();
         lali.move();
         lali.turnLeft();
         lali.move();
         lap++;
         }
                 
         
         
       
                
        
      
        
    }
}
