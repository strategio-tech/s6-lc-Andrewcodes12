package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     *
     * We've taken a loan from a friend and need to calculate how much we'll owe them after 3 months.
     * We are paying back 10% of the remaining loan amount each month.
     * @param amount - an integer for the amount we borrowed from our friend.
     * @return an integer for the amount we owe our friend after 3 months.
     */
    static int getRemainingAmountIn3Months(int amount) {
        int count = 0;
        while (count < 3) {
            amount = amount - (amount / 10);
            count++;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
