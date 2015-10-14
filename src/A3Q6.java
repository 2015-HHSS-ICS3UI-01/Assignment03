
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
 * @author bettk6516
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        City jw =new City();
        Robot rob=new Robot(jw,3,3,Direction.SOUTH);
        
        new Wall (jw, 1, 1, Direction.NORTH);
        new Wall (jw, 1, 2, Direction.NORTH);
        new Wall (jw, 1, 2, Direction.EAST);
        new Wall (jw, 2, 2, Direction.EAST);
        new Wall (jw, 2, 2, Direction.SOUTH);
        new Wall (jw, 2, 1, Direction.SOUTH);
        new Wall (jw, 2, 1, Direction.WEST);
        new Wall (jw, 1, 1, Direction.WEST);
        
        new Wall (jw, 1, 4, Direction.NORTH);
        new Wall (jw, 1, 5, Direction.NORTH);
        new Wall (jw, 1, 5, Direction.EAST);
        new Wall (jw, 2, 5, Direction.EAST);
        new Wall (jw, 2, 5, Direction.SOUTH);
        new Wall (jw, 2, 4, Direction.SOUTH);
        new Wall (jw, 2, 4, Direction.WEST);
        new Wall (jw, 1, 4, Direction.WEST);
        
        new Wall (jw, 4, 1, Direction.NORTH);
        new Wall (jw, 4, 2, Direction.NORTH);
        new Wall (jw, 4, 2, Direction.EAST);
        new Wall (jw, 5, 2, Direction.EAST);
        new Wall (jw, 5, 2, Direction.SOUTH);
        new Wall (jw, 5, 1, Direction.SOUTH);
        new Wall (jw, 5, 1, Direction.WEST);
        new Wall (jw, 4, 1, Direction.WEST);
        
        new Wall (jw, 4, 4, Direction.NORTH);
        new Wall (jw, 4, 5, Direction.NORTH);
        new Wall (jw, 4, 5, Direction.EAST);
        new Wall (jw, 5, 5, Direction.EAST);
        new Wall (jw, 5, 5, Direction.SOUTH);
        new Wall (jw, 5, 4, Direction.SOUTH);
        new Wall (jw, 5, 4, Direction.WEST);
        new Wall (jw,4,4,Direction.WEST);
    
        for(int rounds =0; rounds !=4; rounds = rounds +1){
        
        for(int box1 = 0; box1 !=3; box1 = box1 +1 ){
        rob.move();
        rob.move();
        rob.move();
        rob.turnLeft();
        }
        
    for(int flat = 0; flat <3; flat = flat +1){
        rob.move();
        if(rob.getAvenue()==3){
            if(rob.getStreet()==3){
                if(rob.getDirection()==Direction.EAST){
                   break; 
                }
            }
        }
    }
    
    
    
        }
    }
}
