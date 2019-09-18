#include <stdio.h>

void display(int *arr, int len)
{
    for(int i = 0; i < len; i++)
        printf("%d ", *(arr+i));
    printf("\n");
}

int removeElement(int* nums, int numsSize, int val)
{
    int len = 0;
    int swap;
    for(int i = 0; i < numsSize; i++)
    {
        if(nums[i] == val)
        {
            len--;
            for(int j = i; j < numsSize-1; j++)
            {
                nums[j] = nums[j+1];
            }
        }
    }
    return numsSize + len;
}

int main(void)
{
    int arr[] = {3, 2, 2, 3};
    int len = 4;
    int val = 3;
    printf("Length of the final arr: %d\n", removeElement(arr, 4, val));
    display(arr); 
    return 0;
}
