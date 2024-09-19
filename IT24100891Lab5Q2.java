import java.util.Scanner;
public class IT24100891Lab5Q2{
	public static void main(String[]args){

		System.out.print("Enter the number of new members introduced: ");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		if (num < 0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		switch (num){
			case 0 : 
				System.out.println("No prize");
				break;
			case 1 :
				System.out.println("Price is a : Pen");
				break;
			case 2 :
				System.out.println("Price is a : Umbrella");
				break;
			case 3 :
				System.out.println("Price is a : Bag");
				break;
			case 4 :
				System.out.println("Price is a : Travelling Chair");
				break;
			default: 
				System.out.println("Price is a : headphone");
		}
	}
}
