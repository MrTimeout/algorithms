#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define LONG_FACTORIAL "-long"
#define INT_FACTORIAL "-int"
#define TEST "-test"

bool strcomp(a, b)
const char * a, b;
{
    int la = 0, lb = 0;
    while(*(a++) != '\0')
    {
        if(*a != *b)
            return false;
        la++;lb++;
    }
    return *(const unsigned char*)a - (const unsigned char*)b; 
}

unsigned int str_len(a)
char * a;
{
    int len = 0;
    while(*(a++) != '\0')
        len++;
    return len;
}

unsigned int poww(a, b)
int a, b;
{
    if(a == 0)
        return 0;
    int t = a;
    for(int i = 0; i < b; i++)
    {
        a *= t;
    }
    return a;
}

bool isNumeric(a, c, n)
int * a;
char * c;
bool n;
{
    int len, p;
    if(!n && *c == '-')
    {
        fprintf(stderr, "The \"number\" %s has to be positive\n", c);
        exit(1);
    }
    len = str_len(c);
    p = poww(10, len-1);
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

int factorial(int n)
{
	if(n <= 1 || n >=40)
	{
		return -1;
	}
	int f = 1;
	for(int i = 1; i <= n; i++)
	{
		f *= i;
	}
	return f;
}

int testingfactorial(int from, int to)
{
	if(from <= 1 || to <= 1 || from >= 40 || to >= 40)
	{
		return -1;
	}
	int t = greatest(from, to);
	from = smallest(from, to);
	to = t;
	printf("factorial from %d to %d\n", from, to);
	for(;from < to; from++)
	{
		printf("%d! = %d\n", from, factorial(from));
	}
	return 0;
}

int main(argc, argv)
int argc;
char * argv;
{
    bool intfact = true, longfact = false; 
    while(*(argv++) != '\0')
    {
        switch(*argv)
        {
            case INT_FACTORIAL:
               if(*(argv+1))
               {

               } 
            break;
        }
    }
	testingfactorial(2, 39);
	return 0;
}
