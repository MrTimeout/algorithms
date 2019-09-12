#include <stdio.h>

// typedef struct {
//     int numerator;
//     int denominator;
// } fraction;

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

// int reduce(fraction *f)
// {
//     if(f->denominator == 0) //(*f).denominator
//     {
//         return -1;
//     }
//     return 0;
// }

int main(void)
{
    //fraction f = { 20, 25 };
    printf("%d %d %d\n", 270, 192, gcd(270, 192));
    return 0;
}