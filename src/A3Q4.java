
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City town = new City();
        int boxSize = 2;
        for(int inc=0;inc!=boxSize;inc++){
            new Wall(town,1,inc+1,Direction.NORTH);
            new Wall(town,boxSize,inc+1,Direction.SOUTH);
            new Wall(town,inc+1,1,Direction.WEST);
            new Wall(town,inc+1,boxSize,Direction.EAST);
        }
        Robot jarvis = new Robot(town,0,2,Direction.WEST);
        for(int inc=0;inc!=8;inc++){
            jarvis.move();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.move();
        }
    }
    
}
