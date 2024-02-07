package java8_features;

interface FunctionInterfaceNoArgument {
	public String greeting();
}

interface FunctionInterfaceOneArgument {
	public int add(int i);
}


public class FunctionnalExpression {
	public static void main(String[] args) {
		
		FunctionInterfaceNoArgument F0 = () -> { return "Hallo Ahmed"; };
		System.out.println(F0.greeting());
		

		FunctionInterfaceOneArgument F1 = (number) -> number + 5;
		System.out.println(F1.add(8)); //Result must be 13
	}
}
