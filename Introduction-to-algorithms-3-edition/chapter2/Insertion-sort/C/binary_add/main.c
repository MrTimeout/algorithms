#include <stdio.h>

extern char zero = '0';

int charToI(a, b, lenA)
char * a;
int * b;
int lenA;
{
    if(lenA <= 0)
        return -1;
    for(int i = 0; i < lenA; i++)
    {
        b[i] = ((int)a[i] - (int)zero);
    }
}

unsigned int strlen(char * c)
{
    int i = 0;
    while(*(c++) != '\0')
    {
        i++;
    }
    return i;
}

void display(a, lenA)
int * a;
int lenA;
{
    for(int i = 0; i < lenA; i++)
        printf("%d ", *(a+i));
    printf("\n");
}

int max(a, b)
int * a;
int * b;
{
    int swap;
    if( *a > *b)
    {
        swap = *a;
        *a = *b;
        *b = swap;
        return 0;
    }
    swap = *b;
    *b = *a;
    *a = swap;
    return 1;
}

int full_zero(a, from, to) 
int * a;
int from;
int to;
{
    for(int i = from; i < to; i++)
        full[i] = 0;
    return 0;
}

int binary_logic(a, b, borrowed)
int a;
int b;
int * borrowed;
{
    int r;
    switch(a + b)
    {
        case 0:
            r = *borrowed;
            *borrowed = 0;
        break;
        case 1:
            r = *borrowed == 1 ? 0 : 1;
        break;
        case 2:
            r = *borrowed == 1 ? 1 : 0;
            *borrowed = 1;
        break;
    }
    return r;
}

int binary_add(a, b, lenA, lenB)
int * a;
int * b;
int lenA;
int lenB;
{
    if(lenA <= 0 || lenB <= 0)
        return -1;
    for(int i = 0; i < lenA; i++)
    {
        printf("%d ", i);
    }
}

int binary_add_char(a, b, c, lenA, lenB)
char * a;
char * b;
int * c;
int lenA;
int lenB;
{
    if(lenA <= 0 || lenB <= 0)
        return -1;
    int limit = max(lenA, lenB) == 0 ? lenB : lenA;
    int borrowed;
    for(int i = 0; i < limit; i++)
    {
        *(c+i) = binary_logic(*(a+i) - '0', *(b+i) - '0', borrowed);
    }
    return 0;
}

int main(argc, argv)
int argc;
char ** argv;
{
    if(argc != 3)
    {
        fprintf(stderr, "You have to write two binary numbers to be added and obetain a result");
        return 1;
    }
    binary_add_char(*(argv+1), *(argv+2), );
    return 0;
}
