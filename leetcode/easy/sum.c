#include<stdio.h>
#include<stdlib.h>

void printArr(int* arr)
{
	int len = *arr;
	printf("{ ");
	for(int i = 1; i < len; i++)
	{
		printf("%d  ", *(arr+i));
	}
	printf("}\n");
}

int* seq(int from, int to, int seq, int result[])
{
	int swap;
	if(seq == 0)
	{
		return NULL;
	}
	else if(seq > 0 && from > to)
	{
		swap = from;
		from = to;
		to   = swap;		
	}
	else if(seq < 0 && from < to)
	{
		swap = from;
		from = to;
		to   = swap;
	}
	int len = abs((int) (abs(to) - abs(from)) / seq) + 1;
	result = realloc(result, len * sizeof(int));
	int i = 0;
	for(;from < to; from += seq)
	{
		result[i] = from;
		i++;
	}
	result[len-1] = len;
	return result;
}

int isHere(int* arr, int *len, int* trgt)
{
    for(int i = 0; i < *len; i++)
    {
		printf("%d ", *(arr+i));
        if(*(arr+i) == *trgt)
        {
            return i;
        }
    }
    return -1;
}

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize)
{
	int len = 2;
    int* result = malloc(2 * sizeof(int));
    int tmpArr[numsSize];
    int tmp, tm;
	returnSize = &len;
    for(int i = 0; i < numsSize; i++)
    {
        tmp = target - *(nums+i);
		printf("%d\n", tmp);
        tm  = isHere(tmpArr, &i, (nums+i));
        if(i >= 1 && tm != -1)
        {
            *result     = tm;
            *(result+1) = i;
			// printf("%d\n", *result);
			// printf("%d\n", *(result+1));
            return result;
        }
        tmpArr[i] = tmp;
    }
    return NULL;
}

int main(void)
{
	int arr[] = {1, 2, 3, 4, 5};
	int len = sizeof(arr) / sizeof(int);
	int t = 4;
	int* returnSize;
	int* returnValue;
	returnValue = twoSum(arr, len, t, returnSize);
	for(int i = 0; i < *returnSize; i++)
	{
		printf("%d ", *(returnValue+i));
	}
	return 0;
}
