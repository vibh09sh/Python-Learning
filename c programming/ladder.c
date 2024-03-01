#include <stdio.h>
void main()
{
    int a, b, c;
    printf("Enter the values of a ,b and c:");
    scanf("%d%d", &a, &b, &c);
    if (a > b || b > c)
    {
        printf("The largest number is %d", a);
    }
    else if (a < b || b < c)
    {
        printf("The smallest number is %d", b);
    }
    else
    {
        printf("The middle number is %d", c);
    }
}