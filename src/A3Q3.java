
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
 * @author bettk6516
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        City jw =new City();
        Robot rob = new Robot(jw,3,3,Direction.EAST);
        new Wall(jw,1,1,Direction.NORTH);
        new Wall(jw,1,1,Direction.WEST);
        new Wall(jw,2,1,Direction.WEST);
        new Wall(jw,3,1,Direction.WEST);
        new Wall(jw,4,1,Direction.WEST);
        new Wall(jw,5,1,Direction.WEST);
        new Wall(jw,5,1,Direction.SOUTH);
        new Wall(jw,5,2,Direction.SOUTH);
        
        new Wall(jw,5,4,Direction.SOUTH);
        new Wall(jw,5,4,Direction.EAST);
        new Wall(jw,4,4,Direction.EAST);
        new Wall(jw,3,4,Direction.EAST);
        new Wall(jw,2,4,Direction.EAST);
        new Wall(jw,1,4,Direction.EAST);
        new Wall(jw,1,4,Direction.NORTH);
    new Wall(jw,1,2,Direction.NORTH);
    new Wall(jw,1,3,Direction.NORTH);
    
    while(rob.frontIsClear()){
        rob.move();
    }
    
    
    while(true){
   if(rob.frontIsClear()){
        rob.turnLeft();
   if(rob.frontIsClear()){
       rob.move();
       break;
       
   }
   }
        if(!rob.frontIsClear()){
            rob.turnLeft();
            rob.turnLeft();
            rob.turnLeft();
     rob.move();
        
        
        }
        
       
        
    
    }
    
    
    
    
    }
}
