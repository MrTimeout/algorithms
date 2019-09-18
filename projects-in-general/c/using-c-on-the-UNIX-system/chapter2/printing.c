#include <stdio.h>

// +++++++++++++++++++++++++++++++++++ BUGS ++++++++++++++++++++++++++++++++++++++ //
// Never use gets(). Because it is impossible to tell without knowing 
// the data in advance how many characters gets() will read, and because
// gets() will continue to store characters past the end of the buffer, 
// it is extremely dangerous to use. It has been used to break computer
// security. Use fgets() instead.

int equivalence_of_functions()
{
    int len = 12;
    int c, err;
    for(int i = 0; i < len; i++)
    {
        printf("Write a character(int getchar(void)): ");
        c = getchar();
        if(c == EOF || ferror(stdin))
        {
            printf("\nError getting char using method int getchar(void)");
            clearerr(stdin);
            return 1;
        }
        printf("\nPutting the char that you wrote(void putchar(char c)): ");
        err = putchar(c);
        if(err == EOF || ferror(stdout))
        {
            printf("\nError putting char using method int putchar(int c)");
            clearerr(stdout);
            return 1;
        }
        printf("\nWrite a character(int getc(FILE* stream)): ");
        c = getc(stdin);
        if(c == EOF || ferror(stdin))
        {
            printf("\nError getting char that you wrote(int getc(FILE* stream)");
            clearerr(stdin);
            return 1;
        }
        printf("\nPutting the char that you wrote(int putc(FILE* stream))");
        c = putc(c, stdout);
        if(c == EOF || ferror(stdout))
        {
            printf("\nError putting the char that you wrote(int putc(int c, FILE* stream))");
            clearerr(stdout);
            return 1;
        }
        printf("\nWrite a character(int fgetc(FILE* stream)): ");
        c = fgetc(stdin);
        if(c == EOF || ferror(stdin))
        {
            printf("\nError getting char that you wrote(int fgetc(FILE* stream)");
            clearerr(stdin);
            return 1;
        }
        printf("\nPutting the character to the stdout(fputc(int c, FILE* stream)): ");
        c = fputc(c, stdout);
        if(c == EOF || ferror(stdout))
        {
            printf("\nError putting the char that you wrote(int fputc(int c, FILE* stream))");
            clearerr(stdout);
            return 1;
        }
        printf("\n");
    }
    return 0;
}

int print_hey(const char* str)
{
    printf("We can use int fputs(const char* c, FILE* stream): ");
    fputs(str, stdout); 
    printf("\n");
    fputs(str, stderr); 
    printf("\n");

    printf("We can use int puts(const char* c): ");
    puts(str); 
    puts(str); 

    return 0;
}

int main(void)
{
    print_hey("Hey world!");
    if(equivalence_of_functions() == 0)
    {
        printf("All perfect brop\n");
    }
    else
    {
        printf("There was a problem");
    }
    return 0;
}
