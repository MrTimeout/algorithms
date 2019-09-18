#include <stdio.h>

int removeElement(int* nums, int numsSize, int val)
{
    int j = 0;
    for(int i = 0; i < numsSize; i++)
    {
        if(nums[i] != val)
        {
           nums[j] = nums[i];
           j++;
        }
    }
    return j;
}


void display(int *arr, int len)
{
    for(int i = 0; i < len; i++)
        printf("%d ", *(arr+i));
    printf("\n");
}

int main(void)
{
    int arr[] = {0,1,2,2,3,0,4,2};  
    int len = 8;
    int val = 2;
    printf("Length of the final arr: %d\n", removeElement(arr, len, val));
    display(arr, len); 
    return 0;
}
