import java.util.Random;
import java.util.*;

public class rmRandomEntry {
    public static void main(String[] args) {
        // define int array
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6));

        // define our random object
        Random rand = new Random(System.currentTimeMillis());
        while(numbers.size() != 0){
            // remove a random index  
            numbers.remove(rand.nextInt(numbers.size()));
            // print each element
            for (int element : numbers){
                System.out.print(element);
            }
            System.out.print("\n");

        }
    }
    
}
