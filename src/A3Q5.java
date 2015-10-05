
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
        
        // make karel pick up things once at a times and put them in the other intersection
        // once karel has moved all 10 things karel must stop
        
        // make a variable for karel to move the things 10 times
        // make karel move if he has moved less then ten times
        // make the varable be increased by 1 every time he picks up and puts down a thing
        for(int thingsToMove = 10; thingsToMove > 0; thingsToMove = thingsToMove - 1){
            // check to if thing to pick up, if yes pick it up and put
            if(karel.countThingsInBackpack() == 0 && karel.canPickThing()){
                karel.pickThing();
                karel.move();
                karel.putThing();
                                
                // if there are more things to move the current thing
                // have karel come back to the original pile of things otherwise he done
                if( thingsToMove > 1 ){
                    // make karel flip around
                    karel.turnLeft();
                    karel.turnLeft();
                    // make karel move back on to the original pile
                    karel.move();
                    // make karel flip around to face the new pile of things
                    karel.turnLeft();
                    karel.turnLeft();
                }
            }
        }
    }
}
