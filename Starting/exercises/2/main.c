#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* reverse(const char* str)
{
	int len = strlen(str);
	char* str_reverse = malloc(len);
	for(int i = 0; i < len; i++)
	{
		*(str_reverse+i) = *(str+len-i-1);
	}
	return str_reverse;
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
