// This is a simplified example. Implementing Hill Cipher requires matrix operations and modular arithmetic.

#include <stdio.h>
#include <string.h>

void hillEncrypt(char text[], int key[2][2])
{
    for (int i = 0; i < strlen(text); i += 2)
    {
        if (isalpha(text[i]) && isalpha(text[i + 1]))
        {
            int x1 = text[i] - 'A';
            int x2 = text[i + 1] - 'A';

            text[i] = (key[0][0] * x1 + key[0][1] * x2) % 26 + 'A';
            text[i + 1] = (key[1][0] * x1 + key[1][1] * x2) % 26 + 'A';
        }
    }
}

void hillDecrypt(char text[], int key[2][2])
{
    // Implementing decryption for Hill Cipher is more complex and not shown here.
}

int main()
{
    char text[100];
    int key[2][2] = {{3, 2}, {5, 7}};

    printf("Enter the text (in uppercase, without spaces): ");
    gets(text);

    hillEncrypt(text, key);
    printf("Encrypted text: %s\n", text);

    // Decrypting in Hill Cipher is more complex and not shown here.

    return 0;
}
