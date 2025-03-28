import java.util.Scanner;

public class SavingsGoalCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter your target savings amount: ");
        double goal = sc.nextDouble();

        System.out.print("Enter monthly contribution amount: ");
        double monthlyContribution = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = sc.nextDouble();
        double rate = annualRate / 100;

        // Calculate number of months required
        double months = Math.log((goal * rate / 12 + monthlyContribution) / monthlyContribution) /
                Math.log(1 + rate / 12);

        // Display result
        System.out.printf("It will take %.2f months to reach your goal.%n", months);

        // Close the scanner
        sc.close();
    }
}