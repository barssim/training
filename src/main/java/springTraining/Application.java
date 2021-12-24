package springTraining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		try(final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("springTraining"))
		{
			final MathService mathService = ctx.getBean(MathService.class);
			System.out.println(mathService.sum(40, 2));
			System.out.println(mathService.diff(80, 3));
		}
	}

}
