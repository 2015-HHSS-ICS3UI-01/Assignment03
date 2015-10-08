
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class a3q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //make city
        City kw= new City();
        //make robot 
        Robot lali=new Robot(kw,2,2,Direction.EAST);
             
               //make things
        
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             new Thing(kw,2,2);
             //set int backpack to 0 
            int Backpack=0;
            
             //Robot moves and pickthigns up and puts it down,adding 1 to the
            //backpack each time untill the value of backpack is 10 
             while(true){
                 lali.pickThing();
                 lali.move();
                 lali.putThing();
                 Backpack++;
                 if(Backpack==10){
                     break;
                     

                 //make robot turn around 
             
   
             } lali.turnLeft();
             lali.turnLeft();
             lali.move();
             lali.turnLeft();
             lali.turnLeft();
             
             
             } 
            
                    
            
             
             
             
             
                
        
        
        
    }
}
