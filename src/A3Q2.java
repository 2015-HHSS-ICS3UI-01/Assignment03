
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();

        //make walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        //make robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //make things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //make karel pick up the trash
        while (true)
            if(karel.canPickThing()) {
                karel.pickThing();
            } else if(karel.frontIsClear()) {
                karel.move();
            } else if(karel.frontIsClear() == false) {
                karel.turnLeft();
            } 
        
        
        
         //make karel find street 1
        while (true)
            if (karel.getDirection() != Direction.NORTH) {
                karel.turnLeft();
            } else if (karel.getStreet() > 1) {
                karel.move();
            } else if (karel.getStreet() == 1) {
                break;
            }
        
        karel.turnLeft();

        //make karel find avenue 1
        while (true) {
            if (karel.getAvenue() > 1) {
                karel.move();
            } else if (karel.getAvenue() == 1) {
                break;
            }
        }
    }
}
