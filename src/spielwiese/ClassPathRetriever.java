package spielwiese;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPathRetriever {

	private void
			retrievClassPath(String fileName) throws Exception {
		Path path = Paths.get(ClassLoader.getSystemResource(fileName).toURI()).resolve("DateTime.java");
		System.out.println("Path is: " + path.toString());
	}

	public static void
			main(String[] args) {
		ClassPathRetriever classPathRetriever = new ClassPathRetriever();
		try {
			classPathRetriever.retrievClassPath("spielwiese/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
