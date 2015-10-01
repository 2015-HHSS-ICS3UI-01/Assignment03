
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
public class A3Q6 {

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
        for(int inc=0;inc!=boxSize;inc++){
            new Wall(town,1,inc+4,Direction.NORTH);
            new Wall(town,boxSize,inc+4,Direction.SOUTH);
            new Wall(town,inc+1,4,Direction.WEST);
            new Wall(town,inc+1,boxSize+3,Direction.EAST);
        }
        for(int inc=0;inc!=boxSize;inc++){
            new Wall(town,4,inc+1,Direction.NORTH);
            new Wall(town,boxSize+3,inc+1,Direction.SOUTH);
            new Wall(town,inc+4,1,Direction.WEST);
            new Wall(town,inc+4,boxSize,Direction.EAST);
        }
        for(int inc=0;inc!=boxSize;inc++){
            new Wall(town,4,inc+4,Direction.NORTH);
            new Wall(town,boxSize+3,inc+4,Direction.SOUTH);
            new Wall(town,inc+4,4,Direction.WEST);
            new Wall(town,inc+4,boxSize+3,Direction.EAST);
        }
        Robot jarvis = new Robot(town,3,3,Direction.SOUTH);
        for(int incA=0;incA!=4;incA++){
            for(int incB=0;incB!=4;incB++){
                jarvis.move();
                jarvis.move();
                jarvis.move();
                if(incB!=3){
                    jarvis.turnLeft();
                }
            }
        }
    }
    
}
