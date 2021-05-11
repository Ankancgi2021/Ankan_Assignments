class BankAccount 
{

public void display()
{
System.out.println("Total cash in acc : ");
}
}
class Current extends BankAccount
{
double fd;
double amount;
Current(double amount,double fd)
{
	this.amount=amount;
	this.fd=fd;
}
public void display()
{
double cash=amount+fd;
System.out.println("Total cash in current acc : "+cash);
}
}
class Saving extends BankAccount
{
double cc;
double amount;
Saving(double amount,double cc)
{
	this.amount=amount;
	this.cc=cc;
}
public void display()
{
double cash=amount+cc;
System.out.println("Total cash in saving acc : "+cash);
}
}