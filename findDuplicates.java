import java.util.*;


public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,5};
        System.out.println(hasDuplicates(arr));
        
    }

    public static boolean hasDuplicates(int[] arr){
        // define hashset
        Set<Integer> hashArr = new HashSet<Integer>();

        // iterate through the int arr and try to add to the hash set
        for(int element: arr){
            if(hashArr.contains(element)){return true;}
            else{hashArr.add(element);}
        }


        return false;

    }
    
}
