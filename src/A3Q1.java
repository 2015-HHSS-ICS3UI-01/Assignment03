
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot matt = new Robot (kw,1,1,Direction.EAST);
        
        new Thing (kw,1,3);
        new Thing (kw,1,4);
        new Wall (kw,1,5,Direction.WEST);
        
        while (matt.frontIsClear()){
            matt.move();
            if(matt.canPickThing()){
                break;
            }
        }
    }
    
}
