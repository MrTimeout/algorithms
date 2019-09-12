#include <stdio.h>

// if u is greater than v then the greatest common divisor of u and v is the same
// as the greatest common divisor of v and u - v.

int gcd(int u, int v)
{
	if(u <= 0 || v <= 0)
	{
		return 1;
	}
	int t;
	while(u > 0)
	{
		if(u > v)
		{
			t = u;
			u = v;
			v = t;
		}
		u = u-v;
	}

	return 1;
}

int main(void)
{
	printf("%d", gcd(10, 5));
	return 0;
}
