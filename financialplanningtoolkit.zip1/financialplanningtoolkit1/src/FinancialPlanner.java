import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FinancialPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true) {
            try {
                System.out.println("\nFinancial Planning Toolkit");
                System.out.println("1. Mortgage Calculator");
                System.out.println("2. Investment Return Calculator");
                System.out.println("3. Savings Goal Calculator");
                System.out.println("4. Income Tax Calculator");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                // Check if input is an integer
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    sc.nextLine(); // Clear buffer after reading integer

                    switch (choice) {
                        case 1:
                            MortgageCalculator1.main(args); // Ensure this class exists
                            break;
                        case 2:
                            InvestmentCalculator.main(args); // Ensure this class exists
                            break;
                        case 3:
                            SavingsGoalCalculator.main(args); // Ensure this class exists
                            break;
                        case 4:
                            IncomeTaxCalculator.main(args);
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            sc.close(); // Close the scanner before exiting
                            return; // Exit the loop and program
                        default:
                            System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                            break;
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine(); // Clear invalid input
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine(); // Clear the invalid input
            } catch (NoSuchElementException e) {
                System.out.println("Error: No input available. Exiting.");
                break; // Exit the loop if no input is available
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                sc.nextLine(); // Clear input buffer in case of error
            }
        }
        sc.close(); // Ensure the scanner is closed at the end
    }
}