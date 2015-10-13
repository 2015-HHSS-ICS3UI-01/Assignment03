
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        Robot karel = new Robot(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);



        while (true) {
            // Karel turns north! and moves until he hits a wall
            if (karel.getDirection() != Direction.NORTH) {
                karel.turnLeft();

            } else if (karel.frontIsClear()) {
                karel.move();

            } else {
                break;
            }
        }
        //Karel keeps checking for an exit until he finds one he stops
        while (true) {
            if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                
            } else {
                karel.move();
                break;

            }
        }
    }
}
