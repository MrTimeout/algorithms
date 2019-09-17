#include <stdio.h>

//FILE *fdopen(int fildes, const char *mode);
int touch(const char *path)
{
    FILE * f = NULL;
    f = fopen(*path, "w");
    if(*f != 0)
    {
        printf("File created with success\n");
        fclose(f);
    }
    else 
    {
        printf("Error to create the file\n");
        if(f != NULL)
        {
            fclose(f);
            return -1;
        }
        return -1;
    }
    return 0;
}

int writeTo(const char *data)
{

    return 0;
}

int main(void)
{
    char name[] = "test_file";
    if(touch(name) != 0)
    {
        return -1;
    }
    return 0;
}
