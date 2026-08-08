package javaBro;
import java.util.Random;
import java.util.Scanner;
public class JavaProject1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random= new Random();
		
		int balance = 1000;
		System.out.println("Balance "+balance);
		System.out.print("Enter a bet: $");
		int bet = scanner.nextInt();
			
		
		System.out.println("1.Roll Over\n"
				          +"2.Roll Under");
		int choice = scanner.nextInt();
		
		int target;
		double result;
		
	  System.out.println("Enter target(1-99): ");
	  target = scanner.nextInt();			
	  System.out.println("Rolling...");
	  
	  result=random.nextDouble()*100;
		switch(choice) {
		case  1:
			if(target>result) {
				System.out.println("YOU WIN!");
			}
		case 2:
			if(target<result) {
				System.out.println("YOU LOOSE!");
			}
		}
		
		int add;
		if(target>result) {
			add=balance+bet;
		}else {
			add=balance-bet;
		}
		System.out.println("New balance: $"+add);
     	
		scanner.close();
	}
}