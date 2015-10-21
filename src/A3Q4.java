/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author malcr1272
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city 
        City kw = new City();
        
        //Make Robot
        Robot karel = new Robot(kw,0,2,Direction.WEST);
        
        //Make walls
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,1,Direction.SOUTH);
        
        //Make karel loop around wall
        
        
        for (int turn= 0; turn < 8; turn = turn+ 1){
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        
    }       
        
        
        
    }
}
