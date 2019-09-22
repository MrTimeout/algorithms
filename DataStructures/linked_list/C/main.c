#include <stdio.h>
#include <stdlib.h>
//#include "linked_list.h"

typedef struct node
{
    int val;
    struct node * next;
}node;

extern int tail(head, val)
node ** head;
int val;
{
    int len = 1;
    node * current = *head;
    while(current->next != NULL)
    {
        current = current->next;
        len++;
    }
    current->next = malloc(sizeof(node));
    current->next->val = val;
    current->next->next = NULL;
    return ++len;
}

extern void display(head)
node * head;
{
    node * current = head;
    while(current != NULL)
    {
        fprintf(stdout, "%d ", current->val);
        current = current->next;
    }
}

int main(void)
{
    node * head = malloc(sizeof(node));
    if(head == NULL)
    {
        fprintf(stderr, "Error allocating space in memory");
        return 1;
    }
    head->val = 1;
    head->next = NULL;
    for(int i = 2; i < 13; i++)
    {
        fprintf(stdout, "length: %d\t->\t", tail(&head, i));
        display(head);
        fprintf(stdout, "\n");
    }
    return 0;
}
