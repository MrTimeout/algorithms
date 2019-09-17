#include <stdio.h>

int is_palindrome(int value)
{
    if(value < 0 || (value % 10 && value != 0))
    {
        return 1; //false
    }
    int half_revert_number = 0;
    while(x > half_revert_number)
    {
        half_revert_number = half_revert_number * 10 + x % 10;
        x /= 10;
    }
    return half_revert_number == x || half_revert_number / 10 == x; //true
}

int main(void)
{
    int len = 4;
    int examples[] = { 121, 4554, 4678, 8907 };
    int results[] = { 0, 0, 1, 1 };
    for(int i = 0; i < len; i++)
    {
        int r = is_palindrome(examples[i]);
        if(r == results[i])
        {
            printf("This is correct, the number %d is palindrome\n", examples[i]);
        }
        else
        {
            printf("Revise your code with the number %d\n", examples[i]);
        }
    }
}
