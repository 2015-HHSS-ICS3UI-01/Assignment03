
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
 * @author preej0747
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City kw = new City();
        
        //Place walls
        new Wall (kw, 1,1, Direction.NORTH);
        new Wall (kw, 1,2, Direction.NORTH);
        new Wall (kw, 1,2, Direction.EAST);
        new Wall (kw, 2,2, Direction.EAST);
        new Wall (kw, 2,2, Direction.SOUTH);
        new Wall (kw, 2,1, Direction.SOUTH);
        new Wall (kw, 2,1, Direction.WEST);
        new Wall (kw, 1,1, Direction.WEST);
        new Wall (kw, 1,4, Direction.NORTH);
        new Wall (kw, 1,5, Direction.NORTH);
        new Wall (kw, 1,5, Direction.EAST);
        new Wall (kw, 2,5, Direction.EAST);
        new Wall (kw, 2,5, Direction.SOUTH);
        new Wall (kw, 2,4, Direction.SOUTH);
        new Wall (kw, 2,4, Direction.WEST);
        new Wall (kw, 1,4, Direction.WEST);
        new Wall (kw, 4,1, Direction.NORTH);
        new Wall (kw, 4,2, Direction.NORTH);
        new Wall (kw, 4,2, Direction.EAST);
        new Wall (kw, 5,2, Direction.EAST);
        new Wall (kw, 5,2, Direction.SOUTH);
        new Wall (kw, 5,1, Direction.SOUTH);
        new Wall (kw, 5,1, Direction.WEST);
        new Wall (kw, 4,1, Direction.WEST);
        new Wall (kw, 4,4, Direction.NORTH);
        new Wall (kw, 4,5, Direction.NORTH);
        new Wall (kw, 4,5, Direction.EAST);
        new Wall (kw, 5,5, Direction.EAST);
        new Wall (kw, 5,5, Direction.SOUTH);
        new Wall (kw, 5,4, Direction.SOUTH);
        new Wall (kw, 5,4, Direction.WEST);
        new Wall (kw, 4,4, Direction.WEST);
        
        //Make robot
        Robot jonny = new Robot(kw, 3,3, Direction.SOUTH);
        
        //Program robot to move around obstacles
        int timesTurned = 0;
        while(timesTurned < 4){
            jonny.move();
            jonny.move();
            jonny.move();
            jonny.turnLeft();
            jonny.move();
            jonny.move();
            jonny.move();
            jonny.turnLeft();
            jonny.move();
            jonny.move();
            jonny.move();
            jonny.turnLeft();
            jonny.move();
            jonny.move();
            jonny.move();
            timesTurned = timesTurned + 1;
                 
        }
    }
}
