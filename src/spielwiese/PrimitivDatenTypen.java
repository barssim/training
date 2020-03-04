package spielwiese;

public class PrimitivDatenTypen {

	static String x;
	
	private void execute(int var) { x = "i"; }
	private void execute(float var) { x = "f"; }
	private void execute(long var) { x = "l"; }
	private void execute(short var) { x = "s"; }
	private void execute(Object obj) { x = "o"; }
	private void execute(double obj) { x = "d"; }
	
	
	public static void main(String[] args) {
		PrimitivDatenTypen p = new PrimitivDatenTypen();
		p.execute(1);
		System.out.println("Wert of x ist: " + x);
		
		p.execute(1.0);
		System.out.println("Wert of x ist: " + x);
		
		p.execute(Double.valueOf(5));
		System.out.println("Wert of x ist: " + x);
		
		p.execute(2.5f);
		System.out.println("Wert of x ist: " + x);

		p.execute(1l);
		System.out.println("Wert of x ist: " + x);

		p.execute(1);
		System.out.println("Wert of x ist: " + x);
	}

}
