package spielwiese;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambda {
	public static void main(String[] args) {
		
	List<String> list = new ArrayList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	
	//lambda
	//Output : A,B,C,D,E
	list.forEach(item->System.out.println(item));
	
	//Stream and filter
			//Output : B
			list.stream()
				.filter(s->s.contains("B"))
				.forEach(System.out::println);
	
	Map<String, Integer> map = new HashMap<>();
	map.put("A", 10);
	map.put("B", 20);
	map.put("C", 30);
	map.put("D", 40);
	map.put("E", 50);
	map.put("F", 60);
	
	map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
	
	map.forEach((k,v)->{
		System.out.println("Item : " + k + " Count : " + v);
		if("E".equals(k)){
			System.out.println("Hello E");
		}
	});

//	map.forEach(System.out::println);
	
	
	}
}
