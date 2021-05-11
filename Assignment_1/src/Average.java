import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h,i,x1,y1,x2,y2,x3,y3,z1,z2,z3,t1,t2,t3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student1 subject1 marks:");
		a=sc.nextInt();
		System.out.println("Enter the student1 subject2 marks:");
		b=sc.nextInt();
		System.out.println("Enter the student1 subject3 marks:");
		c=sc.nextInt();
		System.out.println("Enter the student2 subject1 marks:");
		d=sc.nextInt();
		System.out.println("Enter the student2 subject2 marks:");
		e=sc.nextInt();
		System.out.println("Enter the student2 subject3 marks:");
		f=sc.nextInt();
		System.out.println("Enter the student3 subject1 marks:");
		g=sc.nextInt();
		System.out.println("Enter the student3 subject2 marks:");
		h=sc.nextInt();
		System.out.println("Enter the student3 subject3 marks:");
		i=sc.nextInt();
		x1=a+b+c;
		y1=x1/3;
		x2=d+e+f;
		y2=x2/3;
		x3=g+h+i;
		y3=x3/3;
		t1=a+d+g;
		t2=b+e+h;
		t3=c+f+i;
		z1=t1/3;
		z2=t2/3;
		z3=t3/3;
		System.out.println("the student1 marks are"+x1+"and average marks are"+y1);
		System.out.println("the student2 marks are"+x2+"and average marks are"+y2);
		System.out.println("the student3 marks are"+x3+"and average marks are"+y3);
		System.out.println("the total off all students in each subject are subject1 " +t1+ " subject2 " +t2+ " subject3 " +t3+ " and avg in each are subject1 " +z1+ " subject2 " +z2+ " subhect3 " +z3);
	}

}
