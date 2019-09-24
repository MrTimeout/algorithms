#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_LEN 10

unsigned int str_len(char * c)
{
    int len;
    while(*(c++) != '\0')
        len++;
    return len;
}

bool isNumeric(char * c, int * a, bool n)
{
    int sign = 1, offset = 0;
    if(!n && *c == '-')
    {
        fprintf(stderr, "Error parsing string to number because it is negative and it cant be negative\n");
        return false;
    }
    if(str_len(c) > MAX_LEN)
    {
        fprintf(stderr, "Error getting length og yhe number, overflows\n");
        return false;
    }
    if(n && *c == '-')
    {
        sign = -1;
        offset = 1;
    }
    *a = 1;
    for(; *(c+offset) != '\0'; offset++)
    {
        if(*c > 57 || *c < 48)
        {
            fprintf(stderr, "Error getting number because is a distinct char\n");
            return false;
        }
        *a = *a*10 + *(c+offset) - '0';
    }
    *a *= sign;
    return true;
}

int gcd(int a, int b)
{
    if(b == 0)
        return a;
    return gcd(b, a % b);
}

int loop(char ** c, int len)
{
    int a, b;
    if(!isNumeric(*(++c), &a, false))
    {
        fprintf(stderr, "Error not handled\n");
        exit(1);
    }
    for(int i = 2; i < len; i++)
    {
       if(!isNumeric(*c, &b, false))
       {
           fprintf(stderr, "Error parsing number\n");
           exit(1);
       }
       b = gcd(a, b);
    }
    return b;
}

void display(char ** c, int len)
{
    fprintf(stdout, "GCD( ");
    for(int i = 1; i < len; i++)
    {
        fprintf(stdout, "%s ", *(c+i));
    }
    fprintf(stdout, ")\n");
}

int main(argc, argv)
int argc;
char ** argv;
{
    if(argc <= 2)
    {
        fprintf(stderr, "Error parsing args because it is needed at least two arguments\n");
        exit(1);
    }
    display(argv, argc);
}
