void getRandomPassword(int minLen, int maxLen, int minLower, int minUpper, int minDigits, int minSpecials){
        // define the random password char array to return 
        char randPassword[100];

        // define all arrays
        char numbers[] = "0123456789";
        char lower[] = "abcdefghijklmnopqrstuvwxyz";
        char upper[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char specials[] = "!@#$%^&*+:;"; 


        // define the random number to pick out of our options
        int randomizer = 0;

        // load up the random cannon
        srand((unsigned int)(time(NULL)+getpid()));

        // get max between
        int lowerbound = getMax(minLen, (minLower + minUpper + minDigits + minSpecials));

        // randomize the length of the password
        int length = (rand() %  (maxLen + 1 - lowerbound)) + lowerbound;
        // change the length
        randPassword[length];
        // define iteration variable
        int i = 0;
        // for loop to get minimum lower characters
        for(int lowerCount=0; lowerCount<minLower; lowerCount++){
                randPassword[i++] = lower[(rand() % 26)];
        }
        // for loop to get minimum upper characters
        for (int upperCount=0; upperCount<minUpper; upperCount++){
                randPassword[i++] = upper[rand()%26];
        }
        // for loop to get minimum digits
        for(int digitsCount=0; digitsCount<minDigits; digitsCount++){
                randPassword[i++] = numbers[rand()%10];
        }
        // for loop to get minimum specials
        for(int specialsCount=0; specialsCount<minSpecials; specialsCount++){
                randPassword[i++] = specials[rand()% (sizeof (specials))];
        }
        // fill up the rest of the char
        while(i < length){
                randPassword[i++] = getRandChar();
        }
        // shuffle
        int iteration = 0;
        for(i = 0; i < 1000; i++){
                int pos1 = (rand() % (length-1));
                int pos2 = (rand() % (length-1));
                char temp = randPassword[pos1];
                randPassword[pos1] = randPassword[pos2];
                randPassword[pos2] = temp;
        }

        // printf 
        printf("%s\n", randPassword);
}

// get max
int getMax(int numOne, int numTwo){
        if(numOne > numTwo){
                return numOne;
        }
        else{
                return numTwo;
        }
}
// get rand char 
char getRandChar(){
        char specials[] = "!@#$%^&*+:;";
        int r = rand() % (26 + 26 + 10 + strlen(specials));
        if (r < 26)
                return (char) (r + 'a');
        if(r < 52)
                return (char) (r - 26 + 'A');
        if(r < 62)
                return (char) (r - 52 + '0');
        // lastly return specials
        return specials[r-62];
}
