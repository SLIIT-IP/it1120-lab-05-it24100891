import java.util.Scanner;
public class IT24100891Lab5Q3{
	public static void main(String[] args){


		int discount;
		int perdaycharge = 48000; 		


		System.out.print("Enter Start Date (1-31): ");
		Scanner obj = new Scanner(System.in);
		int stdate = obj.nextInt();
		if (stdate <1 || stdate >31){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}

		System.out.print("Enter End Date (1-31): ");
		Scanner obj2 = new Scanner(System.in);
		int enddate = obj2.nextInt();
		if (enddate <1 || enddate >31){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}

		if (stdate > enddate){
			System.out.println("Error: Start Date must be less than End Date.");
			return;
		
		
		}
		
		int totaldays = enddate- stdate;

		int totalcharge =  perdaycharge * totaldays;

		
		if (totaldays < 3){
			discount = 0;
		}
		else if ( totaldays <5){
			discount = totalcharge *10/100;
		}
		else{
			discount = totalcharge *20/100;
		}
		
		int finalamount = totalcharge - discount;


		
		System.out.println("Room Charge Per Day: Rs. 48000.0/="); 
		System.out.println("Number of Days Reserved: "+ totaldays);
		System.out.println("Total Amount to be Paid: " + finalamount);
	}
}
		 
		