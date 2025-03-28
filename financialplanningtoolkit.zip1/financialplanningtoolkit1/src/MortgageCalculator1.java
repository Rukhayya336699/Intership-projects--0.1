import java.util.Scanner;
public class MortgageCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();
        double monthlyRate = (annualRate / 100) / 12;

        System.out.print("Enter Loan Term (Years): ");
        int years = sc.nextInt();
        int months = years * 12;

        double monthlyPayment = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
                                (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Your Monthly Mortgage Payment: %.2f\n", monthlyPayment);
        sc.close(); // Ensure this line is typed manually
    }
}