
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
 * @author moraj0721
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a City
        City cap = new City();

        //Make a Robot
        Robot jonpey = new Robot(cap, 3, 3, Direction.SOUTH);

        //Make NorthWest Square
        new Wall(cap, 2, 2, Direction.EAST);
        new Wall(cap, 1, 2, Direction.EAST);
        new Wall(cap, 1, 2, Direction.NORTH);
        new Wall(cap, 1, 1, Direction.NORTH);
        new Wall(cap, 1, 1, Direction.WEST);
        new Wall(cap, 2, 1, Direction.WEST);
        new Wall(cap, 2, 1, Direction.SOUTH);
        new Wall(cap, 2, 2, Direction.SOUTH);

        //Make NorthEast Square
        new Wall(cap, 2, 5, Direction.EAST);
        new Wall(cap, 1, 5, Direction.EAST);
        new Wall(cap, 1, 5, Direction.NORTH);
        new Wall(cap, 1, 4, Direction.NORTH);
        new Wall(cap, 1, 4, Direction.WEST);
        new Wall(cap, 2, 4, Direction.WEST);
        new Wall(cap, 2, 4, Direction.SOUTH);
        new Wall(cap, 2, 5, Direction.SOUTH);

        //Make SouthEast Square
        new Wall(cap, 5, 5, Direction.EAST);
        new Wall(cap, 4, 5, Direction.EAST);
        new Wall(cap, 4, 5, Direction.NORTH);
        new Wall(cap, 4, 4, Direction.NORTH);
        new Wall(cap, 4, 4, Direction.WEST);
        new Wall(cap, 5, 4, Direction.WEST);
        new Wall(cap, 5, 4, Direction.SOUTH);
        new Wall(cap, 5, 5, Direction.SOUTH);

        //Make SouthWest Square
        new Wall(cap, 5, 2, Direction.EAST);
        new Wall(cap, 4, 2, Direction.EAST);
        new Wall(cap, 4, 2, Direction.NORTH);
        new Wall(cap, 4, 1, Direction.NORTH);
        new Wall(cap, 4, 1, Direction.WEST);
        new Wall(cap, 5, 1, Direction.WEST);
        new Wall(cap, 5, 1, Direction.SOUTH);
        new Wall(cap, 5, 2, Direction.SOUTH);

        for (int loops = 4; loops > 0; loops--) {
        
        for (int loops2 = 4; loops2 > 0; loops2--) {
            jonpey.move();
            jonpey.move();
            jonpey.move();


            if (jonpey.getAvenue() == 3 && jonpey.getStreet() == 3) {
                break;
            }
            jonpey.turnLeft();

        }

        }
        
        








    }
}
