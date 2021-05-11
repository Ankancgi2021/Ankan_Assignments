import java.util.Scanner;
public class Marksheet {

	public static void main(String[] args) {
		int marks_1,marks_2,marks_3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first marks: ");
		marks_1=sc.nextInt();
		System.out.println("Enter the second marks: ");
		marks_2=sc.nextInt();
		System.out.println("Enter the third marks: ");
		marks_3=sc.nextInt();
		
		if(marks_1>60 && marks_2>60 && marks_3 >60)
		{
			System.out.println("Passed");
		}
		else if((marks_1>60 && marks_2>60)||(marks_2>60 && marks_3>60)||(marks_1>60 && marks_3>60))
		{
			System.out.println("Promoted");
		}
		else if((marks_1<60 && marks_2<60)||(marks_2<60 && marks_3<60)||(marks_1<60 && marks_3<60))
		{
			System.out.println("Failed");
		}
		}

}
