package week11Assignment;

import java.util.stream.Collectors;

public class StreamShoes {

	public static void main(String[] args) {
		new StreamShoes().run();
	}

	
	 // Run Method for streaming the list sorted and the type amended to each item.
	 
	private void run() {
		String names = Shoes.getShoes()
		//@formatter:off
			.stream() 				
			.map(c -> c.toString()) 
			.sorted() 				
			.collect(Collectors.joining(", \n")); 
		//@formatter:on
		
		System.out.println("Stream:\n" + names); // Stream list printed to console.
	}

}
