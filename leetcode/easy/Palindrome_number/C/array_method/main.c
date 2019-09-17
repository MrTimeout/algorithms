#include <stdbool.h>
#include <stdio.h>

#define MAX_SIZE 10

bool is_palidrome(int x)
{
    if(x < 10 && x != 0)
    {
       return false; 
    }
    int arr[MAX_SIZE];
    int len = 0;
    while(x > 0)
    {
        arr[len] = x % 10;
        x /= 10;
        len++;
    }
    for(int i = 0; i < len/2; i++)
    {
        if(arr[i] != arr[len-i-1])
        {
            return false;
        }
    }
    return true;
}

int main(void)
{
    int len = 5;
    int examples[] = { 121, 2345, 1221, 10, 4 };
    bool result[] = { true, false, true, false, false };
    for(int i = 0; i < len; i++)
    {
        if(result[i] == is_palidrome(examples[i]))
        {
            printf("Succesfull test for the number %d\n", examples[i]);
        }
        else
        {
            printf("Fail to test the number %d\n", examples[i]);
        }
    }
    return 0;
}

