public class SimpleGameBoardTester
{
    public static void main(String args[])
    {

        SimpleGameBoard b = new SimpleGameBoard(6, 9, 'O');
        b.printBoard();
        System.out.println();

        System.out.println(b.getEmpty() + " represents empty space");

        if(b.addChip(5, 8, 'B'))
        {
            System.out.println("Chip is added successfully");
        }
        else
        {
            System.out.println("Fail to add chip");
        }

        b.printBoard();
        System.out.println();

        if(b.addChip(4, 7, 'W'))
        {
            System.out.println("Chip is added successfully");
        }
        else
        {
            System.out.println("Fail to add chip");
        }
        b.printBoard();
        System.out.println();

        if(b.addChip(4, 7, 'W'))
        {
            System.out.println("Chip is added successfully");
        }
        else
        {
            System.out.println("Fail to add chip");
        }
        b.printBoard();
        System.out.println();

        char chip = b.getChip(5, 8);
        System.out.println("Chip: " + chip);
    }
}
