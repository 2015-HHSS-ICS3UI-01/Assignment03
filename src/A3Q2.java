
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
 * @author eadil1765
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City L = new City();
        new Wall(L, 1, 1, Direction.WEST);
        new Wall(L, 2, 1, Direction.WEST);
        new Wall(L, 3, 1, Direction.WEST);
        new Wall(L, 1, 1, Direction.NORTH);
        new Wall(L, 1, 2, Direction.NORTH);
        new Wall(L, 1, 3, Direction.NORTH);
        new Wall(L, 1, 4, Direction.NORTH);
        new Wall(L, 1, 1, Direction.NORTH);
        new Wall(L, 1, 4, Direction.EAST);
        new Wall(L, 2, 4, Direction.EAST);
        new Wall(L, 3, 4, Direction.EAST);
        new Wall(L, 3, 1, Direction.SOUTH);
        new Wall(L, 3, 2, Direction.SOUTH);
        new Wall(L, 3, 3, Direction.SOUTH);
        new Wall(L, 3, 4, Direction.SOUTH);

        new Thing(L, 1, 2);
        new Thing(L, 2, 2);
        new Thing(L, 2, 3);
        new Thing(L, 2, 4);
        new Thing(L, 3, 1);
        new Thing(L, 3, 4);


        Robot Liam = new Robot(L, 1, 1, Direction.EAST);
        while (Liam.frontIsClear()) {
            Liam.move();

            if (Liam.canPickThing()) {
                Liam.pickThing();

            } else {
                if (!Liam.frontIsClear()) {
                    Liam.turnLeft();
                    Liam.turnLeft();
                    Liam.turnLeft();

                    
break;
                    
                     } }  }
        
        Liam.move();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.pickThing();
        
         while (Liam.frontIsClear()) {
            Liam.move();

            if (Liam.canPickThing()) {
                Liam.pickThing();

            } else {
                if (!Liam.frontIsClear()) {
                    Liam.turnLeft();
                    Liam.turnLeft();
                    Liam.turnLeft();

                    
break;

      
      
       }   }}
    Liam.turnLeft();
    Liam.turnLeft();
    Liam.move();
    Liam.turnLeft();
    Liam.pickThing();
    
     while (Liam.frontIsClear()) {
            Liam.move();

            if (Liam.canPickThing()) {
                Liam.pickThing();

            } else {
                if (!Liam.frontIsClear()) {
                    Liam.turnLeft();
                    Liam.turnLeft();
                    Liam.turnLeft();

                    
break;
   
    }}}
     Liam.turnLeft();
     while (true)
     if (Liam.frontIsClear()){
         Liam.move();
         
         break;
     }
       Liam.move();
       Liam.turnLeft();
       Liam.move();
       Liam.move();
       Liam.move();
       
         
         
       
     
     }
     }
    
     

    



