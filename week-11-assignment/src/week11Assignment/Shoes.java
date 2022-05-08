package week11Assignment;

import java.util.LinkedList;
import java.util.List;

public class Shoes {

	private String name;
	/*
	 * List of shoe types created to be used with this assignment's concepts.
	 */
	// @formatter:off
			private static final List<Shoes> Shoes = List.of(
					new Shoes("Runners"),
					new Shoes("Trainers"),
					new Shoes("Sneakers"),
					new Shoes("Cycling"));
	// @formatter:on

	// Getter and constructor.

	public Shoes(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Method to return understandable types of objects.

	@Override
	public String toString() {
		return name + " shoes";
	}

	// Method for list retrieval by other classes.
	
	public static List<Shoes> getShoes() {
		return new LinkedList<>(Shoes);
	}

	// Compare method for sorting operations.
	
	public int compare(Shoes that) {
		return this.name.compareTo(that.name);
	}
}
