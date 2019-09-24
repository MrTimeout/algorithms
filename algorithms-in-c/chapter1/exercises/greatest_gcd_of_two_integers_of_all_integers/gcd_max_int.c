#include <stdio.h>
#include <stdbool.h>
#include <limits.h>

bool isPrime(int n)
{
    int pos = 2;
    if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
        return false;
    while(pos < n / 2)
    {
        if(n % pos == 0)
            return false;
        pos++;
    }
    return true;
}

bool isPrimeLL(unsigned long long int n)
{
    unsigned long long int pos = 2;
    if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
        return false;
    while(pos < n / 2)
    {
        if(n % pos == 0)
            return false;
        pos++;
    }
    return true;
}

void fromTheInfinityLL()
{
    unsigned long long int a = -1, b = -1;
    for(unsigned long long int i = ULLONG_MAX; i > 2; i--)
    {
        if(isPrimeLL(i))
        {
            if(a == -1)
                a = i;
            else if (b == -1)
                b = i;
            if(a != -1 && b != -1)
            {
                fprintf(stdout, "gcd(%lld, %lld) = 1\n", a, b);
                break;
            }
        }
    }
}

void fromTheInfinity()
{
    int a = -1, b = -1;
    for(int i = INT_MAX; i > 2; i--)
    {
        if(isPrime(i))
        {
            if(a == -1)
                a = i;
            else if (b == -1)
                b = i;
            if(a != -1 && b != -1)
            {
                fprintf(stdout, "gcd(%d, %d) = 1\n", a, b);
                break;
            }
        }
    }
}

int main(void)
{
    fromTheInfinity();
    fromTheInfinityLL();
    return 0;
}

