#include <stdio.h>
void main()
{
    int a, b;
    printf("Enter the value of a and b:");
    scanf("%d%d", &a, &b);
    if (a > b)
    {
        printf("%d is greater than %d", a, b);
    }
    else
    {
        printf("%d is less than %d", a, b);
    }
}