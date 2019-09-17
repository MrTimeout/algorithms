#include <stdio.h>

int testResult()
{
    return 2 == 1;
}

int is_palindrome(int value)
{
    if(value < 0 || (value % 10 && value != 0))
    {
        return 0; //false
    }
    int half_revert_number = 0;
    while(value > half_revert_number)
    {
        half_revert_number = half_revert_number * 10 + value % 10;
        value /= 10;
    }
    return half_revert_number == value || half_revert_number / 10 == value; //true
}

int main(void)
{
    printf("result of the test: %d\n", testResult());
    int len = 4;
    int examples[] = { 121, 4554, 4678, 8907 };
    int results[] = { 1, 1, 0, 0 };
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
