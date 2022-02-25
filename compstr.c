/*
 *Student Name: Srilokh Karuturi
 *Class: CS 3377 004/0W2 
 *Date: Mon Feb 14, 2022
 */
# include <stdio.h>
# include <stdlib.h>
# include <string.h>
# include <unistd.h>

// function decleration
int string_equals(char* stringOne, char* stringTwo);

// main
int main(int argc, char* argv[]) {
        if(argc == 3){
                // define stringOne
                char *stringOne = argv[1];
                // define stringTwo
                char *stringTwo = argv[2];
                // output to user the strings we are comparing
                sleep(2);
                printf("Comparing '%s' and '%s' for equality.\n", stringOne, stringTwo);
                sleep(2);
                printf("Checking...\n");
                sleep(2);
                // check for equality 
                if(strcmp(stringOne, stringTwo) == 0){
                        printf("'%s' and '%s' are equal.\n", stringOne, stringTwo);
                        sleep(2);
                }
                else{
                        printf("'%s' and '%s' are not equal.\n", stringOne, stringTwo);
                        sleep(2);
                }


        }else{
                printf("Invalid Input. Program requires two arguments of strings.\n");
                exit(1);
        }

        // return 
        return 0;
}

int string_equals(char* stringOne, char* stringTwo){
        int i = 0;
        while (stringOne[i] != '\0' && stringTwo[i] != '\0'){
                if(stringOne[i] != stringTwo[i]){
                        return 0;
                }
                i = i + 1;
        }

        return 1;

}
