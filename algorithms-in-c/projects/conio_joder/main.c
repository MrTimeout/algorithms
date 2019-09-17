#include <stdio.h>
#include <conio.h>

int main(void)
{
    while(!kbhit())
    {
        printf("Print a key pls\n");
    }
    return 0;
}
