
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        //Make a robot to live in the city
        Robot matt = new Robot(kw, 3, 3, Direction.SOUTH);
        
        //Make a wall
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 5, Direction.NORTH);
        new Wall (kw, 4, 1, Direction.NORTH);
        new Wall (kw, 4, 2, Direction.NORTH);
        new Wall (kw, 4, 4, Direction.NORTH);
        new Wall (kw, 4, 5, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 4, 1, Direction.WEST);
        new Wall (kw, 5, 1, Direction.WEST);
        new Wall (kw, 1, 4, Direction.WEST);
        new Wall (kw, 2, 4, Direction.WEST);
        new Wall (kw, 4, 4, Direction.WEST);
        new Wall (kw, 5, 4, Direction.WEST);
        new Wall (kw, 5, 1, Direction.SOUTH);
        new Wall (kw, 5, 2, Direction.SOUTH);
        new Wall (kw, 5, 4, Direction.SOUTH);
        new Wall (kw, 5, 5, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 4, Direction.SOUTH);
        new Wall (kw, 2, 5, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 4, 2, Direction.EAST);
        new Wall (kw, 5, 2, Direction.EAST);
        new Wall (kw, 1, 5, Direction.EAST);
        new Wall (kw, 2, 5, Direction.EAST);
        new Wall (kw, 4, 5, Direction.EAST);
        new Wall (kw, 5, 5, Direction.EAST);
        
        for (int loops = 4; loops >0; loops--){
        
        for (int loops2 = 4; loops2 >0; loops2--){
            matt.move();
            matt.move();
            matt.move();
            
            
          
            if (matt.getAvenue()== 3 && matt.getStreet()==3){
            break;
          }  
           matt.turnLeft();
        }
        
        }
        
        
    }
}
