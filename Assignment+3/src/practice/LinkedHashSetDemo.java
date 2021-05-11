package practice;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet();
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("D");
		lh.add("E");
		lh.add("F");
		lh.remove("C");
		 Iterator<String> itr =lh.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
	}

}
