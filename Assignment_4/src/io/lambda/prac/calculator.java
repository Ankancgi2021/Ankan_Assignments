package io.lambda.prac;

public class calculator {

	public static void main(String[] args) {
	calculate cc = (a,b)-> a+b;
	System.out.println(cc.add(100, 20));
	subtract cc1 = (a,b)-> a-b;
	System.out.println(cc1.sub(100, 20));
	multiply cc2=(a,b)-> a*b;
	System.out.println(cc2.mul(25,10));
	division cc3=(a,b)-> a/b;
	System.out.println(cc3.div(20,10));
	}
	

}
interface subtract
{
	int sub(int x,int y);
}
interface multiply
{
	int mul(int x,int y);
}
interface division
{
	int div(int z,int m);
}