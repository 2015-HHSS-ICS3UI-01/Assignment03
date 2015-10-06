
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
 * @author moore3607
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//made a new city in which to program in
        City kw = new City();
        //made a new robot named beep
        Robot beep = new Robot(kw, 0, 2, Direction.WEST);
//made walls
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);

//made the variable "moveamount" equal 8
        int moveamount = 8;
        //while the variabl;e equals anything above zero, 
        //beep will execute the following commands
        while (moveamount > 0) {

            beep.move();
            beep.move();
            beep.turnLeft();
            beep.move();
            moveamount = moveamount - 1;
        }








    }
}
