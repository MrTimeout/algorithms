#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_LEN 10
#define MAX_BINARY_LEN 32 

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

bool isNumeric(char * c, int * a, bool n)
{
   int len, p, sign = 1;
   if(!n && *c == '-')
   {
        fprintf(stderr, "Error parsing number because it must be positive and is negative\n");
        return false;
   }
   len = str_len(c);
   if(n && *c == '-')
   {
        len--;
        c++;
        sign = -1;
   }
   if(len >= MAX_LEN)
   {
        fprintf(stderr, "Error parsing number because it overflow max length of 10\n");
        return false;
   }
   p = mypow(10, len-1);
   *a = 0;
   while(*c != '\0')
   {
        if(*c < 47 || *c > 57)
        {
            fprintf(stderr, "Error parsing number because of this char %c\n", *c);
            return false;
        }
        *a += (*c - '0') * p;
        p /= 10;
        c++;
   }
   *a *= sign;
   return true;
}

void binary(int decimal)
{
    int * a = malloc(sizeof(int) * MAX_BINARY_LEN);
    int cont = 0;
    if(decimal < 0)
    {
        fprintf(stdout, "-");
        decimal = -decimal;
    }
    while(decimal > 0)
    {
        *(a+cont) = decimal % 2;
        decimal /= 2;
        cont++;
    }
    for(int i = cont-1; i >= 0; i--)
        fprintf(stdout, "%d", *(a+i));
    fprintf(stdout, "\n");
}

int main(int argc, char ** argv)
{
    int decimal;
    if(argc != 2)
    {
        fprintf(stderr, "Error parsing arguments, it is necessary to receibe one argument, the number decimal to convert to binary\n");
        exit(1);
    }
    if(isNumeric(*(argv+1), &decimal, true))
    {
        binary(decimal);
    }
    else
    {
        fprintf(stderr, "Error parsing decimal number\n");
    }
}

