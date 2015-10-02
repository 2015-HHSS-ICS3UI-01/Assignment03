
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,1,1, Direction.EAST);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        int Backpack =0;
        //named variable Backpack = 0
      while(Backpack < 10){
          karel.pickThing();
          karel.move();
          karel.putThing();
          Backpack++;
          //once his backpack has 10, he breaks 
          if(Backpack == 10){
          break;    
          }
          
          //and executes this
          karel.turnLeft();
          karel.turnLeft();
          karel.move();
          karel.turnLeft();
          karel.turnLeft();
      }
                
            }
        }
        
        
    
    

