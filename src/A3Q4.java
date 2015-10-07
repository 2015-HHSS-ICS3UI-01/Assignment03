
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a City
        City cap = new City();

        //Make a Robot 
        Robot jp = new Robot(cap, 0, 2, Direction.WEST);

        //Make Walls
        new Wall(cap, 1, 1, Direction.WEST);
        new Wall(cap, 2, 1, Direction.WEST);

        new Wall(cap, 2, 1, Direction.SOUTH);
        new Wall(cap, 2, 2, Direction.SOUTH);



        new Wall(cap, 2, 2, Direction.EAST);
        new Wall(cap, 1, 2, Direction.EAST);


        new Wall(cap, 1, 2, Direction.NORTH);
        new Wall(cap, 1, 1, Direction.NORTH);

        //Make the Robot move around the square
        
        jp.move();
        jp.move();
        jp.turnLeft();

        for (int loops = 7; loops > 0; loops--) {
            jp.move();
            jp.move();
            jp.move();
            jp.turnLeft();

        }

    }
}
