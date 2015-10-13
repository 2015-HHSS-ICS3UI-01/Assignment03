
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      City jw = new City();
        new Wall(jw,1,1,Direction.NORTH);
       new Wall(jw,1,1,Direction.WEST);
        new Wall(jw,2,1,Direction.WEST);
        new Wall(jw,2,1,Direction.SOUTH);
        new Wall(jw,2,2,Direction.SOUTH);
        new Wall(jw,2,2,Direction.EAST);
        new Wall(jw,1,2,Direction.EAST);
        new Wall(jw,1,2,Direction.NORTH);
        
        Robot rob = new Robot(jw,0,2,Direction.WEST);
       
        for(int timesR =0; timesR <2; timesR = timesR +1){
            
        
       
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.move();
    
        }
    }
}
