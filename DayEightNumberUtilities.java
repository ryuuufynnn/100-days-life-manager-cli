import java.util.Scanner;
public class DayEightNumberUtilities {
    public static void main(String[] args) {
        // initilization
        Scanner inp = new Scanner(System.in);
        int number; // receives the returned positive number from getNumber()
        
        // calling other methods
        number = getNumber(inp);
        computeSquare(number);
        evenOddChecker(number);

        // scanner close
        inp.close();
        
    } public static int getNumber(Scanner inp) {
        int positiveNumber = 0;
        
        System.out.print("Enter a positive number: ");
        positiveNumber = inp.nextInt();
                
        while(positiveNumber < 0) {
            System.out.print("Invalid. Please enter a positive number: ");
            positiveNumber = inp.nextInt();
        }
        return positiveNumber;
    } public static void computeSquare(int positiveNumber) {
        System.out.println("Square of " + positiveNumber + " is: " + (positiveNumber * positiveNumber));
    } public static void evenOddChecker(int positiveNumber) {
        if(positiveNumber % 2 == 0) {
            System.out.println(positiveNumber + " is an Even number.");
        } else {
            System.out.println(positiveNumber + " is an Odd number.");
        }
    }
}

// peak for today: 
// // The returned value can be stored in a variable
// with a different name in the calling method.