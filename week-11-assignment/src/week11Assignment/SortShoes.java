package week11Assignment;

import java.util.List;
import java.util.Scanner;

public class SortShoes {
	public Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new SortShoes().run();
	}
// Run method for selection of which sorting option user wants. 
 
	private void run() {
		System.out.println(
				"Enter option: \n1 for sorting with Lamda" 
		+ "\nOr any other input for sorting with Method Reference");
		String search = scanner.nextLine();
		List<Shoes> shoes;
		String name;

		System.out.println("Original List: " + Shoes.getShoes()); //Prints what the original list is.

		/*
		 * User enters 1 then Lambda sorting is used.
		 * if any other entry is entered, Method Reference will
		 * be used.
		 */
		if (search.equals("1")) {
			shoes = sortWithLambda();
			name = "Lambda Sort: ";
		} else {
			shoes = (List<Shoes>) sortWithMethodReference();
			name = "Method Reference Sort: ";
		}

		System.out.println(name + shoes); // List is printed to console of the sorting results.
	}

	// Method for Method Reference Sorting.
	
	private Object sortWithMethodReference() {
		List<Shoes> shoes = Shoes.getShoes();

		shoes.sort(Shoes::compare);

		return shoes;
	}

	// Method for Lambda Sorting.
	
	private List<Shoes> sortWithLambda() {
		List<Shoes> shoes = Shoes.getShoes();

		shoes.sort((p1, p2) -> p1.compare(p2));

		return shoes;
	}

}
