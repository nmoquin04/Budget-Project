import java.util.Scanner;
    
public class Budget extends ConsoleProgram
{
    void displayValues(double budget, double expenses) {
        double difference = 0;
        
        difference = budget - expenses;

        System.out.printf("\nYour budget is $%.2f this month", budget);
        System.out.printf("\nYour expenses are $%.2f this month\n", expenses);
        
        if (difference > 0) System.out.printf("\nYou are $%.2f under budget", difference);
        else if (difference < 0) System.out.printf("\nYou are $%.2f over budget", Math.abs(difference));
        else System.out.println("\nYou are breaking even.");
    }
    
    Scanner scan = new Scanner(System.in);

    
    public void run()
    {
        double difference = 0;
        
        System.out.println("How much money do you have budgeted for this month?");
        double budget = scan.nextDouble();
        
        System.out.println("\nEnter you expenses. Enter 0 to stop.");
        double input = scan.nextDouble();
        double expense = 0;
        
        while (input != 0) {
            expense += input;
            input = scan.nextDouble();
        }
        
        displayValues(budget, expense);
        
    }
}
