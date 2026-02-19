import java.util.Scanner;
public class DaySevenMethodWithParameters {
    public static void main(String[] args) {
        // preparation
        Scanner inp = new Scanner(System.in);
        int number;

        // input + calling other methods
        number = getNumber(inp);
        evenOddChecker(number);

        // scanner close
        inp.close();

    } public static int getNumber(Scanner inp) {
        int number;
        System.out.print("Enter a number: ");
        number = inp.nextInt();

        //return Math.pow(number, 2);
        System.out.println("Square of " + number + " is " + (number * number));
        return number;

    } public static void evenOddChecker(int number) {
        // check if even or odd number
        if(number % 2 == 0) {
            System.out.printf(+number + " is an Even number.");
        } else {
            System.out.printf(number + " is an Odd number.");
        }

        // inp.close();
    }
}

// peak for today: 
// Math.pow only returns double; alternative (number * number);
// int variableName = (int) //variableName you want to convert into integer;
// feb. 19, 2026