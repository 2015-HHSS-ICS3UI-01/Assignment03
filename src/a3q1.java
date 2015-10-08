
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
 * @author muntake
 */
public class a3q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make robot and city and walls
      City kw= new City();
      Robot lali=new Robot(kw,1,1,Direction.EAST);
      new Thing(kw,1,3);
      new Thing(kw,1,4);
      new Wall(kw,1,5,Direction.WEST);
      
      //make robot move and determine things and walls
      
      
      while(lali.frontIsClear()){
          lali.move();
          if(lali.canPickThing()){
              break;
              
          }else if (!lali.frontIsClear()){
              break;
          }
      }
              
    }
}
