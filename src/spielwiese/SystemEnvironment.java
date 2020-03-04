package spielwiese;

public class SystemEnvironment {

	public static void
			main(String[] args) {

		System.out.println(System.getenv().get("JAVA_HOME"));// + File.separator + "conf" + File.separator + "solideConfig.xml");
		System.out.println(System.getenv().get("CATALINA_HOME"));// + File.separator + "conf" + File.separator + "solideConfig.xml");
	}

}
