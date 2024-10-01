package java11_features;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class StringMethods {

	@Test
	public void test()
	{
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		List<String> lines = multilineString.lines().filter(line -> !line.isBlank()).map(String::strip)
				.collect(Collectors.toList());
		assertThat(lines).contains("Baeldung helps", "developers", "explore Java.");

	}
}
