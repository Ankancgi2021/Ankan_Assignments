package io.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ladt {

	public static void main(String[] args) {
		
		  new Thread(() -> { // Lambda Expression
		         for(int i=1; i <= 5; i++) {
		            System.out.println("Child Thread: "+ i);
		            try {
		               Thread.sleep(500);
		            } catch(Exception e) {
		               e.printStackTrace();
		            }
		         }
		      }).start();
		      // Main Thead
		      for(int j=1; j < 5; j++) {
		         System.out.println("Main Thread: "+ j);
		         try {
		            Thread.sleep(500);
		         } catch(Exception e) {
		            e.printStackTrace();
		         }
		      }
		List<Integer> values= Arrays.asList(4,5,6,7,10);
		Consumer<Integer> c = i -> System.out.println(i);
		  
		values.forEach(c);

}
}