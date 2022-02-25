#include <stdio.h>
#include <stdlib.h>

/*
 * Ask the user to input a count (N):
 * Allocate dynamic memory for an array of N integers
 * Ask the user to enter N integers and store in an array.
 * Dump the data into a text file and a binary file.
 * fprintf() / fputs() and fwrite()
 * Review the file contents: cat and od
 */

int main() {
        int n = 0;

        printf("Enter # of inputs: ");
        scanf("%d", &n);

        int *array = (int *) malloc (n * sizeof(int));

        puts("Enter input data:");
        for(int i=0; i<n; i++)
                scanf("%d", &array[i]);
        puts("Done with input data.");

        // \n in *nix <---> \r\n in Windows
        FILE *fp1 = fopen("output.txt", "w");
        for(int i=0; i<n; i++)
                fprintf(fp1, "%d\n", array[i]);
        fclose(fp1);

        FILE *fp2 = fopen("output.dat", "wb");
        fwrite(array, sizeof(int), n, fp2);
        fclose(fp2);
}
