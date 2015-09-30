
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
 * @author butlj9437
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City town = new City();
        int boxSize = 6,holeSpot=4;
        for(int inc=0;inc!=boxSize;inc++){
            new Wall(town,inc+1,boxSize,Direction.EAST);
            new Wall(town,1,inc+1,Direction.NORTH);
            new Wall(town,inc+1,1,Direction.WEST);
            if(inc!=holeSpot){
                new Wall(town,boxSize,inc+1,Direction.SOUTH);
            }
        }
        int robY = 3, robX = 4;
        Robot jarvis = new Robot(town,robX,robY,Direction.EAST);
        boolean findEnd = false;
        while(jarvis.frontIsClear()){
            jarvis.move();
        }
        while(!findEnd){
            if(jarvis.frontIsClear()){
                jarvis.move();
                findEnd=true;
            }else{
                jarvis.turnLeft();
                if(!jarvis.frontIsClear()){
                    jarvis.turnLeft();
                    jarvis.move();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                }else{
                    jarvis.move();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                }
            }
        }
    }
}
