
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 3, 3, Direction.SOUTH);
        
        // make walls within city for karel to move around
        // box 1 top right corner
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.NORTH);
        
        // box 2 bottom right corner
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.NORTH);
        
        // box 3 top left corner
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.NORTH);
        
        // box 4 bottom right corner
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.NORTH);
        
        // make karel loop around every box of wall and stop back where he started
        
        // make variable for each of the boxes to wall/cover
        // make karel walk all 4 box and stop back where he started
        // make the variable increase by 1 box as he walks each complete box
        for(int boxesWalked = 0; boxesWalked < 4; boxesWalked = boxesWalked + 1){
            // make karel walk the box by moving three times 
            // and then turn left to face down the next side of the box
            // repeating 4 times walks all 4 sides of the box
            for ( int boxSide = 0; boxSide < 4; boxSide = boxSide + 1 ){
                karel.move();
                karel.move();
                karel.move();
                
                // turn left to face next side of box for the first
                // 3 sides of the box, but don't turn left on last side
                // to avoid karel having to spin to face next box. 
                if ( boxSide < 3 ) {
                    karel.turnLeft();
                }
            }
        }
    }
}
