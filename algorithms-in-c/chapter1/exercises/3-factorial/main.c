#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define INT_FACTORIAL "int"
#define TEST "test"

void display(char * c)
{
    while(*c != '\0')
    {
        fprintf(stdout, "%c ", *c);
        c++;
    }
    fprintf(stdout, "\n");
}

bool strcompa(char * a, char * b)
{
    int la = 0, lb = 0;
    while(*a != '\0' && *b != '\0')
    {
        if(*a != *b)
        {
            fprintf(stderr, "Comparing %s and %s\n", b, a);
            return false;
        }
        la++; lb++;
        a++; b++;
    }
    return *a == '\0' && *b == '\0';
}

unsigned int str_len(a)
char * a;
{
    int len = 0;
    while(*(a++) != '\0')
        len++;
    return len;
}

unsigned long long int poww(a, b)
int a, b;
{
    if(a == 0)
        return 0;
    long long int t = 1;
    for(int i = 1; i < b; i++)
    {
        t *= a;
    }
    return t;
}

//Becareful when is negative, n=true...
bool isNumeric(a, c, n)
long long int * a;
char * c;
bool n;
{
    int len;
    unsigned long long int p;
    if(!n && *c == '-')
    {
        fprintf(stderr, "The \"number\" %s has to be positive\n", c);
        exit(1);
    }
    len = str_len(c) + (*c == '-' ? -1 : 0);
    p = poww(10, len-1);
    *a = 0;
    while(*c != '\0')
    {
        if(*c < 48 || *c > 57)
        {
            fprintf(stderr, "Error parsing value to number because is not a number\n");
            return false;
        }
        *a += (*c - '0') * p;
        p /= 10;
        c++;
    }
    return true;
}

int greatest(int a, int b)
{
	return a > b ? a : b;
}

int smallest(int a, int b)
{
	return a < b ? a : b;
}

long long int greatest_long(long long int a, long long int b)
{
	return a > b ? a : b;
}

long long int smallest_long(long long int a, long long int b)
{
	return a < b ? a : b;
}


unsigned long long int factorial(int n)
{
    if(n < 0)
    {
        fprintf(stderr, "Error getting factorial of a negative value\n");
        exit(1);
    }
	unsigned long long int f = 1;
	for(int i = 1; i <= n; i++)
	{
		f *= i;
	}
	return f;
}

int testingfactorial(long long int from, long long int to)
{
	if(from < 0 || to < 0)
	{
		return -1;
	}
	long long int t = greatest_long(from, to);
	from = smallest_long(from, to);
	to = t;
	printf("factorial from %lld to %lld\n", from, to);
	for(;from < to; from++)
	{
		printf("%lld! = %lld\n", from, factorial(from));
	}
	return 0;
}

int main(argc, argv)
int argc;
char ** argv;
{
    long long int v;
    if(argc != 3 )
    {
        fprintf(stderr, "Error parsing args\n");
        exit(1);
    }
    if(strcompa(*(argv+1), INT_FACTORIAL))
    {
        if(isNumeric(&v, *(argv+2), false))
        {
            fprintf(stdout, "%lld! = %lld\n", v, factorial(v));
            exit(0);
        } 
    }
    else if(strcompa(*(argv+1), TEST))
    {
        testingfactorial((long long int)0, (long long int)50);
        exit(1);
    }
    else
    {
        fprintf(stderr, "Error getting params: remember to use -int to a specific factorial and test to print a serial of testing factorial\n");
        exit(1);
    }
    return 0;
}
