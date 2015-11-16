
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
 * @author ramli8368
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        new Thing(kw, 3, 2);
        new Thing(kw, 3, 3);
        new Wall(kw, 3, 4, Direction.WEST);

        Robot commando = new Robot(kw, 3, 0, Direction.EAST);



        while (commando.frontIsClear()) {
            commando.move();
            //This will make commando break. whenever a wall is in front of him
            if (commando.canPickThing()) {
                break;
                //This will make commando break, if he comes across any thing
            }



        }
    }
}