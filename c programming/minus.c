#include <stdio.h>
void main()
{
    int a, b;
    printf("Enter the values of a and b:");
    scanf("%d%d", &a, &b);
    if (a != b)
    {
        printf("%d is not equal to %d \n", a, b);
        if (a > b)
        {
            printf("%d is greater than %d \n", a, b);
        }
        else
        {
            printf("%d is less than %d \n", a, b);
        }
    }
    else
    {
        printf("%d is equal to %d \n", a, b);
    }
}