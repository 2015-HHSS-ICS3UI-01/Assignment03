
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //made a city in which to program in
        City kw = new City();
        //made a robot named beep
        Robot beep = new Robot(kw, 2, 2, Direction.SOUTH);
        //made walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);

        //while beep's front is clear, he will execute the following commands
        while (beep.frontIsClear()) {
            beep.move();

        }
        //beep will always execute the following commands
        while (true) {


            //if beep's front is clear, 
            //he will excute the following commands
            if (beep.frontIsClear()) {
                beep.move();
            }
            //if beep's front is clear, 
            //he will excute the following commands
            if (beep.frontIsClear()) {
                beep.turnLeft();
                //if beep's front is clear, 
                //he will excute the following commands
                if (beep.frontIsClear()) {
                    beep.turnLeft();
                    //if beep's front is clear, 
                    //he will excute the following commands
                    if (beep.frontIsClear()) {
                        beep.turnLeft();
                        //if beep's front is clear, 
                        //he will excute the following commands
                        if (beep.frontIsClear()) {
                            beep.move();
                            //breaks the program out of the while loop
                            break;
                        }
                    }


                }
            }
            while (!beep.frontIsClear()) {

                beep.turnLeft();
            }



        }











    }
}
