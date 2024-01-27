import java.util.Scanner;

public class MoneyBreakdown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // variables for bills and coins
        final int TENS_VAL = 10, FIVES_VAL = 5, ONES_VAL = 1;
        final float QUARTERS_VAL = 0.25F, DIME_VAL = 0.10F, NICK_VAL = 0.05F, PEN_VAL = 0.01F;

        // Variables for amount for bills and coins
        int tens, fives, ones, quarters, dimes, nickels, pennies;

        // Variables to hold amount entered by the user
        float amount, runningAmount;

        // Exchange rate to Kenyan Shillings
        final double EXCHANGE_RATE = 110.0;

        // prompt user for amount
        System.out.print("Enter a monetary amount $: ");
        amount = scan.nextFloat();

        // Save amount to runningAmount
        runningAmount = amount;

        // calculate the number of tens
        tens = (int) (runningAmount / TENS_VAL);
        runningAmount %= TENS_VAL;

        // calculate the number of fives
        fives = (int) (runningAmount / FIVES_VAL);
        runningAmount %= FIVES_VAL;

        // calculate the number of ones
        ones = (int) (runningAmount / ONES_VAL);
        runningAmount %= ONES_VAL;

        // calculate the number of quarters
        quarters = (int) (runningAmount / QUARTERS_VAL);
        runningAmount %= QUARTERS_VAL;

        // calculate the number of dimes
        dimes = (int) (runningAmount / DIME_VAL);
        runningAmount %= DIME_VAL;

        // calculate the number of nickels
        nickels = (int) (runningAmount / NICK_VAL);
        runningAmount %= NICK_VAL;

        // calculate the number of pennies
        pennies = (int) (runningAmount / PEN_VAL);

        // print the breakdown
        System.out.printf("You entered $%.2f\n", amount);
        System.out.printf("%d ten dollar bills.\n", tens);
        System.out.printf("%d five dollar bills.\n", fives);
        System.out.printf("%d one dollar bills.\n", ones);
        System.out.printf("%d quarters.\n", quarters);
        System.out.printf("%d dimes.\n", dimes);
        System.out.printf("%d nickels.\n", nickels);
        System.out.printf("%d pennies.\n", pennies);

        // convert to Kenyan Shillings
        double kenyanShillings = amount * EXCHANGE_RATE;
        System.out.printf("Equivalent in Kenyan Shillings: %.2f KES\n", kenyanShillings);
    }
}
