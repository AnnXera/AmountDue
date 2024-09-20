
package runamountdue;
import java.util.Scanner;
public class RunAmountDue {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Enter Price");
            System.out.println("2. Enter Price & Quantity");
            System.out.println("3. Enter Price, Quantity, & Discount");
            System.out.println("4. Exit");
            
            System.out.print("Choose an Option: ");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.println("Total due for 1 item: " + AmountDue.computeAmountDue(price));
                    break;
                
                case 2:
                    System.out.print("Enter Price: ");
                    price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.println("Total due for " + quantity + " items: " + AmountDue.computeAmountDue(price, quantity));
                    break;
                
                case 3:
                    System.out.print("Enter Price: ");
                    price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    quantity = scanner.nextInt();
                    System.out.print("Enter Dicsount: ");
                    double discount = scanner.nextDouble();
                    System.out.println("Total due for " + quantity + " items: " + AmountDue.computeAmountDue(price, quantity, discount));
                    break;
                
                case 4:
                    System.out.println("Exiting...");
                    return;
                    
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        
    }
}
