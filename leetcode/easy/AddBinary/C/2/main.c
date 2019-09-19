#include <stdio.h>
#include <stdlib.h>
#include <math.h>

char addBinaryLogic(char a, char b, int* borrowed)
{
    char c;
    switch(abs((int)(a) - (int)(b)))
    {
        case 0:
            c = *borrowed == 1 ? 49 : 48;
            printf("%c\n", c);
            *borrowed = a == 49 ? 1 : 0;
        break;
        case 1:
            c = *borrowed == 1 ? 48 : 49;
            printf("%c\n", c);
            *borrowed = c == 48 ? 1 : 0;
        break;
    }
    return c;
}

char * addBinary(char * a, char * b)
{
    char *c = malloc(sizeof(char) * 5);
    int borrowed = 0;
    int i = 0;
    while(*(a++) != '\0' && *(b++) != '\0')
    {
        c[i] = addBinaryLogic(*a, *b, &borrowed);
        i++;
    }
    c[i] = '\0';
    return c;
}

int main(void)
{
    char *a = "011";
    char *b = "011";
    printf("%s", addBinary(a, b));
    return 0;
}
