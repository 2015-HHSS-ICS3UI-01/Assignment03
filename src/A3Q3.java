
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
 * @author moraj0721
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City
        City cap = new City();
        
        //Make a Robot
        Robot muntake = new Robot(cap, 3, 2, Direction.EAST);
        
        //WEST WALL
        new Wall(cap, 1, 1, Direction.WEST);
        new Wall(cap, 2, 1, Direction.WEST);
        new Wall(cap, 3, 1, Direction.WEST);
        new Wall(cap, 4, 1, Direction.WEST);
        new Wall(cap, 4, 1, Direction.WEST);
        
        //SOUTH WALL
        new Wall(cap, 4, 1, Direction.SOUTH);
        new Wall(cap, 4, 2, Direction.SOUTH);
        new Wall(cap, 4, 3, Direction.SOUTH);
        new Wall(cap, 4, 4, Direction.SOUTH);
        new Wall(cap, 4, 5, Direction.SOUTH);
        
        //EAST
        new Wall(cap, 4, 5, Direction.EAST);
        new Wall(cap, 3, 5, Direction.EAST);
        new Wall(cap, 1, 5, Direction.EAST);
        
        //NORTH WALL
        new Wall(cap, 1, 5, Direction.NORTH);
        new Wall(cap, 1, 4, Direction.NORTH);
        new Wall(cap, 1, 3, Direction.NORTH);
        new Wall(cap, 1, 2, Direction.NORTH);
        new Wall(cap, 1, 1, Direction.NORTH);
        
        //Make the Robot escape the box3
        
         muntake.turnLeft();
       while(true){
           
           muntake.move();
           if(muntake.frontIsClear()){
               muntake.turnLeft();
               
              
               
               
           } if(!muntake.frontIsClear()){
                   muntake.turnLeft();
                   muntake.turnLeft();
                   muntake.turnLeft();
       
           
           }  if(muntake.getAvenue()== 6 && muntake.getStreet()==2){
               break;
           }
       } muntake.turnLeft();
       muntake.turnLeft();
       muntake.turnLeft();
            
        }
        
        
        
    }


