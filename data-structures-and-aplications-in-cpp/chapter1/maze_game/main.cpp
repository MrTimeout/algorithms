#include <ncurses.h>
#include <iostream>
using namespace std;

int main(void)
{
    int std = 1;
    initscr();
	clear();
    printw("Hello World");
    refresh();
    getch();
    while(std != 1)
    {
        std = getch();
        switch(std)
        {
            case KEY_UP:
                printw("#");
                refresh();
                break;
            case KEY_DOWN:
                cout << "DOWN" << endl;
                break;
            case KEY_LEFT:
                cout << "LEFT" << endl;
                break;
            case KEY_RIGHT:
                cout << "RIGHT" << endl;
                break;
            default:
                cout << "OTHER" << endl;
                break;
        }
    }
    endwin();
    return 0;
}
