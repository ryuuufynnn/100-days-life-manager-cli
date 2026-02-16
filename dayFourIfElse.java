import java.util.Scanner;
public class dayFourIfElse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int taskCount = 0;

        try{
            System.out.print("Enter your task count for today: ");
            taskCount = inp.nextInt();
        } catch(Exception e)  {
            System.out.println("Invalid input. Please enter a number.");
            inp.close();
        }
        
        if(taskCount == 0) {
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

        return;
    }
}
