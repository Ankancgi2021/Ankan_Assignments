
public class Singleton {

	public static void main(String[] args) {
Abc obj1=Abc.getInstance();
System.out.println("Instance is created");
	}

}
class Abc
{
	static Abc obj= new Abc();
	private Abc()
	{
		
	} 	
		public static Abc getInstance()
		{
			return obj;
		}
}
