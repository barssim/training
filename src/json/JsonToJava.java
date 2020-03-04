package json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import json.modele.CarFleet;

public class JsonToJava {

	public static void
			main(String args[]) {

		ObjectMapper mapper = new ObjectMapper();

		/**
		 * Read object from file
		 */
		CarFleet value = null;
		try {
			value = mapper.readValue(new File("result.json"), CarFleet.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(value);

	}

}
