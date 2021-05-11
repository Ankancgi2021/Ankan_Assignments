
public class Armstrong {

	public static void main(String[] args) {
		int c=0,n=153,r,temp;
		temp=n;
		while(n>0)
		{
		r=n%10;
		n=n/10;
		c=c+(r*r*r);
		}
		if(temp==c)
		{
			System.out.print("Armstrong Number");
		}
		else
		{System.out.print(" Not Armstrong Number");}
	}

}
