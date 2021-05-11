
public class Manager extends Employee 
{
	int total;
	int incentive =2000;
	
	public Manager(int amount)
	{
		super(amount);
	}
	
	public void salary()
	{
		total=amount+incentive;
		
		System.out.println("The salary of manager is: " +total);
	}
}
