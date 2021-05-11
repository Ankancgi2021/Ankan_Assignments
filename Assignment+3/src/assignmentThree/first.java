package assignmentThree;

import java.util.TreeSet;

public class first {

	public static void main(String[] args) {
		TreeSet<Person> tree_set= new TreeSet<>();
		tree_set.add(new Person(120,45,"Raj"));
		tree_set.add(new Person(130,45,"Raja"));
		tree_set.add(new Person(140,65,"Nawaj"));
		tree_set.add(new Person(150,35,"Hari"));
		tree_set.add(new Person(160,64,"Ankan"));
		for(Person element: tree_set)
			System.out.println(element);
		

	}

}
