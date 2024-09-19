import java.util.Scanner;
public class IT24100891Lab5Q1{
	public static void main(String[]args){
		int largest;
		int smallest;
		System.out.print("Enter the first integer: ");
		Scanner obj = new Scanner(System.in);
		int num1 =  obj.nextInt();

		System.out.print("Enter the second integer: ");
		Scanner obj2 = new Scanner(System.in);
		int num2 =  obj2.nextInt();

		System.out.print("Enter the third integer: ");
		Scanner obj3 = new Scanner(System.in);
		int num3 =  obj3.nextInt();


		System.out.println("User entered numbers are : " +num1 + " " + num2 + " "+ num3);
		
		if (num1 > num2){
			if (num1>num3) {
				largest = num1;
			}
			else{
				largest = num3;
			}
		}
		else{
			if (num2 > num3){
				largest = num2;
			}
			else{
				largest = num3;
			}
		}
		System.out.println("The largest number is: "+ largest);

		
		if (num1 < num2){
			if (num1<num3) {
				smallest= num1;
			}
			else{
				smallest= num3;
			}
		}
		else{
			if (num2 < num3){
				smallest= num2;
			}
			else{
				smallest= num3;
			}
		}	

		System.out.println("The largest number is: "+ smallest);
	}
}