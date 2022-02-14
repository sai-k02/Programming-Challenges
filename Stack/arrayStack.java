package Stack;
import java.util.*;

public class arrayStack extends Stack{
    // holds the stack elements
    private int S[];

    // index to top
    private int top = -1;

    // constructor
    public arrayStack(int capacity){
        S = new int[capacity];
    }


    
}
