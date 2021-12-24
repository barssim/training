package javaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		values.add(3);
		values.add(-1);
		values.add(2);
		values.add(4);
		values.add(-9);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(-1);
		Predicate<Integer> isPositive = e -> e > 0;

		Map<Boolean, List<Integer>> groups = values.stream().collect(Collectors.partitioningBy(isPositive));

		System.out.println(groups.get(true));
		System.out.println(groups.get(false));

		List<List<Integer>> subSets = new ArrayList<>(groups.values());
		System.out.println(subSets);
	}
}