
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        //Make a Robot
        Robot karel=new Robot(kw,0,0,Direction.EAST);
        //Make 10 Things
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        
        int ball=0;
        
        while(true){
            karel.pickThing();
            karel.move();
            karel.putThing();
            ball++;
            if(ball==10){
                break;
            }
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
        
    }
}
