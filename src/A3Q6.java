
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//made a new city in which to program in
        City kw = new City();
        //made a new robot named beep
        Robot beep = new Robot(kw, 3, 3, Direction.SOUTH);
//made walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.SOUTH);

//made the variable "moveamount" equal 13
        int moveamount = 13;
        //made the variable "movement" equal 3
        int movement = 3;
        //while "moveamount" equals anything above zero, 
        //the following commands will be executed
        while (moveamount > 0) {
            beep.move();
            beep.move();
            beep.move();
//if beep is on the given location, he will execute the following commands
            if (beep.getAvenue() == 3) {
                if (beep.getStreet() == 3) {
                    //if "movement" equals anything above zero, 
                    //the following commands will be executed
                    if (movement > 0) {
                        beep.move();
                        beep.move();
                        beep.move();
                        movement--;
                    }
                    //if "movement" equals zero,
                    //the following command will be executed
                    else {
                        //breaks the program out of the while loop
                        break;
                    }
                }
            }

            beep.turnLeft();
            moveamount = moveamount - 1;
        }






    }
}
