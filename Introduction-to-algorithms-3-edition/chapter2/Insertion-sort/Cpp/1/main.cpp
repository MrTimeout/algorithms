#include <iostream>
using namespace std;

int insertion_sort(int arr[], int len)
{
	int key, j;
	for(int j = 1; j < len; j++)
	{
		key = arr[j];
		i = j - 1;
		while(i >= 0 && arr[i] > key)
		{
			arr[i+1] = arr[i];
			i--;
		}
		arr[i+1] = key;
	}
}

int main(void)
{

}
