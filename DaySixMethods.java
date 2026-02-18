import java.util.Scanner;
public class DaySixMethods {
    public static void main(String[] args) {
        // scanner should declare outside the methods so all methods can use it.
        Scanner inp = new Scanner(System.in);
        // calling the methods in the main method.
        displayHeader();
        String name = getName(inp);
        int taskCount = getTaskCount(inp);
        // return special value.
        if(taskCount == -1) {
            return; // stops the main method once the invalid input is detected.
        }
        greetUser(name);
        evaluateTaskCount(taskCount);
        // scanner close.
       inp.close();

    } public static void displayHeader() {
        System.out.print("\n=== LifeManagerCLI ===\n");

    } public static String getName(Scanner inp) {
        // direct return no need to use: String name;
        System.out.print("Enter your name: ");
        return inp.nextLine();

    } public static int getTaskCount(Scanner inp) {
        // initialization.
        int taskCount = 0;
        // try and catch blockk to handle the exception.
        try {
            System.out.print("Enter task count: ");
        taskCount = inp.nextInt();
        } catch(Exception ime) {
            System.out.println("Invalid input");
            inp.nextLine(); // clear the invalid input from the scanner buffer.
            return -1; // special value to indicate invalid input.
        }
        return taskCount;
        
    } public static void evaluateTaskCount(int taskCount) {
        if(taskCount < 0) {
            System.out.println("Task count cannot be negative.");
        } else if(taskCount == 0) {
            System.out.println("No task scheduled.");
        } else if(taskCount >= 1 && taskCount <= 3) {
            System.out.println("Light day.");
        } else if(taskCount >= 4 && taskCount <= 7) {
            System.out.println("Balanced productivity.");
        } else if(taskCount >= 8 && taskCount <= 12) {
            System.out.println("Heavy workload.");
        } else{
            System.out.println("Warning: Possible burnout.");
        }
        
    } public static void greetUser(String name) {
        System.out.println("hello, " + name);
    }
}

// System.exit(0);
// it kills the program immediately.
