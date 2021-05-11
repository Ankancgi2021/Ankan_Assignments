import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		int amt,tax;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount: ");
		amt=sc.nextInt();
			
		if(amt>=0 && amt<=180000)
		{
			tax=0;
			System.out.println("No tax to pay");
		}
		else if(amt>180000 && amt<=300000)
		{
			tax=(amt*10)/100;
			System.out.println("tax to pay :" +tax);
		}
		else if(amt>300000 && amt<=500000)
		{
			tax=(amt*20)/100;
			System.out.println("tax to pay :" +tax);
		}
		else if(amt>500000 && amt<=1000000)
		{
			tax=(amt*30)/100;
			System.out.println("tax to pay :" +tax);
		}
		}
	}


