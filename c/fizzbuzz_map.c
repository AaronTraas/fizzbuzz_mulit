#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NUM_REPLACEMENTS 2

struct ReplacementMapEntry
{
    int multiple;
    char *replacement;
};

char *itoa(const int num) 
{
    char *out = malloc((sizeof(char) * abs(num / 10))+1);
    sprintf(out, "%d", num);
    return out;
}

char *fizzbuzzer(int num, const struct ReplacementMapEntry *replacements, int num_replacements) 
{
    char *out = "";

    for (int i = 0; i < num_replacements; i++) {
        if (num % replacements[i].multiple == 0) {
            char *buf = malloc((sizeof out) + (sizeof replacements[i].replacement));
            strcpy(buf, out);
            strcat(buf, replacements[i].replacement);
            //free(out);
            out = buf;
        }
    }

    if (strlen(out) == 0)
    {
        return itoa(num);        
    } 

    return out;
}

int main(int argc, char *argv[]) 
{
    struct ReplacementMapEntry replacements[NUM_REPLACEMENTS];
    replacements[0].multiple = 3;
    replacements[0].replacement = "Fizz";
    replacements[1].multiple = 5;
    replacements[1].replacement = "Buzz";

    for (int num = 1; num <= 100; num++) 
    {
        printf("%s\n", fizzbuzzer(num, replacements, NUM_REPLACEMENTS));
    }
}
