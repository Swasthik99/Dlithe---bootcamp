import java.util.Scanner;

public class BusTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial values
        int ticketsSold = 0;
        double amountCollected = 0;
        int pin = 1234;

        while (true) {
            // Ask the user to enter the PIN
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            // Verify the PIN
            if (enteredPin == pin) {
                // Display the options
                System.out.println("1. Ticket Issue");
                System.out.println("2. Balance Collected");
                System.out.println("3. Number of Tickets Sold");
                System.out.println("4. PIN Change");
                System.out.print("Select an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        // Ticket Issue
                        System.out.print("Enter the boarding stop: ");
                        int boarding = scanner.nextInt();
                        System.out.print("Enter the destination stop: ");
                        int destination = scanner.nextInt();
                        System.out.print("Enter the number of adult passengers: ");
                        int adult = scanner.nextInt();
                        System.out.print("Enter the number of child passengers: ");
                        int child = scanner.nextInt();
                        int numStops = destination - boarding;
                        System.out.println("Number of stops: " + numStops);

                        int adultTicket = adult * 10 * numStops;
                        int childTicket = child * 5 * numStops;
                        int total = adultTicket + childTicket;

                        double discount = 0;
                        if (adult >= 5) {
                            discount = 0.20;
                        } else if (adult == 4) {
                            discount = 0.15;
                        } else if (adult == 3) {
                            discount = 0.10;
                        } else if (adult == 2) {
                            discount = 0.05;
                        }

                        double discountedCost = total * (1 - discount);
                        double tax = discountedCost * 0.10;
                        double totalCost = discountedCost + tax;

                        // Update totals
                        ticketsSold += (adult + child);
                        amountCollected += totalCost;

                        // Display ticket details
                        System.out.println("Boarding Stop: " + boarding);
                        System.out.println("Destination Stop: " + destination);
                        System.out.println("Number of Stops: " + numStops);
                        System.out.println("Number of Adult Passengers: " + adult);
                        System.out.println("Number of Child Passengers: " + child);
                        System.out.println("Adult Ticket Cost: Rs. " + adultTicket);
                        System.out.println("Child Ticket Cost: Rs. " + childTicket);
                        System.out.println("Total Ticket Cost (before discount): Rs. " + total);
                        System.out.println("Discount Applied: " + (discount * 100) + "%");
                        System.out.println("Total Ticket Cost (after discount): Rs. " + discountedCost);
                        System.out.println("Tax (10%): Rs. " + tax);
                        System.out.println("Total Price (including tax): Rs. " + totalCost);
                        break;

                    case 2:
                        // Balance Collected
                        System.out.println("Total Amount Collected: Rs. " + amountCollected);
                        break;

                    case 3:
                        // Number of Tickets Sold
                        System.out.println("Total Number of Tickets Sold: " + ticketsSold);
                        break;

                    case 4:
                        // PIN Change
                        System.out.print("Enter the old PIN: ");
                        int oldPin = scanner.nextInt();
                        if (oldPin == pin) {
                            System.out.print("Enter the new PIN: ");
                            int newPin1 = scanner.nextInt();
                            System.out.print("Re-enter the new PIN: ");
                            int newPin2 = scanner.nextInt();
                            if (newPin1 == newPin2) {
                                pin = newPin1;
                                System.out.println("PIN changed successfully!");
                            } else {
                                System.out.println("PIN mismatch. PIN change failed.");
                            }
                        } else {
                            System.out.println("Incorrect old PIN. PIN change failed.");
                        }
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

                // Ask the user if they want to continue
                System.out.print("Do you want to continue? (yes/no): ");
                String continueOption = scanner.next();
                if (!continueOption.equalsIgnoreCase("yes")) {
                    break;
                }

            } else {
                System.out.println("Transaction failed. Incorrect PIN.");
            }
        }

    }
    
}
