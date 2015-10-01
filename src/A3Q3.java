
import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import becker.robots.Robot;
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot houdini = new Robot(kw, 3, 4, Direction.NORTH);

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);

        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        //exit at 3,6,east
        new Wall(kw, 4, 6, Direction.EAST);
        new Wall(kw, 5, 6, Direction.EAST);
        new Wall(kw, 6, 6, Direction.EAST);

        new Wall(kw, 6, 6, Direction.SOUTH);
        new Wall(kw, 6, 5, Direction.SOUTH);
        new Wall(kw, 6, 4, Direction.SOUTH);
        new Wall(kw, 6, 3, Direction.SOUTH);
        new Wall(kw, 6, 2, Direction.SOUTH);
        new Wall(kw, 6, 1, Direction.SOUTH);

        new Wall(kw, 6, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall (kw,4,1,Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);

        while (houdini.frontIsClear()) {
            houdini.move();

        }
        while (true) {
            houdini.turnLeft();
            if (houdini.frontIsClear()) {
                houdini.move();
                houdini.turnLeft();
                houdini.turnLeft();
                houdini.turnLeft();
                if (houdini.frontIsClear()) {
                    houdini.move();
                    if(houdini.frontIsClear()){
                        break;
                    }

                }
            }
        }
    }
}
