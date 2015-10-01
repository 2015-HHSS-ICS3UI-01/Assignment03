
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
 * @author hadik9595
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        while (true) {
            if (karel.canPickThing()) {
                karel.pickThing();
            } else if (karel.frontIsClear()) {
                karel.move();

            } else if (!karel.frontIsClear() && (karel.getDirection() == Direction.EAST)) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            //Everytime he's finished an odd row he turns
            if (karel.getDirection() == Direction.SOUTH && (karel.frontIsClear())) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                //Everytime he reaches an even end of a row he heads to the next

            } else if (karel.getDirection() == Direction.WEST && (!karel.frontIsClear())) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                //Once karel is done, he stops by facing south indicating completion.
            } else if (karel.getDirection() == Direction.SOUTH && (!karel.frontIsClear())) {
                karel.turnLeft();
                karel.turnLeft();
                break;

            }
        }
        // Karel safely going home
        while (true) {
            if (karel.getStreet() > 1) {
                karel.move();

            } else if (!karel.frontIsClear()) {

                karel.turnLeft();
            } else if (karel.getAvenue() > 1) {
                karel.move();
                        
                    }

        }

    }
}
