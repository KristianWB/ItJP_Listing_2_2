import java.util.Scanner;

public class ComputeAreaWithConsoleInput{  // Scanner is in the java.util package
    public static void main(String[] args)   {

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * Math.PI;

        // Display results
        System.out.println("The area of the circle of radius " + radius + " is: " + area);
    }

}
