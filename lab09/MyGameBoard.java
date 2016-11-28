public class MyGameBoard extends SimpleGameBoard
{
    // instance variables   
    private int row;  //number of rows of the game board
    private int col;  //number of columns of the game baord
    private char player1;  //player 1's chip character
    private char player2;  //player 2's chip character
    public MyGameBoard(int row, int col, char empty, char player1, char player2)
    { 
        super(row,col,empty);
        this.row = row;
        this.col = col;
        this.player1 = player1;
        this.player2 = player2;
    }
    public boolean isFull()
    { 
        for (int cr = 0; cr < row; cr++)
        {
            for (int cc = 0; cc < col; cc++)
            {
                if(super.getChip(cr, cc) != super.getEmpty())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }
    public boolean isWin(char player)
    {
        for (int cr = 0; cr < row; cr++)
        {
            for (int cc = 0; cc < col; cc++)
            {
                if(count(player,cr,cc,1,0) >= 5 || count(player,cr,cc,0,1) >= 5||
                 count(player,cr,cc,1,1) >= 5 || count(player,cr,cc,1,-1) >= 5)
                {
                    return true;
                }
            }
        }
        return false;
    }
    private int count(char player, int row, int col, int dirX, int dirY)
    {
        int count = 0;
        while(row >=0 && row < this.row && 
        col >=0 && col < this.col && 
        getChip(row, col) == player)
        {
            count++;
            row = row + dirX;
            col = col + dirY;
        }
        return count;
    }

}