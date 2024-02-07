package java8_features;

import java.util.Arrays;

public class Stream {
	public static void main(String[] args) {
		int numbers[] = { 23, 34, 78, 94, 73, 9, 55 };
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(n -> System.out.println(n));
	}
}
