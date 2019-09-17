#include <stdio.h>
#include <stdbool.h>

int testResult()
{
    return 2 == 1;
}

bool is_palindrome(int value)
{
    if(value < 0 || (value % 10 == 0 && value != 0))
    {
        return false; //false
    }
    int half_revert_number = 0;
    while(value > half_revert_number)
    {
        half_revert_number = half_revert_number * 10 + value % 10;
        value /= 10;
    }
    printf("%d and %d\n", half_revert_number, value);
    return half_revert_number == value || half_revert_number / 10 == value;
}

int main(void)
{
    printf("result of the test: %d\n", testResult());
    int len = 4;
    int examples[] = { 121, 4554, 4678, 8907 };
    bool results[] = { true, true, false, false };
    for(int i = 0; i < len; i++)
    {
        bool r = is_palindrome(examples[i]);
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
