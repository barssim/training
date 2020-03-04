package spielwiese;

public class GaussRechner {

	// summe all nummber betwenn 0 and end
	public int
			summeUntil(int end) {
		int summe = 0;
		for (int i = 0; i <= end; i++) {
			summe = summe + i;
		}
		return summe;
	}
	
	public static void
			main(String[] args) {
		 GaussRechner g = new GaussRechner();
		 g.summeUntil(100);
	}
}
