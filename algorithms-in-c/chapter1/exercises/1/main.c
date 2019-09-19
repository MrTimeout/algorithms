#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int numerator;
    int denominator;
} fraction;

int gcd(int a, int b)
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
    while(a > 0)
    {
        if(b == 0)
            return a;
        t = (int)a % b;
        a = b;
        b = t;
    }
    return -1;
}

int reduce(fraction *f)
{
    if(f->denominator == 0) //(*f).denominator
    {
        return -1;
    }
    int gcdnd = gcd(f->numerator, f->denominator);
    if(gcdnd == -1)
    {
        return -1;
    }
    f->numerator /= gcdnd;
    f->denominator /= gcdnd;
    return 0;
}

char* toString(fraction f)
{
    char *str = malloc(20 * sizeof(char));
    sprintf(str, "%d/%d\n", f.numerator, f.denominator);
    if(realloc(str, sizeof(str)) == NULL)
    {
        return "";
    }
    return str;
}

int main(void)
{
    fraction f = { 270, 192 };
    printf("%s", toString(f));
    reduce(&f);  
    printf("%s", toString(f));
    return 0;
}
