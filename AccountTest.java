import java.utilScanner;

public class AccountTest{
	public static void main(String[]args){}
		Account account1 = new Account("Jane green");
		Account account2 = new Account("John blue");
     }

	System.out.printf("%s balance: $%.2f%n,account1.getName(),account1.getBalance()");
	System.out.printf("%s balance: $%.2f%n,account2.getName(),account2.getBalance()");

	Scanner input = new Scanner(System.in);
	System.out.print("Enter deposit amount");

	double depositAmount = input.nextDouble();
	System.out.printf("%nadding %.2f to account")