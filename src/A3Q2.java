
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    City jw=new City();
    Robot rob=new Robot(jw,1,1,Direction.EAST);
    new Wall(jw,1,1,Direction.WEST);
    new Wall(jw,1,1,Direction.NORTH);
    new Wall(jw,1,2,Direction.NORTH);
    new Wall(jw,1,3,Direction.NORTH);
    new Wall(jw,1,4,Direction.NORTH);
    new Wall(jw,1,4,Direction.EAST);
    new Wall(jw,2,4,Direction.EAST);
    new Wall(jw,3,4,Direction.EAST);
    new Wall(jw,3,4,Direction.SOUTH);
    new Wall(jw,3,3,Direction.SOUTH);
    new Wall(jw,3,2,Direction.SOUTH);
    new Wall(jw,3,1,Direction.SOUTH);
    new Wall(jw,3,1,Direction.WEST);
    new Wall(jw,2,1,Direction.WEST);
    //walls for days
    
    new Thing(jw,1,2);
    new Thing(jw,2,2);
    new Thing(jw,2,3);
    new Thing(jw,2,4);
    new Thing(jw,3,4);
    new Thing(jw,3,1);
    //Things!!!
    
    while(true){
     while(rob.frontIsClear()){
           rob.turnLeft();
              if(!rob.frontIsClear()){
                  rob.turnLeft();
                  rob.turnLeft();
                  rob.turnLeft();
              }        
            if (rob.frontIsClear()){
         
                rob.move();
          if(rob.canPickThing()){
              rob.pickThing();
          }
          
          
        }
    if(!rob.frontIsClear()){
        rob.turnLeft();
        if(rob.frontIsClear()){
            rob.move();
        }
    }
       }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
        
     
    
    
    }
    
}
}
