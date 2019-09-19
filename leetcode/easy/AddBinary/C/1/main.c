#include <stdio.h>

int min(a, b)
int a, b;
{
    return a < b ? a : b;
}

unsigned int strleni(c)
char * c;    
{
    int i = 0;
    while(*(c++) != '\0')
        i++;
    return i;
}

char * addBinary(char * a, char * b)
{
   int la = strlen(a);
   int lb = strlen(b);
   int min = min(la, lb);
   for(int i = 0; i < min; i++)
   {
        
   }
}

int main(void)
{
    
    return 0;
}

