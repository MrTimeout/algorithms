#include <iostream>
using namespace std;

void display(int * arr, int len)
{
    for(int i = 0; i < len; i++)
        cout << *(arr+i) << " ";
    cout << "" << endl;
}

void insertion_sort(int arr[], int len)
{
    int key, i;
    for(int j = 0; j < len; j++)
    {
        key = arr[j];
        i = j - 1;
        while(i >= 0 && key > arr[i])
        {
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = key;
    }
}

int main(void)
{
    int len = 6;
    int arr[] = {5, 2, 4, 6, 1, 3}; 
	insertion_sort(arr, len);
	display(arr, len);
    return 0;
}
