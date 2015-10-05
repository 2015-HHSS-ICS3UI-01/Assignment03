
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
 * @author mitrm7692
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        //Make a Robot
        Robot karel=new Robot(kw,0,2,Direction.WEST);
        //Make Walls
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        //Make karel move around square
        int moveAmount=0;
        while(moveAmount!=8){
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            moveAmount++;
        }
    }
}
