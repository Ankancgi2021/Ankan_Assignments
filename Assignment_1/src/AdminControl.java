import java.util.Scanner;
public class AdminControl 
{

	    public static void main(String args[])
	    {
	    	String username, password;
	        int attempt = 0;
	        while(attempt<3)
	        {
	        Scanner sc = new Scanner(System.in);
				System.out.print("Enter username:");//username:user
				username = sc.nextLine();
				System.out.print("Enter password:");//password:abcd
				password = sc.nextLine();
	        
	        if(username.equals("user") && password.equals("abcd"))
	        	
	        {
	            System.out.println("Welcome");  
	        }
	        else {
                System.out.println("Woops : Try again");
                attempt++;  
                } 
	        }
	      if(attempt==3)
	      {
	    	  System.out.println("Contact admin");
	      }
	        }
	    }
	     
	     	   
