import java.util.Scanner;

public class Electricity_bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Service no: ");
		Double num = sc.nextDouble();
		System.out.println("Enter the previous reading: ");
		int pr = sc.nextInt();
		System.out.println("Enter the current reading : ");
		int cr = sc.nextInt();
		
		System.out.println("Consumed Unit: "+cr);
		Double unit = (double) (cr - pr);
		Double cost = (double) 0;
		if(unit<100) {
			cost = unit * 1;
		}
		else if(unit < 150 & unit >= 100) {
			cost = unit * 1.5;
		}
		else if(unit < 200 & unit >= 150) {
			cost = unit * 2;
		}
		else {
			cost = unit * 2.5;
		}
		Double cgst = cost * 0.05;
		Double sgst = cost * 0.15;
		float total = (float) (cost + cgst +sgst);
		System.out.println("Cost: "+total);

	}

}
