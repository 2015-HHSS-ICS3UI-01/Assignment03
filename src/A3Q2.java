
import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City detroit = new City();

        new Wall(detroit, 1, 1, Direction.NORTH);
        new Wall(detroit, 1, 2, Direction.NORTH);
        new Wall(detroit, 1, 3, Direction.NORTH);
        new Wall(detroit, 1, 4, Direction.NORTH);

        new Wall(detroit, 1, 4, Direction.EAST);
        new Wall(detroit, 2, 4, Direction.EAST);
        new Wall(detroit, 3, 4, Direction.EAST);

        new Wall(detroit, 3, 4, Direction.SOUTH);
        new Wall(detroit, 3, 3, Direction.SOUTH);
        new Wall(detroit, 3, 2, Direction.SOUTH);
        new Wall(detroit, 3, 1, Direction.SOUTH);

        new Wall(detroit, 3, 1, Direction.WEST);
        new Wall(detroit, 2, 1, Direction.WEST);
        new Wall(detroit, 1, 1, Direction.WEST);

        Robot matt = new Robot(detroit, 1, 1, Direction.EAST);

        new Thing(detroit, 1, 2);
        new Thing(detroit, 2, 2);
        new Thing(detroit, 2, 3);
        new Thing(detroit, 2, 4);
        new Thing(detroit, 3, 4);
        new Thing(detroit, 3, 1);

        while (matt.frontIsClear()) {
            matt.move();
            if (matt.canPickThing()) {
                matt.pickThing();
            }
        }
        if (!matt.frontIsClear()) {
            matt.turnLeft();
            matt.turnLeft();
        }while(matt.frontIsClear()){
            matt.move();
        }

    }
}
