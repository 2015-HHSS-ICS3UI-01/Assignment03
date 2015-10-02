
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 0, 2, Direction.WEST);
        
        // make walls for robot to move around
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        
        // make karel move around the perimeter of the walls 2 twice
        // and then stop after
        
        // make a variable for the 8 sides karel needs to repeat
        // every time it moves along a side the variable will be subtracted by one
        // therefore at the end karel will stop where he started
        for(int moveSide = 8; moveSide != 0; moveSide = moveSide - 1){
            // move karel forward twice until he is at the corner of the building
            karel.move();
            karel.move();
            // move karel left to direct him down the other side and then move him once
            karel.turnLeft();
            karel.move();
        }
    }
    
}
