#include <stdio.h>

int linear_search(int arr[], int len, int target)
{
	for(int i = 0; i < len; i++)
	{
		if(arr[i] == target)
			return i;
	}
	return 0;
}

int main(void)
{
	int arr[] = {3, 2, 10, 5, 4};
	printf("%d\n", linear_search(arr, 5, 4));
}
