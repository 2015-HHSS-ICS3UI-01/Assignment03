
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
 * @author lalim9800
 */
public class a3q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //make city 
        City kw = new City();
        //make robot 
        Robot lali = new Robot(kw, 1, 1, Direction.EAST);




        //make west walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        //make south walls
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        //make east walls
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        //make north walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        //make thing 
        new Thing(kw, 1, 2);

        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);

        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        while (true) {
            if(lali.canPickThing()){
                lali.pickThing();
            }
            while (lali.frontIsClear()) {
                lali.move();
                if (lali.canPickThing()) {
                    lali.pickThing();
                }
            }


            lali.turnLeft();
            lali.turnLeft();
            while (lali.frontIsClear()) {
                lali.move();
                
            }
            lali.turnLeft();
            if (lali.frontIsClear()) {
                lali.move();
                lali.turnLeft();
                
            } else{
                break;
            }
        }  while (lali.getDirection() != Direction.NORTH) {
            lali.turnLeft();

        
       
    }    while(lali.getStreet()!=1){
             lali.move();
         } lali.turnLeft();
         lali.turnLeft();
         lali.turnLeft();
} }               
