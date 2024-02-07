package java8_features;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String s1 = "test";
		String s2 = null;
		Optional<String> s = Optional.of("Testing");
		System.out.println(s);
		System.out.println(s.get());
		System.out.println(Optional.empty());
		
		System.out.println(Optional.ofNullable(s1));
		System.out.println(Optional.ofNullable(s2));
				
	}

}
