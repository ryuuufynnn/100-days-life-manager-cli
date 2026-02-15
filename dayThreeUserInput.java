import java.util.Scanner;
public class dayThreeUserInput {
    public static void main(String[] args) {
        // declaration
        Scanner inp = new Scanner(System.in);
        String name;
        int age;
        // input
        System.out.print("Enter your name: ");
        name = inp.nextLine();
        System.out.print("Enter your age: ");
        age = inp.nextInt();
        // output
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Next year, you will be " +(age + 1) + ".");
        // scannerClose
        inp.close();
    }    
}
