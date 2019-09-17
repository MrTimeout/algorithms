#include <ncurses.h>

int loopingUserInput()
{
    initscr();
    raw(); //Receive all the input of the user without taking care of the signals like Ctrl+Z or Ctrl+C. You can also use cbreak(), but it doesnt allow the feature of raw
    int input = 0;
    while(input != 1)
    {
        input = getch();
        printw("%c %d\n", input, input);
        refresh();
    }
    endwin();
    return 0;
}

int main(void)
{
    return loopingUserInput();
}
