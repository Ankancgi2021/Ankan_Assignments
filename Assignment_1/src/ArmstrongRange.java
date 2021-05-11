
public class ArmstrongRange {

	public static void main(String[] args) {
		int num, start=100, end=999, i, rem, temp, counter=0;
		
		for(i=start; i<=end; i++)
		{
		   temp = i;
		   num = 0;
		   while(temp != 0)
		   {
			rem = temp%10;
			num = num + (rem*rem*rem);
			temp = temp/10;
		   }
		   if(i == num)
		   {
			if(counter == 0)
			{
			   System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
			}
			   System.out.print(i + "  ");
			   counter++;
		   }
		}
		// if no Armstrong number is found
		if(counter == 0)
		{
		   System.out.print("There is no Armstrong number Between "+start+" and "+end);
		}
	    }

	}


