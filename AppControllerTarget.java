/**
 * Created by sonnyharsono on 5/6/17.
 */
// package application_controller_pattern;
import java.util.Random;

public class AppControllerTarget {

    //implementation of the handler interface

    public static interface Handler {
        public static void roll(int die){
            //(this is for testing)
            for(int i=0; i<20; i++){
            Random rand = new Random();
            int result = rand.nextInt(die) + 1;
            System.out.println("You rolled " + result);
            }
        }
    }
}
