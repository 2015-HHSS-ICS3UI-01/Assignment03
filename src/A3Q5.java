
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,1,1, Direction.EAST);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        
        for(int timesTurned = 0; timesTurned < 32; timesTurned = timesTurned + 1){
            if(karel.getDirection() == Direction.EAST && (karel.canPickThing())){
                karel.pickThing();
                karel.move();
                karel.move();
                karel.putThing();
                karel.turnLeft();
                karel.turnLeft();
                
                
            }else if(karel.getDirection() == Direction.WEST){
                karel.move();
                karel.move();
                karel.pickThing();
                karel.turnLeft();
                karel.turnLeft();
            }else if(!karel.canPickThing()){
                karel.move();
                karel.move();
                break;
            }
        }
        
        
    }
    
}
