#include <stdio.h>
#include <stdlib.h>

char *itoa(const int num) 
{
    char *out = malloc((sizeof(char) * abs(num / 10))+1);
    sprintf(out, "%d", num);
    return out;
}

char *fizzbuzzer(int num) 
{
    if (num % 15 == 0) 
    {
        return "FizzBuzz";
    }
    else if (num % 3 == 0) 
    {
        return "Fizz";
    } 
    else if (num % 5 == 0) 
    {
        return "Buzz";
    } 
    else 
    {
        return itoa(num);        
    } 
}

int main(int argc, char *argv[]) 
{
    for (int num = 1; num <= 100; num++) 
    {
        printf("%s\n", fizzbuzzer(num));
    }
}
