package Methods_Type;

class Example5 {
	void m1() {
		System.out.println("m1 methods");
		m2(); // instance methods calling
	}
	
	void m2() {
		System.out.println("m2 methods");
		m3(10); //instance methods calling
	}
	
	void m3(int a) {
		System.out.println("m3 methods");
	}
	public static void main(String[] args) {
		Example5 t = new Example5();
		t.m1();
		

	}

}
