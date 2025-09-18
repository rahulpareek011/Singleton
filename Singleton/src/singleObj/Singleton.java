package singleObj;

public class Singleton {
	int id = 100;
	
	private static Singleton a = null;
	
	private Singleton() {}
	
	public static Singleton single() {
		if (a == null) {
			a = new Singleton();
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		Singleton a = single();
		System.out.println(a.id);
	}
}
