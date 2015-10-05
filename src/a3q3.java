
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
 * @author lalim9800
 */
public class a3q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city 
       City kw = new City();
       Robot lali= new Robot(kw,3,3,Direction.NORTH);
       
       
       
       
       // make walla west side 
       new Wall(kw,1,1,Direction.WEST);
       new Wall(kw,2,1,Direction.WEST);
       new Wall(kw,3,1,Direction.WEST);
       new Wall(kw,4,1,Direction.WEST);
       
       //make walla soth side 
       new Wall(kw,4,1,Direction.SOUTH);
       new Wall(kw,4,2,Direction.SOUTH);
       new Wall(kw,4,3,Direction.SOUTH);
       new Wall(kw,4,4,Direction.SOUTH);
       
       //make east walls
       new Wall(kw,1,4,Direction.EAST);
       new Wall(kw,2,4,Direction.EAST);
       new Wall(kw,4,4,Direction.EAST);
       
       //make north walls
       new Wall(kw,1,1,Direction.NORTH);
       new Wall(kw,1,2,Direction.NORTH);
       new Wall(kw,1,3,Direction.NORTH);
       new Wall(kw,1,4,Direction.NORTH);
       
       lali.turnLeft();
       while(true){
           
           lali.move();
           if(lali.frontIsClear()){
               lali.turnLeft();
               
              
               
               
           } if(!lali.frontIsClear()){
                   lali.turnLeft();
                   lali.turnLeft();
                   lali.turnLeft();
       
           
           }  if(lali.getAvenue()== 5 && lali.getStreet()==3){
               break;
           }
       } lali.turnLeft();
       lali.turnLeft();
       lali.turnLeft();
       
               
       
       }   
   
       
       
    }


   

