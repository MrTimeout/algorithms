#include <stdio.h>

// if u is greater than v then the greatest common divisor of u and v is the same
// as the greatest common divisor of v and u - v.

int gcd(int u, int v)
{
	if(u == 0)
	       return v;
	if(v == 0)
		return u;	
	int t;
	while(u > 0)
	{
		if(u < v)
		{
			t = u;
			u = v;
			v = t;
		}
		u = u-v;
	}
	return v;
}

int gcdmod(int u, int v)
{
	if(u == 0)
		return v;
	if(v == 0)
		return u;
	return 0;
}

int main(void)
{
	printf("%d %d %d\n", 10, 5, gcd(10, 5));
	return 0;
}
