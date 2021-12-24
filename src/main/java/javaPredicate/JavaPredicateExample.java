package javaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JavaPredicateExample {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(1);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(12);

		Predicate<Integer> btf = n -> n > 5;

		nums.stream().filter(btf).forEach(System.out::println);
	}
}
