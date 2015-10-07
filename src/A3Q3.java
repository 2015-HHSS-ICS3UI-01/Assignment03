
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
 * @author snowc4636
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        //Make a robot to live in the city
        Robot jacob = new Robot(kw, 2, 2, Direction.NORTH);
        
        //Make a wall
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        
        while (true) {
        
        jacob.move();
        if (jacob.frontIsClear()){
           jacob.turnLeft();
           
           
           
           
        }
        if (!jacob.frontIsClear()){
            jacob.turnLeft();
            jacob.turnLeft();
            jacob.turnLeft();
            
                    
        }  if (jacob.getAvenue()== 6 && jacob.getStreet()==3){
            break;
        }
     }jacob.turnLeft();
     jacob.turnLeft();
     jacob.turnLeft();
    
        }
        
        
      
        
    }

