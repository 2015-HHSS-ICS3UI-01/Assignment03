
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
 * @author agott2059
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city, robot and environment
        City thomas = new City();
        
        Robot tom = new Robot(thomas, 1,2, Direction.WEST);
        
                new Wall(thomas,1,1, Direction.NORTH);
                
                
        new Wall(thomas,1,1, Direction.WEST);
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
        
//get to edge of room
        while(tom.frontIsClear())
        {
            tom.move();
        }
//turn left
        tom.turnLeft();
        
//a right-side follower:

//loop until hole is found
        while(true)
        {
//if front is clear move forward and turn right and check for hole
        if(tom.frontIsClear()){
            tom.move();
            tom.turnLeft();
            tom.turnLeft();
            tom.turnLeft();
            if(tom.frontIsClear()){
                tom.move();
//if hole is found, 'break; (end program)
                break;
//if hole is not found turn left and continue
            }else{
                tom.turnLeft();
            }
//if corner is reached, turn left and continue
        }else{
            tom.turnLeft();
        }
        }
    }
}
