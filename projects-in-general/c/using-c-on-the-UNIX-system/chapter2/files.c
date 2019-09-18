#include <stdio.h>
#include <stdlib.h>

int display(int len, char **argv)
{
    for(int i = 0; i < len; i++)
    {
        fprintf(stdout, "%d element: %s\n", i, *(argv+i));
    }
    return 0;
}


int main(argc, argv)
int argc;
char **argv;
{
    int c;
    FILE *from, *to;
    if(argc != 3)
    {
        fprintf(stderr, "You must input three args");
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
        exit(1);
    }
    while((c = getc(from)) != EOF)
        putc(c, to);
    fclose(from);
    fclose(to);
    exit(0);
}

