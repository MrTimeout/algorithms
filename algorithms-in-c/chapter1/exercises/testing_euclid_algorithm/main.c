#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

unsigned int absolute(int a)
{
    return a < 0 ? -a : a;
}

void swap(int * a, int * b, bool greater)
{
    int tmp;
    if(greater && absolute(*a) < absolute(*b))
    {
        tmp = *a;
        *a = *b;
        *b = tmp;
    }
    else if(!greater && absolute(*a) > absolute(*b))
    {
        tmp = *a;
        *a = *b;
        *b = tmp;
    }
}

//euclid(a, b) = euclid(b, r)
//t = b
//b = a % b
//a = t
int gcd(int a, int b)
{
    int tmp;
    swap(&a, &b, true);
    fprintf(stdout, "hey %d %d\n", a, b);
    while(b != 0)
    {
        tmp = b;
        b = a % b;
        a = tmp;
    }
    return a;
}

unsigned str_len(char * c)
{
    int len = 0;
    while(*(c++) != '\0')
        len++;
    return len;
}

int poww(int a, int b)
{
    if(a == 0)
    {
        fprintf(stderr, "Error parsing element a\n");
        exit(1);
    }
    int t = 1;
    for(int i = 1; i <= b; i++)
        t *= a;
    return t;
}

bool isNumeric(char * c, int * a, bool n)
{
    int len, p, sign = 1;
    if(!n && *c == '-')
    {
        fprintf(stderr, "Error parsing element because is negative\n");
        return false;
    }
    len = str_len(c);
    if(n && *c == '-')
    {
        c++;
        len--;
        sign = -1;
    }
    p = poww(10, len-1);
    while(*c != '\0')
    {
        if(*c < 48 || *c > 57)
        {
            fprintf(stderr, "Error parsing number because it has other elements non numeric\n");
            return false;
        }
        *a += (*c - '0') * p;
        p /= 10; 
        c++;
    }
    *a *= sign;
    return true;
}

int main(int argc, char ** argv)
{
    int a = 0, b = 0;
    if(argc != 3)
    {
        fprintf(stderr, "Error pasring arguments");
        exit(1);
    }
    if(isNumeric(*(argv+1), &a, true) && isNumeric(*(argv+2), &b, true))
    {
        fprintf(stdout, "gcd(%d,%d) = %d\n", a, b, gcd(a, b));
    }
    else
    {
        fprintf(stderr, "Error revise your input\n");
    }
    exit(0);
}
