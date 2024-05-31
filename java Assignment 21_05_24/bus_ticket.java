import java.util.Scanner;

public class bus_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the boarding stop: ");
		int boarding = sc.nextInt();
		System.out.println("Enter the destination stop: ");
		int destination = sc.nextInt();
		System.out.println("Enter the number of adult passenger : ");
		int adult = sc.nextInt();
		System.out.println("Enter the number of child passenger : ");
		int child = sc.nextInt();
		int num_stop = destination - boarding;
		System.out.println("Number of stops: "+num_stop);
		
		int adultticket = adult * 10 *num_stop;
		int childticket = child * 5 * num_stop;
		int total = adultticket + childticket;
		
		double discount = 0;
        if (adult >= 5) {
            discount = 0.20;
        } 
        else if (adult == 4) {
            discount = 0.15;
        } 
        else if (adult == 3) {
            discount = 0.10;
        } 
        else if (adult == 2) {
            discount = 0.05;
        } 
        else if (adult == 1) {
            discount = 0.0;
        }
        
        double discountedCost = total * (1- discount);
        
        double tax = discountedCost * 0.1;
        
        double total_cost = discountedCost + tax;
        
        System.out.println("Boarding Stop: " + boarding);
        System.out.println("Destination Stop: " + destination);
        System.out.println("Number of Stops: " + num_stop);
        System.out.println("Number of Adult Passengers: " + adult);
        System.out.println("Number of Child Passengers: " + child);
        System.out.println("Adult Ticket Cost: Rs. " + adultticket);
        System.out.println("Child Ticket Cost: Rs. " + childticket);
        System.out.println("Total Ticket Cost (before discount): Rs. " + total);
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Total Ticket Cost (after discount): Rs. " + discountedCost);
        System.out.println("Tax (10%): Rs. " + tax);
        System.out.println("Total Price (including tax): Rs. " + total_cost);



	}

}

