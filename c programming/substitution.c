#include <stdio.h>
#include <string.h>

void substitutionEncrypt(char text[], char key[])
{
    for (int i = 0; i < strlen(text); i++)
    {
        if (isalpha(text[i]))
        {
            char base = islower(text[i]) ? 'a' : 'A';
            text[i] = key[text[i] - base];
        }
    }
}

void substitutionDecrypt(char text[], char key[])
{
    for (int i = 0; i < strlen(text); i++)
    {
        if (isalpha(text[i]))
        {
            char base = islower(text[i]) ? 'a' : 'A';
            for (int j = 0; j < 26; j++)
            {
                if (key[j] == text[i])
                {
                    text[i] = j + base;
                    break;
                }
            }
        }
    }
}

int main()
{
    char text[100], key[26];

    printf("Enter the text: ");
    gets(text);

    printf("Enter the substitution key (26 characters, case-insensitive): ");
    gets(key);

    if (strlen(key) != 26)
    {
        printf("Key must contain 26 characters.\n");
        return 1;
    }

    substitutionEncrypt(text, key);
    printf("Encrypted text: %s\n", text);

    substitutionDecrypt(text, key);
    printf("Decrypted text: %s\n", text);

    return 0;
}
