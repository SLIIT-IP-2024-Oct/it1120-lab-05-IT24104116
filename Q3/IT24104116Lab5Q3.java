 import java.util.Scanner;
 
 public class IT24104116Lab5Q3 {
	public static final int ROOM_CHARGE_PER_DAY = 48000;
	public static final int DISCOUNT_10_PRECENT = 10;
	public static final int DISCOUNT_20_PRECENT = 20;
	 public static final int MIN_DAYS_FOR_DISCOUNT = 3;
	
	public static void main (String[]args) {
		Scanner scanner= new Scanner (System.in);
		
		System.out.println ("Enter the start date (1-31):");
		int startDate = scanner.nextInt();
		
		System.out.println ("Enter the end date (1-31):");
		int endDate = scanner.nextInt();
		
		if (startDate < 1 || startDate>31 || endDate < 1 || endDate > 31) {
		System.out.println("Error : Start Date must be less than End Date");
			return;
		}
		
		if ( startDate >= endDate ) {
			System.out.println("Error: Start date must be less than end date");
			return;
		}

		int daysReserved = endDate - startDate;

		
		int numberOfDays = endDate - startDate + 1 ;
		double discountRate= 0;
		
		if (numberOfDays >= MIN_DAYS_FOR_DISCOUNT) {
            discountRate = numberOfDays >= 5 ? 20 : 10;
		
				}
		
		double discountAmount = (ROOM_CHARGE_PER_DAY * numberOfDays * discountRate)/100;
		double totalAmount = (ROOM_CHARGE_PER_DAY * numberOfDays) - discountAmount;
		
		System.out.println("Number od days reserved: " + numberOfDays);
		System.out.println("Total amount to be paid: Rs" + totalAmount);
		}
	}