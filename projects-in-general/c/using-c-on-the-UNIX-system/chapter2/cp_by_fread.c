#include <stdio.h>
#include <stdlib.h>

int main(argc, argv)
int argc;
char **argv;
{
    int n;
    FILE *from, *to;
    char buf[BUFSIZ];
    if(argc != 3)
    {
        fprintf(stderr, "Error getting params: we need the from file and the target file\n");
        exit(1);
    }
    if((from = fopen(*(argv+1), "r")) == NULL)
    {
        perror(*(argv+1));
        exit(1);
    }
    if((to = fopen(*(argv+2), "a")) == NULL)
    {
        perror(*(argv+1));
        exit(1);
    }
        while((n = fread(buf, sizeof(char), BUFSIZ, from)) > 0)
            fwrite(buf, sizeof(char), n, to);
    fclose(from);
    fclose(to);
    exit(0);
}
