/*
Numbers to Words for INR 
December 31st 2021 - Geeks for Geeks, Problem of the Day challenge

- I did end up using google for a lot of help.

*/
 
public class wordsToNumbers {
    // define the units 
    private static final String[] units = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine"
    }; 
    // define the words for 10+
    private static final String[] twoDigits = {
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    // define the words for all 10 difference 
    private static final String[] tenMultiples = {
        "",
        "",
        " twenty",
        " thirty",
        " forty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
    };

    // define the big values
    private static final String[] placeValues = {
        " ",
        " thousand",
        " million",
        " billion",
        " trillion"
    };

    // function will convert numbers into indian rupees 
    private static String convertToWords(long number) {
        // define a string words
        String word = "";   
        // define index
        int index = 0;
        // do while such that lets first do the do while until number goes to zero
        do {
        
        // take out 3 digits in each iteration
        int num = (int)(number % 1000);
        // base case 
        if (num != 0){
            // we will always work with three digits so create function for only three digits
            String str = ConversionForUptoThreeDigits(num);
            // add the 
            word = str + placeValues[index] + word;
        }
        // increase index
        index++;
        // next 3 digits
        number = number/1000;
        
        } while (number > 0);
        
        // finally return final words 
        return word;
    }

    private static String ConversionForUptoThreeDigits(int number) {
    
    // define the string word 
    String word = "";
    // work with only 2 digits
    int num = number % 100;
    // figure out the units if the word is less than 10
    if(num < 10){
    // add what the numbers is in string form
    word = word + units[num];
    }
    // figure out the units if the word is less than 20 so twoDigits
    else if(num < 20){
    // add what the number is in string form for two digits 
    word = word + twoDigits[num%10];
    }else{
    // for all other cases 
    word = tenMultiples[num/10] + units[num%10];
    }

    // finally return everything
    word = (number/100 > 0)? units[number/100] + " hundred" + word : word;

    // return word
    return word;
    }


    public static void main(String[] args) {
      
        System.out.println(convertToWords(438237764));


    }
    
}
