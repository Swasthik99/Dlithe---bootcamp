import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        double balance = 10000;
        double atmCash = 50000;
        int pin = 1234;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Ask the user to enter the PIN
            System.out.print("Enter your ATM PIN: ");
            int enteredPin = scanner.nextInt();
            
            // Verify the PIN
            if (enteredPin == pin) {
                // Display the options
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. PIN Change");
                System.out.print("Select an option: ");
                int option = scanner.nextInt();
                
                switch (option) {
                    case 1:
                        // Balance Enquiry
                        System.out.println("Your current balance is: Rs. " + balance);
                        break;
                    
                    case 2:
                        // Deposit
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("Amount deposited successfully!");
                            System.out.println("Updated balance: Rs. " + balance);
                        } else {
                            System.out.println("Invalid amount. Deposit failed.");
                        }
                        break;
                    
                    case 3:
                        // Withdraw
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount % 100 == 0) {
                            if (withdrawAmount <= balance) {
                                if (withdrawAmount <= atmCash) {
                                    balance -= withdrawAmount;
                                    atmCash -= withdrawAmount;
                                    System.out.println("Transaction successful!");
                                    System.out.println("Updated balance: Rs. " + balance);
                                } else {
                                    System.out.println("Transaction failed. Insufficient cash in the ATM.");
                                }
                            } else {
                                System.out.println("Transaction failed. Insufficient balance.");
                            }
                        } else {
                            System.out.println("Transaction failed. The amount must be a multiple of 100.");
                        }
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
