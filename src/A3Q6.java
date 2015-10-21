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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();    
       //create Robot
        Robot karel = new Robot(kw,3,3,Direction.SOUTH);
        
        //create walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,4,2,Direction.NORTH);
        new Wall(kw,4,2,Direction.EAST);
        new Wall(kw,5,1,Direction.SOUTH);
        new Wall(kw,5,1,Direction.WEST);
        new Wall(kw,5,2,Direction.SOUTH);
        new Wall(kw,5,2,Direction.EAST);
        
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,5,Direction.EAST);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,5,Direction.EAST);
        
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,4,5,Direction.NORTH);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,5,4,Direction.SOUTH);
        new Wall(kw,5,4,Direction.WEST);
        new Wall(kw,5,5,Direction.SOUTH);
        new Wall(kw,5,5,Direction.EAST);
        
        //make a loop to go around each square
        for (int loop = 0; loop < 4; loop = loop + 1){
            for(int laps =0; laps < 4; laps = laps +1){
                //make karel move 3 before turning left
                for(int move =0; move < 3; move = move +1){
                karel.move();
                }
                //make karel turn left 
                if (laps < 3){
                    karel.turnLeft();
            }
            }
        
    }
        
    }
}
