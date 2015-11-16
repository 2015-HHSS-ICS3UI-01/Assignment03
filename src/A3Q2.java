
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
 * @author sevcm7279
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        // make box
        new Wall (eep, 1, 1, Direction.WEST);
        new Wall (eep, 1, 1, Direction.NORTH);
        new Wall (eep, 1, 2, Direction.NORTH);
        new Wall (eep, 1, 3, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.NORTH);
        
        new Wall (eep, 1, 4, Direction.EAST);
        new Wall (eep, 2, 4, Direction.EAST);
        new Wall (eep, 3, 4, Direction.EAST);
        
        new Wall (eep, 3, 4, Direction.SOUTH); 
        new Wall (eep, 3, 3, Direction.SOUTH);
        new Wall (eep, 3, 2, Direction.SOUTH);
        new Wall (eep, 3, 1, Direction.SOUTH);
        new Wall (eep, 3, 1, Direction.WEST);
        new Wall (eep, 2, 1, Direction.WEST);
        
        //make litter
        new Thing (eep, 1, 2);
        new Thing (eep, 2, 2);
        new Thing (eep, 2, 3);
        new Thing (eep, 2, 4);
        new Thing (eep, 3, 1);
        new Thing (eep, 3, 4);
        //make robot
        Robot jimbo = new Robot (eep, 1, 1, Direction.EAST);
        
        //picking up litter
        for (int turns = 0; turns <3; turns = turns +1){
            jimbo.turnLeft();  
            
        }while (jimbo.frontIsClear()){
            jimbo.move();
                if (jimbo.canPickThing()){
                    jimbo.pickThing();
                }
                while (!jimbo.frontIsClear()){
                    if (jimbo.getDirection()==Direction.NORTH){
                        jimbo.turnLeft();
                        jimbo.turnLeft();
                        jimbo.turnLeft();
                            if (jimbo.frontIsClear()){
                                jimbo.move();
                                jimbo.turnLeft();
                                jimbo.turnLeft();
                                jimbo.turnLeft();
                            }                 
                            if (jimbo.canPickThing()){
                                jimbo.pickThing();
                            }
                        
                    }else if (jimbo.getDirection()==Direction.SOUTH){
                        jimbo.turnLeft();
                        jimbo.move();
                        jimbo.turnLeft();
                            if (jimbo.canPickThing()){
                                jimbo.pickThing();
                }
            }else if (jimbo.getDirection()== Direction.EAST){
                break;}
            }
        }
    
        //go back to (1, 1)
        
                    while (jimbo.getAvenue()!= 1){
                        if (jimbo.getDirection() != Direction.WEST){ 
                                    jimbo.turnLeft();
                        }else if (jimbo.getDirection()==Direction.WEST){
                                    jimbo.move();
        }
    }
                while (jimbo.getStreet()!=1){
                        if (jimbo.getDirection()!=Direction.NORTH){
                                    jimbo.turnLeft();
                        }else if (jimbo.getDirection()==Direction.NORTH){
                                    jimbo.move();
                    }
                }  
            while (jimbo.getDirection()!=Direction.EAST){
                     jimbo.turnLeft();
        }
    }                
}           
        
    
