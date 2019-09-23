#include <stdio.h>
#include <stdlib.h>

#define MAX_LEN 10

unsigned int str_len(char * c)
{
    int len = 0;
    while(*(c++) != '\0')
        len++;
    return len;
}

unsigned int mypow(int a, int b)
{
    if(a == 0)
        return 0;
    unsigned int t = 1;
    for(int i = 1; i <= b; i++)
        t *= a;
    return t;
}

int convert(char * c)
{
   int len, p, sign = 1, a;
   len = str_len(c);
   if(*c == '-')
   {
        len--;
        c++;
        sign = -1;
   }
   if(len >= MAX_LEN)
   {
        fprintf(stderr, "Error parsing number because it overflow max length of 10\n");
        exit(1);
   }
   p = mypow(10, len-1);
   a = 0;
   while(*c != '\0')
   {
        if(*c < 47 || *c > 57)
        {
            fprintf(stderr, "Error parsing number because of this char %c\n", *c);
            exit(1);
        }
        a += (*c - '0') * p;
        p /= 10;
        c++;
   }
   a *= sign;
   return a;
}

int main(int argc, char ** argv)
{
    if(argc != 2)
    {
        fprintf(stderr, "Error parsing arguments. It is necessary to pass one decimal numbe\n");
        exit(1);
    }
    int v = convert(*(argv+1));
    fprintf(stdout, "value that you wrote was a decimal number: %d\n", v);
    exit(0);
}

