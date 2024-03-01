#include <stdio.h>
int main()
{
    int a = 50, b = 20;
    if (a > b)
    {
        if (a > 100)
            printf("ace");
        if (b < 100)
            b = 50;
    }
    else if (a == b)
    {
        printf("king");
    }
    else
    {
        printf("queen");
    }
    return 0;
}
