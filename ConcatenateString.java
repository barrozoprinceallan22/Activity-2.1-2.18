/*Prince Allan Barrozo
BSIT NETSEC 1-1*/
import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name = input.nextLine();

        System.out.print("Enter favorite color: ");
        String color = input.nextLine();

        System.out.print("Enter favorite animal: ");
        String food = input.nextLine();

        System.out.print("Enter favorite food: ");
        String animal = input.nextLine();

        System.out.println();
        System.out.println("I had a dream that " + name + " ate a");
        System.out.println(color + " " + animal + " and said it tasted like " + food + "!");
    }
}
