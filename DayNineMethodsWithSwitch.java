import java.util.Scanner;
public class DayNineMethodsWithSwitch {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int number;
        // calling the other methods
        number = getNumber(inp);
        showMenu(inp, number);

        // scanner close
        inp.close();
    } public static int getNumber(Scanner inp) {
        int number;

        System.out.print("Enter a number: ");
        number = inp.nextInt();
        return number;
    } public static void showMenu(Scanner inp, int number) {
        int option = 0;

        boolean isRunning = true;
        
        while(isRunning) {
            System.out.println("NUMBER TOOL:");
            System.out.println("1. Enter another number.");
            System.out.println("2. Compute Square.");
            System.out.println("3. Check Even or Odd.");
            System.out.println("4. Exit.");

            System.out.print("Choose option: ");
            option = inp.nextInt();

            switch(option) {
                case 1: 
                    System.out.print("Enter another number: ");
                    number = inp.nextInt();
                    break;
                case 2:
                    computeSquare(number);
                    break;
                case 3:
                    evenOddChecker(number);
                    break;
                case 4:
                    System.out.println("Thankyou for using Number Tool!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }    
        
    } public static void evenOddChecker(int number) {
        if(number % 2== 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    } public static void computeSquare(int number) {
        int square;
        square = number * number;
        System.out.println("The square of " + number + " is: " + square);
    }
}