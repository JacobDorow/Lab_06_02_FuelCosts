import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double gallonsOfGas = 0;
        double fuelEfficiency = 0;
        double priceOfGas = 0;
        double costOf100Miles;
        double milesTilEmpty;

        Scanner in = new Scanner(System.in);

        System.out.println("Input the number of gallons of gas in the tank: ");
        if (in.hasNextInt())
        {
            gallonsOfGas = in.nextInt();
            in.nextLine();
        }
        else {
            System.out.println("Please only use Integers.");
            System.exit(0);
        }
        System.out.println("Input the fuel efficiency in miles per gallon: ");
        if (in.hasNextInt())
        {
            fuelEfficiency = in.nextInt();
            in.nextLine();
        }
        else {
            System.out.println("Please only use Integers.");
            System.exit(0);
        }
        System.out.println("Input the price of gas per gallon: $");
        if (in.hasNextDouble())
        {
            priceOfGas = in.nextDouble();
            in.nextLine();
        }
        else {
            System.out.println("Please only use Doubles.");
            System.exit(0);
        }
        costOf100Miles = fuelEfficiency * priceOfGas;
        System.out.println("It would cost you $" + costOf100Miles + " to drive 100 miles.");
        milesTilEmpty = gallonsOfGas * fuelEfficiency;
        System.out.println("You can drive " + milesTilEmpty + " miles before you'll run out of gas.");
    }
}