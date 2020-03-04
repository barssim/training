package spielwiese;

class StaticVariableDemo {
	static int	countStatic		= 0;
	int			countNotStatic	= 0;

	public void
			incrementStatic() {
		countStatic++;
	}

	public void
			incrementNotStatic() {
		countNotStatic++;
	}

	public static void
			main(String args[]) {
		StaticVariableDemo obj1 = new StaticVariableDemo();
		StaticVariableDemo obj2 = new StaticVariableDemo();
		obj1.incrementStatic();
		obj2.incrementStatic();

		obj1.incrementNotStatic();
		obj2.incrementNotStatic();

		System.out.println("Obj1: count is=" + obj1.countStatic);
		System.out.println("Obj2: count is=" + obj2.countStatic);

		System.out.println("Obj1: count is=" + obj1.countNotStatic);
		System.out.println("Obj2: count is=" + obj2.countNotStatic);
	}
}