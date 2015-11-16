
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make box
        new Wall (eep, 1, 1, Direction.WEST);
        new Wall (eep, 1, 1, Direction.NORTH);
        new Wall (eep, 2, 1, Direction.WEST);
        new Wall (eep, 3, 1, Direction.WEST);
        new Wall (eep, 1, 2, Direction.NORTH);
        new Wall (eep, 1, 3, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.EAST);
        new Wall (eep, 3, 4, Direction.EAST);
        new Wall (eep, 3, 4, Direction.SOUTH);
        new Wall (eep, 3, 3, Direction.SOUTH);
        new Wall (eep, 3, 2, Direction.SOUTH);
        new Wall (eep, 3, 1, Direction.SOUTH);
        
        //make robot
        Robot jimbo = new Robot(eep, 2, 2, Direction.SOUTH);
        
        //because why not
        jimbo.setColor(Color.darkGray);
        
        //make robot escape box
        while (jimbo.frontIsClear()){
            jimbo.move();
                if (!jimbo.frontIsClear()){
                    break;}
        }while (true){
            if (jimbo.frontIsClear()){
                jimbo.move();
                jimbo.turnLeft();
                jimbo.turnLeft();
                jimbo.turnLeft();
                    if (jimbo.frontIsClear()){
                        jimbo.move();
                        break;}
            }else if (!jimbo.frontIsClear()){
                jimbo.turnLeft();
                }                
            }
        }
    }
