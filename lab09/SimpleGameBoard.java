public class SimpleGameBoard
{
    private char[][] board;  //the game board
    private char empty;  //a character that represents an empty place on the game board

    public SimpleGameBoard(int row, int col, char empty)
    {
        this.empty = empty;
        board = new char[row][];
        for (int i = 0; i < row; i++)
        {
            board[i] = new char[col];
        }               

        //fill the game board will the empty char
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                board[i][j] = empty;
            }
        }

    }
    public void printBoard()    
    {
        System.out.print("  ");
        for(int i = 0; i < board[0].length; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0; i < board.length; i++)
        {
            System.out.print(i+" ");
            for(int j = 0; j < board[i].length; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public char getEmpty()
    {
        return empty;
    }
    public char getChip(int row, int col)
    {
        return board[row][col];
    }
    /**
     * Place a chip on the specified row and column of the game board
     * 
     * @prarm row   a row number of the game board
     * @param col   a column number of the game baord
     * @param chip  a chip character
     * @return     true if the chip is placed successfully.Otherwise, return false.
     */
    public boolean addChip(int row, int col, char chip)
    {
        if(row >= board.length || col >= board[0].length)
        {
            // System.out.println("1");
            return false;
        } 
        if(board[row][col] != empty)
        {
            //  System.out.println("2" + board[row][col] + " " + empty);
            return false;
        }
        board[row][col] = chip;
        return true;
    }

}
