import java.util.Scanner;

public class UsingScanner
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String firstName = input.next();
        System.out.print("Enter your middle name: ");
        String middleName = input.next();


        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }
}
