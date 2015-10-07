
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
 * @author moraj0721
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a City
        City cap = new City();

        //Make a Robot
        Robot carter = new Robot(cap, 0, 1, Direction.EAST);

        //Make a Wall
        new Wall(cap, 0, 1, Direction.NORTH);
        new Wall(cap, 0, 2, Direction.NORTH);
        new Wall(cap, 0, 3, Direction.NORTH);
        new Wall(cap, 0, 4, Direction.NORTH);
        new Wall(cap, 0, 1, Direction.WEST);
        new Wall(cap, 1, 1, Direction.WEST);
        new Wall(cap, 2, 1, Direction.WEST);
        new Wall(cap, 2, 1, Direction.SOUTH);
        new Wall(cap, 2, 2, Direction.SOUTH);
        new Wall(cap, 2, 3, Direction.SOUTH);
        new Wall(cap, 2, 4, Direction.SOUTH);
        new Wall(cap, 2, 4, Direction.EAST);
        new Wall(cap, 0, 4, Direction.EAST);
        new Wall(cap, 1, 4, Direction.EAST);

        //Make a Thing
        new Thing(cap, 0, 2);
        new Thing(cap, 1, 2);
        new Thing(cap, 2, 3);
        new Thing(cap, 1, 3);
        new Thing(cap, 1, 4);
        new Thing(cap, 2, 1);

        //Make carter pick up litter

        while (carter.frontIsClear()) {
            carter.move();

            if (carter.canPickThing()) {
                carter.pickThing();
            }

            while (!carter.frontIsClear()) {
                carter.turnLeft();
                carter.turnLeft();
                carter.turnLeft();
            }

            if (carter.getAvenue() == 1 && carter.getStreet() == 1) {
                carter.turnLeft();
                carter.turnLeft();
                carter.turnLeft();
                break;
        }
        }
        
         while(carter.frontIsClear()){
                 carter.move();
                 
                 if(carter.canPickThing())
                     carter.pickThing();
                 
                 while(!carter.frontIsClear())
                     carter.turnLeft();
                 
                 if (carter.getAvenue() == 1 && carter.getStreet() == 0) {
                     
                     break;
                     
             }

    }
         carter.turnLeft();
         
    }
}
