class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char c: moves.toCharArray())
        {
            switch(c)
            {
                case 'L':
                    y--;
                break;
                case 'R':
                    y++;
                break;
                case 'D':
                    x--;
                break;
                case 'U':
                    x++;
                break;
            }
        }
        return x == 0 && y == 0;
    }
}
