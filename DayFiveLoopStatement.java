import java.util.Scanner;
public class DayFiveLoopStatement {
    public static void main(String[] args) {
        // declaration
        Scanner inp = new Scanner(System.in);
        int taskCount = 0;
        boolean running = true;
        String doYouWantToContinue = "";
        // loop statement
        while (running) {
            // try catch statement
            try {
                // input
                System.out.print("Enter your task count for today: ");
                taskCount = inp.nextInt();
                inp.nextLine(); // clear leftover newline
                // if else statement
                if (taskCount < 0) {
                    System.out.println("Task count cannot be negative. Please enter a valid number.");
                    continue;
                } 
                else if (taskCount == 0) {
                    System.out.println("No task scheduled.");
                } 
                else if (taskCount >= 1 && taskCount <= 3) {
                    System.out.println("Light day.");
                } 
                else if (taskCount >= 4 && taskCount <= 7) {
                    System.out.println("Balanced productivity.");
                } 
                else if (taskCount >= 8 && taskCount <= 12) {
                    System.out.println("Heavy workload.");
                } 
                else {
                    System.out.println("Warning: Possible burnout.");
                }
                // input 2
                System.out.print("Do you want to continue? (yes/no): ");
                doYouWantToContinue = inp.nextLine();

            } 
            catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                inp.nextLine(); // clear invalid input
                continue;
            }
            // switch statement
            switch (doYouWantToContinue.toLowerCase()) {
                case "yes":
                    running = true;
                    break;

                case "no":
                    running = false;
                    System.out.println("Have a good day!");
                    break;

                default:
                    System.out.println("Invalid choice. Exiting program.");
                    running = false;
                    break;
            }
        }
        // scanner close
        inp.close();
    }
}