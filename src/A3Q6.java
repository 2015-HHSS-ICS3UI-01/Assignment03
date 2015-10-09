
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
 * @author kulla6503
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // // Make a city for the Robot to live in
        City NYC = new City();

        //Make a robot to live in the city 
        Robot karel = new Robot(NYC, 3, 3, Direction.SOUTH);

        //Make Walls 
        new Wall(NYC, 1, 1, Direction.NORTH);
        new Wall(NYC, 1, 2, Direction.NORTH);
        new Wall(NYC, 1, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.SOUTH);
        new Wall(NYC, 2, 2, Direction.SOUTH);
        new Wall(NYC, 2, 2, Direction.EAST);
        new Wall(NYC, 1, 2, Direction.EAST);

        new Wall(NYC, 1, 4, Direction.NORTH);
        new Wall(NYC, 1, 5, Direction.NORTH);
        new Wall(NYC, 1, 4, Direction.WEST);
        new Wall(NYC, 2, 4, Direction.WEST);
        new Wall(NYC, 2, 4, Direction.SOUTH);
        new Wall(NYC, 2, 5, Direction.SOUTH);
        new Wall(NYC, 1, 5, Direction.EAST);
        new Wall(NYC, 2, 5, Direction.EAST);

        new Wall(NYC, 4, 5, Direction.NORTH);
        new Wall(NYC, 4, 5, Direction.EAST);
        new Wall(NYC, 5, 5, Direction.EAST);
        new Wall(NYC, 5, 5, Direction.SOUTH);
        new Wall(NYC, 5, 4, Direction.SOUTH);
        new Wall(NYC, 5, 4, Direction.WEST);
        new Wall(NYC, 4, 4, Direction.WEST);
        new Wall(NYC, 4, 4, Direction.NORTH);

        new Wall(NYC, 4, 1, Direction.NORTH);
        new Wall(NYC, 4, 2, Direction.NORTH);
        new Wall(NYC, 4, 1, Direction.WEST);
        new Wall(NYC, 5, 1, Direction.WEST);
        new Wall(NYC, 5, 1, Direction.SOUTH);
        new Wall(NYC, 5, 2, Direction.SOUTH);
        new Wall(NYC, 4, 2, Direction.EAST);
        new Wall(NYC, 5, 2, Direction.EAST);

        //karel loops around the four squares
        for (int loop = 0; loop < 4; loop++) {
            for (int lap = 0; lap < 4; lap++) {
                for (int moveForward = 0; moveForward < 3; moveForward++) {
                    karel.move();
                }
                if (lap < 3) {
                    karel.turnLeft();
                }
            }

        }









    }
}
