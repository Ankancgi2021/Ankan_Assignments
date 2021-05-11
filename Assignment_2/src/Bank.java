
class Bank{
	public static void main(String[] args) {
		BankAccount a=new BankAccount();
		a.display();
		Current c1=new Current(100,150);
		c1.display();
		Saving s1=new Saving(1000,150);
		s1.display();
		System.out.println(s1.cc);
		
	}
}