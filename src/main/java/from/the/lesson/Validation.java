package from.the.lesson;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        InputStream in = System.in;
        PrintStream out = System.out;
        Scanner scan = new Scanner(in);
        out.print("Enter your name: ");
        String name = scan.nextLine();
        out.print("Enter the number from 0 to 10: ");
        while (true) {

            if (!scan.hasNextInt()) {
                out.println("This not a number");
                scan.next();
                continue;
            }
            int number = scan.nextInt();

            if ((0 > number) || (10 < number)) {
                out.println("You are out of range");
                continue;
            } else out.println("Great, " + name + "!");
            System.exit(0);
        }
    }
}
