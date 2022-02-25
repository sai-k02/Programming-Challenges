/*
 * Author: Srilokh Karuturi
 * Date: Thu Feb 24 2022
 * File: cowfind1.c
 * Purpose: Find number of patterns matched of (( ))
 * Time Complexity: O(n*n)
 * Space Complexity: O(1)
 */
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#define MAXLEN 1000000

// define input
char input[MAXLEN];


// program will find all occurrences of (( )) from input
int main() {
        // get input from user
        scanf(%s, input);

        // define the length of the string 
        int lengthInput = strlen(input);

        // define the numOccurrenes
        int numOccurrences = 0;

        // traverse entire string
        for(int i=0; i < lengthInput; i++){

                // when we find ( and ( we will start searching for all occurrences of ) )
                if((input[i] == '(') && (input[i+1] == '(')){
                        for(int x = i; x < lengthInput; x++){ 
                                if((input[x] == ')') && (input[x+1]==')')){
                                        // increase occurrences
                                        numOccurrences++;
                                }

                        }
                }
        }

        // output 
        printf(%d\n, numOccurrences);
        return 0;
}
