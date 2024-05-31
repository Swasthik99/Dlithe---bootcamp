import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 10000;
		double cash = 8000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin : ");
		int pin = sc.nextInt();
		if(pin == 1234 ) {
			System.out.print("Enter the amount to withdraw: ");
			double X = sc.nextFloat();
			if(X % 100 == 0){
				if(X < balance) {
					if(X < cash) {
						balance -= X;
						cash -= X;
						System.out.println("Transaction successful!");
                        System.out.println("Updated balance: Rs. " + balance);
					}else {
                        System.out.println("Transaction failed. Insufficient cash in the ATM.");
                    }
                } else {
                    System.out.println("Transaction failed. Insufficient balance.");
                }
            } else {
                System.out.println("Transaction failed. The amount must be a multiple of 100.");
            }
        } else {
            System.out.println("Transaction failed. Incorrect PIN.");
        }
	}
	

}
