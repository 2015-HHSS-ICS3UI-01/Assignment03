
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
 * @author bettk6516
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City jw=new City();
    Robot rob=new Robot(jw,1,1,Direction.EAST);
    new Thing(jw,1,1);
     new Thing(jw,1,1); 
      new Thing(jw,1,1);
       new Thing(jw,1,1);
        new Thing(jw,1,1);
         new Thing(jw,1,1);
          new Thing(jw,1,1);
           new Thing(jw,1,1); 
            new Thing(jw,1,1);
             new Thing(jw,1,1);
           
          
             int thingsPlaced =0;
             for(int rounds = 0; rounds <10; rounds = rounds +1){
             
                 rob.pickThing();
                rob.move();
                
                
                rob.putThing();
             thingsPlaced = thingsPlaced + 1;
                if(thingsPlaced == 10){
                    break;
                }
                
                rob.turnLeft();
                rob.turnLeft();
                rob.move();
                rob.turnLeft();
                rob.turnLeft();
                
                 
             }
           
    
    
    
    
    
    
    }
}
