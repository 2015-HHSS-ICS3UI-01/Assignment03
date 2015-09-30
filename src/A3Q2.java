
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
 * @author butlj9437
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City town = new City();
        //make robot
        Robot jarvis = new Robot(town,1,1,Direction.EAST);
        //build walls
        int boxSize = 8;
        for(int inc=0;inc!=boxSize;inc++){
            new Wall(town,1,inc+1,Direction.NORTH);
            new Wall(town,boxSize,inc+1,Direction.SOUTH);
            new Wall(town,inc+1,1,Direction.WEST);
            new Wall(town,inc+1,boxSize,Direction.EAST);
        }
        //build things
        for(int thingYCount=0;thingYCount!=boxSize;thingYCount++){
            for(int thingXCount=0;thingXCount!=boxSize;thingXCount++){
                new Thing(town,thingXCount+1,thingYCount+1);
            }
        }
        //move robot
        boolean boxEnd = false, eastFace = true;
        while(!boxEnd){
            if(jarvis.canPickThing()){
                jarvis.pickThing();
            }
            if(jarvis.frontIsClear()){
                jarvis.move();
            }else if(eastFace){
                jarvis.turnLeft();
                jarvis.turnLeft();
                jarvis.turnLeft();
                if(!jarvis.frontIsClear()){
                    boxEnd = true;
                }else{
                    jarvis.move();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    eastFace = false;
                }
            }else{
                jarvis.turnLeft();
                if(!jarvis.frontIsClear()){
                    boxEnd = true;
                }else{
                    jarvis.move();
                    jarvis.turnLeft();
                    eastFace = true;
                }
            }
        }
        while(jarvis.getAvenue() != 1 ||
                jarvis.getStreet() != 1){
            while(!jarvis.frontIsClear()){
                jarvis.turnLeft();
            }
            while(jarvis.frontIsClear()){
                jarvis.move();
            }
        }
        jarvis.turnLeft();
        jarvis.turnLeft();
    }
}
