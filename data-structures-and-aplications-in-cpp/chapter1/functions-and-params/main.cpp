#include <iostream>
using namespace std;

//When we call this function, it calls a copy constructor to copy value pass by params to the local params.
//If the type of this params are different from the params of the function, then it performs a type conversion.
//When all is done, it calls to the destructor for the data types.
int abc(int a, int b, int c)
{
    return a + b * c;
}

float ab(float a, float b, float c)
{
    return a + b * c;
}

template<class T>
T aa(T a, T b, T c)
{
    return a + b * c;
}

int main(void)
{
    double b = 2.4;
    float c = 3.4;
    int a = 4;
    cout << abc(a, b, c) << endl;
    
    cout << ab(a, b, c) << endl;
    
    cout << aa<int>(a, 3, 4) << endl;
    cout << aa<float>(c, c, c) << endl;
    cout << aa<double>(b, b, b) << endl;
    return 0;
}
