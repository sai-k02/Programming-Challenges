#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <string.h>

#define LINESIZE 16

//use one command line argument
int main(int argc, char *argv[]) {
        if (argc == 1) {
                printf("Usage: diagonal <textstring> ... <teststring>\n");
                return -1;
        }

        //create a file so that 16 rows of empty will appear with od -c command
        int fd = open("diagonal.out", O_CREAT | O_WRONLY | O_TRUNC, S_IRUSR | S_IWUSR);
        char space = ' ';
        for(int line=0; line<(LINESIZE*argc-1); line++)
                for(int column=0; column<LINESIZE; column++)
                        write(fd, &space, 1);

        //Each line of od outputs 16 characters 
        //So, to make the output diagonal, we will use 0, 17, 34, ....
        // F = 0  | F = 16                               I
        // U = 17 | F = 16+16-1 = 31                    I
        // N = 34 | F = 16+16+16-2                     I 
        // N = 51 | 
        // y = 68
        // ! = 85
        //
        //
        //
        // LINESIZE + 1 * I
        // this will essentially reverse the words, I now need to be able to take in as many args as possible 
        //      
        // determine the number of strings to go through
        int itrArgv, n, itr;
        int linecount = 0;
        for(itrArgv=1; itrArgv<argc; itrArgv++){
                // linesize * linesize * (i-1)
                if((itrArgv % 2) != 0){
                        n = strlen(argv[itrArgv]);
                        for(itr = 0; itr<n; itr++){
                                lseek(fd,(linecount*LINESIZE)+(LINESIZE+1)*(itr), SEEK_SET);
                                                                                                                                                             8,19          Top
