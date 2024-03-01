#include <stdio.h>
#include <string.h>

void caesarEncrypt(char text[], int key)
{
    for (int i = 0; i < strlen(text); i++)
    {
        if (isalpha(text[i]))
        {
            char base = islower(text[i]) ? 'a' : 'A';
            text[i] = (text[i] - base + key) % 26 + base;
        }
    }
}

void caesarDecrypt(char text[], int key)
{
    caesarEncrypt(text, 26 - key); // Decryption is simply encryption with the complement of the key
}

int main()
{
    char text[100];
    int key;

    printf("Enter the text: ");
    gets(text);

    printf("Enter the key (0-25): ");
    scanf("%d", &key);

    caesarEncrypt(text, key);
    printf("Encrypted text: %s\n", text);

    caesarDecrypt(text, key);
    printf("Decrypted text: %s\n", text);

    return 0;
}
