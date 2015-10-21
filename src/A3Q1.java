/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author malcr1272
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //new city
   City kw = new City();
   
   //make karel
  Robot karel = new Robot(kw,2,2,Direction.EAST);
  
  //make things
  new Thing (kw,2,4);
  new Thing (kw,2,5);
  
  //make the wall
  new Wall (kw,2,6,Direction.EAST);
  
  while (!karel.canPickThing()) {
      karel.move();
  }
   
    }
}
