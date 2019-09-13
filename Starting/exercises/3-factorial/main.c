#include <stdio.h>

int greatest(int a, int b)
{
	return a > b ? a : b;
}

int smallest(int a, int b)
{
	return a < b ? a : b;
}

int factorial(int n)
{
	if(n <= 1 || n >=40)
	{
		return -1;
	}
	int f = 1;
	for(int i = 1; i <= n; i++)
	{
		f *= i;
	}
	return f;
}

int testingfactorial(int from, int to)
{
	if(from <= 1 || to <= 1 || from >= 40 || to >= 40)
	{
		return -1;
	}
	int t = greatest(from, to);
	from = smallest(from, to);
	to = t;
	printf("factorial from %d to %d\n", from, to);
	for(;from < to; from++)
	{
		printf("%d! = %d\n", from, factorial(from));
	}
	return 0;
}

int main(void)
{
	testingfactorial(2, 39);
	return 0;
}
