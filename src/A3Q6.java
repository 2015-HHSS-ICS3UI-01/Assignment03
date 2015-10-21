
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
 * @author eadil1765
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City L = new City();
        new Wall(L, 1, 1, Direction.WEST);
        new Wall(L, 2, 1, Direction.WEST);
        new Wall(L, 1, 1, Direction.NORTH);
        new Wall(L, 1, 2, Direction.NORTH);
        new Wall(L, 1, 2, Direction.EAST);
        new Wall(L, 2, 2, Direction.EAST);
        new Wall(L, 2, 1, Direction.SOUTH);
        new Wall(L, 2, 2, Direction.SOUTH);

        new Wall(L, 4, 1, Direction.WEST);
        new Wall(L, 5, 1, Direction.WEST);
        new Wall(L, 4, 1, Direction.NORTH);
        new Wall(L, 4, 2, Direction.NORTH);
        new Wall(L, 4, 2, Direction.EAST);
        new Wall(L, 5, 2, Direction.EAST);
        new Wall(L, 5, 2, Direction.SOUTH);
        new Wall(L, 5, 1, Direction.SOUTH);

        new Wall(L, 4, 4, Direction.WEST);
        new Wall(L, 5, 4, Direction.WEST);
        new Wall(L, 4, 4, Direction.NORTH);
        new Wall(L, 4, 5, Direction.NORTH);
        new Wall(L, 4, 5, Direction.EAST);
        new Wall(L, 5, 5, Direction.EAST);
        new Wall(L, 5, 4, Direction.SOUTH);
        new Wall(L, 5, 5, Direction.SOUTH);

        new Wall(L, 1, 4, Direction.WEST);
        new Wall(L, 2, 4, Direction.WEST);
        new Wall(L, 1, 4, Direction.NORTH);
        new Wall(L, 1, 5, Direction.NORTH);
        new Wall(L, 1, 5, Direction.EAST);
        new Wall(L, 2, 5, Direction.EAST);
        new Wall(L, 2, 4, Direction.SOUTH);
        new Wall(L, 2, 5, Direction.SOUTH);

        Robot Liam = new Robot(L, 3, 3, Direction.SOUTH);
        for (int loop = 0; loop < 4; loop = loop + 1) {
        for (int laps = 0; laps < 4; laps = laps + 1) {
        for (int move = 0; move < 3; move = move + 1) {
        Liam.move();
                }
        if (laps < 3){
        Liam.turnLeft();
        }
        
            }
        }

    }
}
