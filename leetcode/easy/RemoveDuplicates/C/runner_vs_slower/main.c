#include <stdio.h>

int removeDuplicates(int *nums, int numsSize)
{
    if(numsSize == 0)
        return 0;
    int j = 1;
    for(int i = 1; i < numsSize; i++)
    {
        if(nums[i] != nums[i-1])
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
    int arr[] = {0,0,1,1,1,2,2,3,3,4};
    int len = 10;
    printf("Length of the final arr: %d\n", removeDuplicates(arr, len));
    display(arr, len); 
    return 0;
}
