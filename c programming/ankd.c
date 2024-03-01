#include <stdio.h>

int main()
{
    char str[] = "Hello World";

    for (int i = 0; str[i] != '\0'; i++)
    {
        str[i] = str[i] & 127;
    }

    printf("AND result: %s\n", str);

    for (int i = 0; str[i] != '\0'; i++)
    {
        str[i] = "Hello World"[i];
    }
    for (int i = 0; str[i] != '\0'; i++)
    {
        str[i] = str[i] ^ 127;
    }

    printf("XOR result: %s\n", str);

    return 0;
}
