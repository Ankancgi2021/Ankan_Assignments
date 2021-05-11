package io.prac;

public class Orders {

	public static void main(String[] args) {
			ods o=a-> a>10000 ;
			if(o.val(1000))
			{
				System.out.println("Accepted ot Completed");
			}
			else
			{
				System.out.println("Rejected");
			}
	}

}
interface ods
{
	 boolean val(int x);
}
