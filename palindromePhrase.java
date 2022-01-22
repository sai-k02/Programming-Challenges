public class palindromePhrase {

    public static void main(String[] args) {
        System.out.println(detPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(detPalindrome("A man, a plan, a canal: sPanama"));
        System.out.println(detPalindrome("racecar"));
        System.out.println(detPalindrome("race a car"));

    }

    public static boolean detPalindrome(String s){
        // define pointers
        int begPointer = 0;
        int endPointer = s.length()-1;

        // define two pointer method to check for palindrome
        while(begPointer<=endPointer){
            if (!Character.isLetterOrDigit(s.charAt(begPointer))){
                begPointer++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(endPointer))){
                endPointer--;
            }
            else{

                if(Character.toLowerCase(s.charAt(begPointer)) != Character.toLowerCase(s.charAt(endPointer))){
                            return false;
                    }
                begPointer++;
                endPointer--;
            }
      
            
        }
        // return true if false never happens
        return true;
    }

    
}
