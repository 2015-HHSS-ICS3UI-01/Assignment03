
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
 * @author richj0985
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live within
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
        
        // make things for karel to pick up and put down
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        
        for(int timesMoved = 10; timesMoved > 0; timesMoved = timesMoved - 1){
            if(karel.countThingsInBackpack() == 0 && karel.canPickThing()){
                karel.pickThing();
                karel.move();
                karel.putThing();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
        while(karel.countThingsInBackpack() == 0){
            if(karel.canPickThing()){
                karel.pickThing();
                karel.move();
                karel.putThing();       
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
            }else {
                karel.move();
                break;
            }
        }
    }
}
