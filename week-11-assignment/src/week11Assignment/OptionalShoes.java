package week11Assignment;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalShoes {
	public static void main(String[] args) {
		new OptionalShoes().run();

	}

	/*
	 * Optional Method for handling input values of non-null nature 
	 * where the handling of a null can break a program if not prepared properly.
	 * Instead a value is checked to see if missing.
	 */
	private void run() {
		Optional<Shoes> value = Optional.of(new Shoes("Hiking"));
		Shoes shoes = shoesMethod(value);
		System.out.println("I want " + shoes + ".");
		
		try {
		 Optional<Shoes> empty = Optional.empty();
		 shoesMethod(empty);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		
		}
	}
	
	private Shoes shoesMethod(Optional<Shoes> shoesOptional) {
		
	return shoesOptional.orElseThrow(() 
	-> new NoSuchElementException("The shoes do not exist."));
	
	}
}
