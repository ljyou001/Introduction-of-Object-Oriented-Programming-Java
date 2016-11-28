public class TestSimpleFraction
{
    public static void main(String[] args)
    {
        SimpleFraction x = new SimpleFraction(2, 5);
        SimpleFraction y = new SimpleFraction(8, 14);
        SimpleFraction z = new SimpleFraction(3, 7);

        System.out.println("x = " + x.toString());
        System.out.println("y = " + y.toString());
        System.out.println("z = " + z.toString());
        System.out.println("Type for x, y, z: " + x.getType() + " " + y.getType() + " " + z.getType());
        System.out.println("Value for x, y, z: " + x.getValue() + " " + y.getValue() + " " + z.getValue());

        SimpleFractionArray ar = new SimpleFractionArray();
        ar.addFraction(x);
        ar.addFraction(y);
        ar.addFraction(z);

        System.out.print("This array: ");
        for(int i = 0; i < ar.fractions.size(); i++)
        {
            System.out.print(ar.fractions.get(i) + " ");
        }
        System.out.println();

        ar.aSort();
        System.out.print("Ascend sorted array: ");
        for(int i = 0; i < ar.fractions.size(); i++)
        {
            System.out.print(ar.fractions.get(i) + " ");
        }
        System.out.println();

        ar.dSort();
        System.out.print("Descend sorted array: ");
        for(int i = 0; i < ar.fractions.size(); i++)
        {
            System.out.print(ar.fractions.get(i) + " ");
        }
        System.out.println();

        System.out.println("Max: " + ar.getMax());

        System.out.println("Min: " + ar.getMin());

        System.out.print("Fraction x ");
        if(x.largerThan(y)){
            System.out.print("is larger than");
        } else if(x.equalTo(y)) {
            System.out.print("equals to");
        } else {
            System.out.print("is smaller than");
        }
        System.out.println(" y");
        x.add(z);
        System.out.println("x + z = " + x);

        if(z.isPalindromicPrime()){
            System.out.println("z is palindromic prime.");
        } else {
            System.out.println("z is not palindromic prime.");
        }
    }
}