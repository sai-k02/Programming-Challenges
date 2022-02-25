/*

Created by Srilokh Karuturi
Program will count slashes

*/


#include <stdio.h>
#include <string.h>

int main() {
        char line[10000];

        //keep reading input lines - one line at a time
        while (fgets(line, 10000, stdin)) {
                int n = strlen(line);

                // count # of slashes in this line
                int counter=0;
                for(int i=0; i<n; i++)
                        if (line[i] == '/' || line[i] == '\\')
                                counter++;
                printf("%d %s", counter, line);
        }
}
