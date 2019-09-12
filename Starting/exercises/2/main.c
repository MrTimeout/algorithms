#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* reverse(const char* str)
{
    int len = sizeof(str);
    char* str_final = malloc(len);
    for(int i = 0; i < len; i++)
    {
        strcat(str_final, *(str+len-1-i));
    }
    return str_final;
}

char* binary(int x)
{
    char* str = malloc(50 * sizeof(char));
    char* str_temp = malloc(4 * sizeof(char));
    while(x > 1)
    {
        sprintf(str_temp, "%d", x % 2);
        strcat(str, str_temp);
        x /= 2;
    }
    sprintf(str_temp, "%d", x);
    strcat(str, str_temp);
    return reverse(str);
}

int main(void)
{
    int decimal = 8;
    printf("Binary of %d is %s\n", decimal, binary(decimal));
}