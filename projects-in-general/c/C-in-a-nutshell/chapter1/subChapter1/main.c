#include <stdio.h>
#include <math.h>

double circularArea(double r);

int main(void)
{
    double radius = 2.0;
    printf("Area of the circle with radius = %1.8f, is %1.8f\n", radius, circularArea(radius));
    return 0;
}

double circularArea(double r)
{
    return M_PI * pow(r, 2.0); 
}
