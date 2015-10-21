
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
 * @author agott2059
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create city and robot

        City thomas = new City();

        Robot tom = new Robot(thomas, 3, 3, Direction.SOUTH);

        //create squares in city

        new Wall(thomas, 1, 1, Direction.NORTH);
        new Wall(thomas, 1, 1, Direction.WEST);
        new Wall(thomas, 2, 1, Direction.WEST);
        new Wall(thomas, 2, 1, Direction.SOUTH);
        new Wall(thomas, 2, 2, Direction.SOUTH);
        new Wall(thomas, 2, 2, Direction.EAST);
        new Wall(thomas, 1, 2, Direction.NORTH);
        new Wall(thomas, 1, 2, Direction.EAST);

        new Wall(thomas, 1, 4, Direction.NORTH);
        new Wall(thomas, 1, 4, Direction.WEST);
        new Wall(thomas, 1, 5, Direction.NORTH);
        new Wall(thomas, 1, 5, Direction.EAST);
        new Wall(thomas, 2, 4, Direction.WEST);
        new Wall(thomas, 2, 4, Direction.SOUTH);
        new Wall(thomas, 2, 5, Direction.SOUTH);
        new Wall(thomas, 2, 5, Direction.EAST);

        new Wall(thomas, 4, 1, Direction.NORTH);
        new Wall(thomas, 4, 1, Direction.WEST);
        new Wall(thomas, 4, 2, Direction.NORTH);
        new Wall(thomas, 4, 2, Direction.EAST);
        new Wall(thomas, 5, 1, Direction.WEST);
        new Wall(thomas, 5, 1, Direction.SOUTH);
        new Wall(thomas, 5, 2, Direction.SOUTH);
        new Wall(thomas, 5, 2, Direction.EAST);

        new Wall(thomas, 4, 4, Direction.NORTH);
        new Wall(thomas, 4, 4, Direction.WEST);
        new Wall(thomas, 4, 5, Direction.NORTH);
        new Wall(thomas, 4, 5, Direction.EAST);
        new Wall(thomas, 5, 4, Direction.WEST);
        new Wall(thomas, 5, 4, Direction.SOUTH);
        new Wall(thomas, 5, 5, Direction.SOUTH);
        new Wall(thomas, 5, 5, Direction.EAST);


//repeat program 4 times (4 squares)
        for (int aroundSquare = 0; aroundSquare < 4; aroundSquare = aroundSquare + 1) {
//move around 1 side of square
            tom.move();
            tom.move();
            tom.move();
//move around rest of 3 sides and coninue to next square
            for (int squareSide = 0; squareSide < 3; squareSide = squareSide + 1) {
                tom.turnLeft();
                tom.move();
                tom.move();
                tom.move();
            }

        }
    }
}
