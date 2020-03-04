package spielwiese;

public class PrimitivDatenTypes {
	
	static String x = "";
	
	static void executeAction(int ... var) {x += "a";}
	static void executeAction(Integer var) {x += "b";}
	static void executeAction(long var) {x += "c";}
	static void executeAction(float var) {x += "d";}
	static void executeAction(double var) {x += "e";}
	static void executeAction(Object var) {x += "f";}
	static void executeAction(short var) {x += "g";}

	public static void main(String[] args) {
		executeAction(1);
		executeAction(1.0);
		executeAction(Double.valueOf("5"));
		executeAction(1L);
		executeAction(1f);
		System.out.println(x);
	}
}
