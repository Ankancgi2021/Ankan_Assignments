import java.util.Scanner;
import java.lang.Math;

public class Interest {
	public static void main(String[] args) {
		double SI,CI,amt,rate;
		int time;
		int n=12;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter amount: ");
				amt=sc.nextDouble();
			System.out.println("Enter rate: ");
				rate=sc.nextDouble();
			System.out.println("Enter time: ");
				time=sc.nextInt();
		}
			SI=(amt*rate*time)/100;
	CI=amt*(Math.pow((rate),n));
	System.out.println("Simple int:" +SI);
	System.out.println("Compound int :" +CI);
	}

}
