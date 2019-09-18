#include <stdio.h>
#include <stdlib.h>

int main(argc, argv)
int argc;
char** argv;
{
    char buff[BUFSIZ];
    FILE *from, *to;
    if(argc != 3)
    {
        fprintf(stderr, "Error getting parametres, they have to be 3 (including the name of the file)\n");
        exit(1);
    }
    if((from = fopen(*(argv+1), "r")) == NULL)
    {
        perror(*(argv+1));
        exit(1);
    }
    if((to = fopen(*(argv+2), "a")) == NULL)
    {
        perror(*(argv+2));
        exit(2);
    }
    while(fgets(buff, BUFSIZ, from) != NULL)
        fputs(buff, to);
    fclose(from);
    fclose(to);
    exit(0);
}
