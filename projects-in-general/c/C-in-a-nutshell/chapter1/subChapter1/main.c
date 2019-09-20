#include <stdio.h>
#include <math.h>
#include <stddef.h>
%:include <stdlib.h>
%:define BIG_NAME "LUCKY"
%:define str( s ) %: s
%:define concat( x, y ) x %:%: y
%:define make_func( name ) void my_ %:%: name( int foo ) { fprintf(stdout, "This is my lucky number: %d\n", foo); }

double circularArea(double r);

make_func(BIG_NAME);

// Remenber that there are two ways to solve the problem of
// representating the unicode values:
//  - wide character type (wchar_t from stddef.h)
//  - Multitbyte character type. 
// widw characters are all the same size
// Multibyte characters can be one or more bytes size
// and it dependes on the context (string, stream...)
void printing()
{
    wchar_t wc = L'\x3B1'; // Lower case greek letter
    char str[10];
    int nBytes;
    nBytes = wctomb(str, wc);
    printf("bytes got: %d\n", nBytes);
}

// <:    [
// :>    ]
// <%    {
// %>    }
// %:    #
// %:%:  ##
void digraphs()
{
    int arr<:2:> = <% 1, 2 %>;
    int len = sizeof(arr) / sizeof(arr<:0:>);
    char * s = malloc(sizeof(char) * 10);
    int xy = 10;

    for(int i = 0; i < len; i++)
        *(s++) = arr<:i:> + '0';

    fprintf(stdout, "%s\n", s);

    fputs(str(hello define preprocessor), stdout);
    
    fprintf(stdout, "%d\n", concat(x, y));    
    
    void (*func)(int) = concat(my_, BIG_NAME);
    (*func)(8);
}

int main(void)
{
    double radius = 2.0;
    printf("Area of the circle with radius = %1.8f, is %1.8f\n", radius, circularArea(radius));
    digraphs();
    return 0;
}

double circularArea(r)
double r;
{
    return M_PI * pow(r, 2.0); 
}
