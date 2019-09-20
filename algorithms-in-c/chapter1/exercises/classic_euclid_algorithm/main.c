#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_LEN 11

unsigned int a_b_s(a)
int a;
{
    return a < 0 ? -a : a;
}

int sign(a, b)
int a, b;
{
    return a * b >= 0 ? 1 : -1;
}

// if A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  
// If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  
// Write A in quotient remainder form (A = B⋅Q + R)
// Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
int gcd(a, b)
int a, b;
{
    int t, s;
    if(a == 0)
        return b;
    if(b == 0)
        return a;
    s = sign(a, b);
    a = a_b_s(a);
    b = a_b_s(b);
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
    return a * s;
}

unsigned int str_len(a)
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

int po(a, b)
int a, b;
{
    int t = a;
    for(int i = 0; i < b-1; i++)
        a = t * a;
    return a;
}

//Cases:
//char * a (char array of the number)
//if a is negative -> sign = -
//if len(a) > MAX_INT
//pow(10^(len-1))
//while-loop
//if it is not a number return error
//else keep moving
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
    if((len = str_len(a)) >= MAX_LEN)
    {
        fprintf(stderr, "Error: Custom MAX_LEN of %d characters\n", MAX_LEN);
        exit(-1);
    }
    p = po(10, len-1);
    while(*a != '\0')
    {
        if(!isNumeric(*a))
        {
            fprintf(stderr, "Error: Is not a number %c\n", *a);
            exit(-2);
        }
        r += ((int) *a - '0') * p * sign;
        p /= 10;
        a++;
    }
    return r;
}

int main(argc, argv)
int argc;
char ** argv;
{
    int first, second;
    if(argc != 3)
    {
        fprintf(stderr, "Error getting params because there are not enough. It needed two\n");
        exit(1);
    }
    first = charToI(*(argv+1));
    second = charToI(*(argv+2));
    fprintf(stdout, "gcd(%d, %d) = %d\n", first, second, gcd(first, second));
    return 0;
}

