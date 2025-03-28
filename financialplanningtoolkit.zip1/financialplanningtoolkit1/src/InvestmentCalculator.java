import java.util.Scanner;
import java.lang.System;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter Initial Investment Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();
        double rate = annualRate / 100;

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        System.out.print("Enter Number of Times Interest Compounded Per Year: ");
        int timesCompounded = sc.nextInt();

        // Calculate future value
        double futureValue = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        // Display result
        System.out.printf("Your investment will grow to: %.2f%n", futureValue);
        sc.close();
    }
}