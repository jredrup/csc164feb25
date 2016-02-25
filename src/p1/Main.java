package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;
        do {
            System.out.print("Enter a radius: ");
            try {
                String reply = input.next();
                double radius = Double.parseDouble(reply);
                //double radius = input.nextDouble();
                double area = Math.PI * Math.pow(radius, 2);
                System.out.printf("Area of circle with radius of %.2f is %.2f", radius, area);
                continueInput = false;
            } catch (InputMismatchException /*Exception*/ e) {
                System.out.println("Input mismatch!  Try again, dumbass.");
                //System.out.println(e.getMessage());
                //System.out.println(e);
                //System.exit(1);

                //flush input buffer
                input.nextLine();

            } catch (NumberFormatException e) {
                System.out.println("Number Format error!  Try again, dumbass.");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Uh oh.  Try again, dumbass.");
            }

        }while (continueInput);
    }
}