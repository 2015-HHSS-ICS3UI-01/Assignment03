
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
 * @author eadil1765
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City L = new City();
        Robot Liam = new Robot(L, 1, 1, Direction.EAST);
        new Wall(L, 1, 1, Direction.NORTH);
        new Wall(L, 1, 2, Direction.NORTH);
        new Wall(L, 1, 3, Direction.NORTH);
        new Wall(L, 1, 4, Direction.NORTH);
        new Wall(L, 1, 1, Direction.WEST);
        new Wall(L, 2, 1, Direction.WEST);
        new Wall(L, 3, 1, Direction.WEST);
        new Wall(L, 4, 1, Direction.WEST);
        new Wall(L, 4, 1, Direction.SOUTH);
        new Wall(L, 4, 2, Direction.SOUTH);
        new Wall(L, 4, 3, Direction.SOUTH);
        new Wall(L, 4, 4, Direction.SOUTH);
        new Wall(L, 4, 4, Direction.EAST);
        new Wall(L, 2, 4, Direction.EAST);
        new Wall(L, 1, 4, Direction.EAST);



        while (true) {
            Liam.move();
            if (Liam.frontIsClear()) {
                Liam.turnLeft();
            }
            if (!Liam.frontIsClear()){
                Liam.turnLeft();
                Liam.turnLeft();
                Liam.turnLeft();
                
            }
            if (Liam.getAvenue() == 5 && Liam.getStreet()== 3){
                break;
        }
                
    }
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.turnLeft();
}
}