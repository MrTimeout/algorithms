#include <stdio.h>
#include <stdlib.h>

extern unsigned int str_len(c)
char * c;
{
    int i = 0;
    while(*(++c) != NULL)
    {
        i++;
    }
    return i;
}

extern char* rand_char(c, times)
int c;
int times;
{
    char * r = malloc(sizeof(char) * times + 1);
    switch(c)
    {
        case 0: //upper-case letters
           r = rand_char_internal(65, 91, times);
          break;
        case 1: //lower-case letters
           r = rand_char_internal(97, 123, times);
           break;
        case 2: //numbers
           r = rand_char_internal(48, 58, times);
           break;
        default:
           r = rand_char_internal(65, 91, times); 
           break;
    }
    return r;
}

char * rand_char_internal(from, to, times) 
int from;
int to;
int times;
{
    if(from >= to || from < 0 || to < 0 || from > 255 || to > 255 || times < 0)
        exit(1);
    char * r = malloc(sizeof(char) * (times) + 1); 
    for(int i = 0; i < times; i++)
    {
        r[i] = rand() % (to-from) + from; 
    }
    r[times] = NULL;
    return r;
}

