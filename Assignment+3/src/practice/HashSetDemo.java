package practice;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> days = new HashSet();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thrusday");
		days.add("Friday");
		days.remove("Friday");
		days.add("Thrusday");
		
		//iterate in Hashset
		days.forEach(System.out::println);
		//printing Hashset
		System.out.println(days);
		
	}

}
