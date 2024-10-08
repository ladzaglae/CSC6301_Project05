import java.util.Collections; 
import java.util.Scanner;
import java.util.Stack;

/**
 * A class that implement a program that reads a list of Integer numbers from the scanned input
 * and saves them into a Stack sorted from the smallest to the largest
 * 
 * <p>
 * Code reuse is done twice in the getInputFromUser method.
 * Firstly, Stack class of the Java collection framework is used to store the integers.
 * Secondly, sort method of the Collection class of the Java collection framework is used to sort the integers.
 * In version 1.0.0 the class was called SortedLinkedList
 * </p>
 * 
 * @author Evans Edem Ladzagla
 * @version 2.0.0
 */
public class SortedStack {
    
    /**
     * Get integer numbers from users
     * 
     * <p>
     * Continually prompt user to enter intergers and store them using the
     * Stack class from the java collection framework until done is entered.
     * Sort the numbers and return it.
     * 
     * from verison 2.0.0 uses stack to store numbers.
     * </p>
     * 
     * @return numbers - Stack
     */
    public static Stack<Integer> getInputFromUser() {        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input        
        Stack<Integer> numbers = new Stack<>(); // Initialize a Stack to store Integer values
        System.out.println("Enter integers (type 'done' to finish):");

        // Read integers from user input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // If the input is an integer, add it to the list
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                // Exit condition to stop input
                break;
            } else {
                System.out.println("Invalid input, please enter an integer or 'done'.");
            }
        }
        
        scanner.close(); // Close the scanner        
        Collections.sort(numbers); // Sort the LinkedList
        return numbers;
    }

    /**
     * Prints the list of integers to the console.
     *
     * @param numbers The list of integers to be printed.
     */
    public static void printList(Stack<Integer> numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * An entry point to start the program.
     * 
     * <p>
     * Call getInputFromUser method to get sorted integers from user.
     * Print the numbers to the console.
     * </p>
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Stack<Integer> numbers = getInputFromUser();

        // Output the sorted list
        System.out.print("Sorted list of integers: ");
        printList(numbers); 
    }
}
