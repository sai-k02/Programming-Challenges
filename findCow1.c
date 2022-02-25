/*
 * Author: Srilokh Karuturi
 * Date: Thu Feb 24
 * File: findCow2.c 
 * Purpose: Find (( )) but with a better time complexity 
 *
 */

#include <stdio.h>
#include <ctype.h>

int main() {
        // define characters
        char ch;
        char old = ' ';
        // define comparing chars
        int countOpen = 0;
        int countClosed = 0;

        // while loop which goes through only once so O(n)
        while (!isspace(ch = getchar())){
                // if the closing braces are the same add to the countOpen
                if(ch == ')' && old == ')'){
                        countOpen += countClosed;
                }
                // if the opening braces are the same add 1 
                else if(ch == '(' && old == '('){
                        countClosed++;
                }

                old = ch;

        }
        // output
        printf("%d", countOpen);
        putchar('\n');
}
