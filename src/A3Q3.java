
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
 * @author preej0747
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City kw = new City();
        
        //Make robot
        Robot jonny = new Robot(kw, 1,1, Direction.EAST);
        
        //Place walls
        new Wall (kw, 1,1, Direction.NORTH);
        new Wall (kw, 1,2, Direction.NORTH);
        new Wall (kw, 1,3, Direction.NORTH);
        new Wall (kw, 1,3, Direction.EAST);
        new Wall (kw, 2,3, Direction.EAST);
        new Wall (kw, 3,3, Direction.EAST);
        new Wall (kw, 3,3, Direction.SOUTH);
        new Wall (kw, 3,2, Direction.SOUTH);
        new Wall (kw, 3,1, Direction.WEST);
        new Wall (kw, 2,1, Direction.WEST);
        new Wall (kw, 1,1, Direction.WEST);
        
        //Program robot to escape
        while( jonny.countThingsInBackpack()==0){
            jonny.turnLeft();
            if( jonny.frontIsClear()){
                jonny.move();
            }
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.turnLeft();
            
            jonny.move();
            jonny.turnLeft();
            if( jonny.frontIsClear()){
                jonny.move();
            }
            jonny.turnLeft();
            jonny.turnLeft();
            jonny.turnLeft();
            
            jonny.move();
            jonny.turnLeft();
            if( jonny.frontIsClear()){
                jonny.move();
            }jonny.turnLeft();
            jonny.turnLeft();
            
                   
        }
        
        
        
        
    }
}
