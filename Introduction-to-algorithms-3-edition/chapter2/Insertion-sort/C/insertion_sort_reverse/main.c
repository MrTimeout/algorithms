#include <stdio.h>

void insertion_sort(int arr[], int len)
{
	int key, i;
	for(int j = 1; j < len; j++)
	{
		key = arr[j];
		i = j - 1;
		while(i >= 0 && arr[i] < key)
		{
			arr[i+1] = arr[i];
			i--;
		}
		arr[i+1] = key;
	}
}

void print_arr(int arr[], int len)
{
	for(int i = 0; i < len; i++)
	{
		printf("%d\t", arr[i]);
	}
	printf("\n");
}

int main(void)
{
	int arr[] = {5, 2, 4, 6, 1, 3};
	insertion_sort(arr, 6);
	print_arr(arr, 6);
	return 0;
}
