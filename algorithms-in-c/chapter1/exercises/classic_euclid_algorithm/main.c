#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_LEN 11

// if A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  
// If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  
// Write A in quotient remainder form (A = B⋅Q + R)
// Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
int gcd(a, b)
int a, b;
{
    int t;
    if(a == 0)
        return b;
    if(b == 0)
        return a;
    if(a < b)
    {
        t = a;
        a = b;
        b = t;
    }
    while(b > 0)
    {
        t = a % b;
        a = b;
        b = t;
    }
    return a;
}

unsigned int strlen(a)
char * a;
{
    int len = 0;
    while(*(a++) != '\0')
        len++;
    return len;
}

bool isNumeric(a)
char a;
{
    return a > 48 || a < 58;
}

int pow(a, b)
int a, b;
{
    for(int i = 0; i < b; i++)
    {
        a *= a;
    }
    return a;
}

int charToI(a)
char * a;
{
    int len, p;
    int r = 0, sign = 1;
    if(*a == '-')
    {
        a++;
        sign = -1;
    }
    if((len = strlen(a) - (sign == -1 ? 1 : 0)) >= MAX_LEN)
    {
        fprintf(stderr, "Error: Custom MAX_LEN of %d characters\n", MAX_LEN);
        return -1;
    }
    p = pow(10, len-1);
    while(*(a++) != '\0')
    {
        if(!isNumeric(*a))
        {
            fprintf(stderr, "Error: Is not a number %c\n", *a);
            return -2;
        }
        r += ((int) *a - '0') * p; 
        p /= 10;
    }
    return r;
}

void main(argc, argv)
int argc;
char ** argv;
{
    if(argc != 3)
    {
        fprintf(stderr, "Error getting params because there are not enough. It needed two\n");
        exit(1);
    }
    
}

