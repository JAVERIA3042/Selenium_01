package variable_Type;
class Assignment {
	// Instance variable
	int a = 10;
	int b = 20;
	
	//static Variable
	static int c = 30;
	static int d = 40;
	
	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Assignment.c);
		System.out.println(Assignment.d);
	}
	
	static void m2() {
		Assignment t = new Assignment();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Assignment.c);
		System.out.println(Assignment.d);
		
	}

	public static void main(String[] args) {
		Assignment t = new Assignment();
		t.m1();
		Assignment.m2();
	}


}