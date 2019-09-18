#include <stdio.h>
#include <stdlib.h>

int main(argc, argv)
int argc;
char **argv;
{
    int c;
    FILE *from, *to;
    if(argc != 3)
    {
        fprintf(stderr, "Error passing params because is not 3\n");
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
    while((c = fgetc(from)) != EOF)
        fputc(c, to);
    fclose(from);
    fclose(to);
    exit(0);
}
