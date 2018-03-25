import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        double total = 0;
        int numbersEntered = 0;
        double inputDouble = 0;
        
        do {
            System.out.print("Enter a number: ");
            
            try {
                inputDouble = Double.parseDouble(scanner.nextLine());
                total += inputDouble;
                numbersEntered++;
            } catch(NumberFormatException e) {
            		System.out.println("Sorry, you entered an invalid value. Please try again!");
                continue;
            }
            	
            System.out.print("Do you have another number to enter? (y/n)?");
            input = scanner.nextLine();
        } while(!input.equalsIgnoreCase("n"));
        
        double average = total / numbersEntered;
        
        System.out.println("Your average is: " + average);
        
        scanner.close();
    }
}