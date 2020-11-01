package json;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonNodeExample {

	public static void
			main(String[] args) throws Exception,
					IOException {

		String json = "{\"MetaaRequest\" : \"GetStatus\" ,\n" +
				"\"SRAdresses\":[\n" +
				"\"TCH-31-84-00000145\",\n" +
				"\"TCH-31-84-00000146\",\n" +
				"\"TCH-31-84-00000148\"\n" +
				"]\n" +
				"\n" +
				"}";

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode jsonNode = objectMapper.readTree(json);
		System.out.println(jsonNode.get("MetaaRequest").asText());
	}

}
