#include <stdio.h>
#include <stdlib.h>

#include "rubbish.h"

#define DEFAULT_CASES 10

int test_str_len(int cases)
{
    int len, result, choose;
    int max_len = 49, min_len = 2;
    char * c; 
    cases = cases <= 0 ? DEFAULT_CASES : cases;
    for(int i = 0; i < cases; i++)
    {
        len = rand() % (max_len) + min_len;
        choose = rand() % 3;
        c = malloc(sizeof(char) * len);
        c = rand_char(choose, len-1);
        if((result = str_len(c)) != len-1)
        {
            fprintf(stderr, "Error getting len of the str %s:\nexpected: %d\ngot: %d\n", c, len, result);
        }
        free(c);
    }
    return 0;
}

int main(argc, argv)
int argc;
char ** argv;
{
    test_str_len(10);
    return 0;
}
