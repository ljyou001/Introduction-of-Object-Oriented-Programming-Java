import java.io.*;
import java.util.*;
public class Gomoku
{
    public final static char PLAYER1 = 'B';
    public final static char PLAYER2 = 'W';
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        MyGameBoard gb = new MyGameBoard(10, 10, 'O', PLAYER1, PLAYER2);
        gb.printBoard();
        System.out.println();
        /*TO DO*/
        while(gb.isFull()==false && gb.isWin(PLAYER1)==false && gb.isWin(PLAYER2)==false)
        {
            System.out.println("It is B's turn!");
            System.out.println("Enter the row: ");
            int row = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the column: ");
            int col = keyboard.nextInt();
            keyboard.nextLine();
            gb.addChip(row,col,'B');
            gb.printBoard();
            if(gb.isFull()==true || gb.isWin(PLAYER1)==true)
            {
                break;
            }
            System.out.println("It is W's turn!");
            System.out.println("Enter the row: ");
            row = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter the column: ");
            col = keyboard.nextInt();
            keyboard.nextLine();
            gb.addChip(row,col,'W');
            gb.printBoard();
            if(gb.isFull()==true || gb.isWin(PLAYER2)==true)
            {
                break;
            }
        }
        if (gb.isFull() == true)
        {
            System.out.println("Board is full!");
        }
        if (gb.isWin(PLAYER1) == true)
        {
            System.out.println("Player 1 wins!");
        }
        if (gb.isWin(PLAYER2) == true)
        {
            System.out.println("Player 2 wins!");
        }
    }
}
