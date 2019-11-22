package Methods_Type;

	class Example2 {
	void m1(int a, char b) { // local variable
		System.out.println("m1 methods is here");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	static void m2(String str, double d) { 
		System.out.println("m2 methods is here");
		System.out.println(str);
		System.out.println(d);
	}
	public static void main(String[] args) {
		Example2 t = new Example2();
		t.m1(10, 'y');
		Example2.m2("javeria", 10.5);
	}

}
