
public class Labour extends Employee 
{
	
	int bonus;
	
	public Labour(int amount,int bonus)
	{
		super(amount);
		this.bonus=bonus;

	}

	
	
	public void salary()
	{
	
		
		System.out.println("The salary of a labour is: " +(amount+bonus));
	}
}
