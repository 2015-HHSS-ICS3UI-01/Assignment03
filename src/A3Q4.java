
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
 * @author hadik9595
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,0,3, Direction.WEST);
        new Wall(kw, 1,1, Direction.WEST);
        new Wall(kw, 2,1, Direction.WEST);
        new Wall(kw, 2,1, Direction.SOUTH);
        new Wall(kw, 2,2, Direction.SOUTH);
        new Wall(kw, 2,2, Direction.EAST);
        new Wall(kw, 1,2, Direction.EAST);
        new Wall(kw, 1,1, Direction.NORTH);
        new Wall(kw, 1,2, Direction.NORTH);
        // Karel moves around twice
        for(int timesTurned= 0; timesTurned < 8; timesTurned = timesTurned + 1){
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
        }
    }
}
