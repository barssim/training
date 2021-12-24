package javaPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MultipleConditions {

	public static void main(String[] args) {

//		MultipleConditions multiple = new MultipleConditions();

		List<Country> countries = Arrays.asList(new Country("Iran", 80840713),
				new Country("Hungary", 9845000), new Country("Poland", 38485000),
				new Country("India", 1342512000), new Country("Latvia", 1978000),
				new Country("Vietnam", 95261000), new Country("Sweden", 9967000),
				new Country("Iceland", 337600), new Country("Israel", 8622000));

		Predicate<Country> p1 = c -> c.name.startsWith("I") && c.population > 10000000;

		countries.stream().filter(p1).forEach(e->System.out.println(e.name +":"+e.population) );
	}
}
	class Country {
		public String name;
		public Integer population;

		Country(String name, Integer i) {
			this.name = name;
			this.population = i;
		}

	}

