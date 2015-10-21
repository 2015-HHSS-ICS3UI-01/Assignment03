
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
 * @author agott2059
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city, robot and environment
        City thomas = new City();
        
        Robot tom = new Robot(thomas, 1,1, Direction.EAST);
        
        new Wall(thomas,1,1, Direction.NORTH);
        new Wall(thomas,1,1, Direction.WEST);
        new Wall(thomas,2,1, Direction.WEST);
        new Wall(thomas,3,1, Direction.WEST);
        new Wall(thomas,4,1, Direction.WEST);
        new Wall(thomas,4,1, Direction.SOUTH);
        new Wall(thomas,4,2, Direction.SOUTH);
        new Wall(thomas,4,3, Direction.SOUTH);
        new Wall(thomas,4,3, Direction.EAST);
        new Wall(thomas,3,3, Direction.EAST);
        new Wall(thomas,2,3, Direction.EAST);
        new Wall(thomas,1,3, Direction.EAST);
        new Wall(thomas,1,3, Direction.NORTH);
        new Wall(thomas,1,2, Direction.NORTH);
        
        new Thing(thomas,2,2);
        new Thing(thomas,2,2);
        new Thing(thomas,3,2);
        new Thing(thomas,3,3);
        new Thing(thomas,1,3);
        new Thing(thomas,2,1);
        new Thing(thomas,2,3);
//loop program
        while(true)
   //go right until front is clear         
        if(tom.frontIsClear()){
            tom.move();
  //use while loop in more than one thing on intersections
        while(tom.canPickThing())
        {
            tom.pickThing();
        }
  //if the front isn't clear, progress to next row while also picking things      
        }else{
            tom.turnLeft();
            tom.turnLeft();
            tom.turnLeft();
            tom.move();
            while(tom.canPickThing())
            {
                tom.pickThing();
            }
            tom.turnLeft();
            tom.turnLeft();
            tom.turnLeft();
   //continue on row goind toward the left, while picking things         
        while(tom.frontIsClear())
        {
            tom.move();
            while(tom.canPickThing())
            {
                tom.pickThing();
            }
        }
        tom.turnLeft();
        //use 'check if' to know if robot is done going through room
        if(tom.frontIsClear()){
        tom.move();
        while(tom.canPickThing())
        {
            tom.pickThing();
        }
        tom.turnLeft();
    //if program comes to this section, end of room was reached
        }else{
    //turn toward orgin
            tom.turnLeft();
            tom.turnLeft();
            while(tom.frontIsClear())
            {
                tom.move();
            }
            //get robot to face East
            tom.turnLeft();
            tom.turnLeft();
            tom.turnLeft();
            //break loop (robot is finished)
            break;
        }
        }
        
    }
}
