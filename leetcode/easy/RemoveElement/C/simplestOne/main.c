#include <stdio.h>

int removeElement(int* nums, int numsSize, int val)
{
    for(int i = 0; i < numsSize;)
    {
        if(nums[i] == val)
        {
            for(int j = i; j < numsSize-1; j++)
            {
                nums[j] = nums[j+1];
            }
            numsSize--;
        }
        else
        {
            i++;
        }
    }
    return numsSize;
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
