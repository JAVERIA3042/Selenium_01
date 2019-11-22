package variable_Type;

class instance_Variable {
	//instance variable [object created ---> object is destroyed]
	int a =10;
	int b = 20;
	 
	 // Static methods
	public static void main(String[] args) {// main method...........   //JVM only response to main methods
		// static area
		instance_Variable t = new instance_Variable();
		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();
	}
	
	
	//instance methods
	void m1() {
	// instance area
	System.out.println(a);
	System.out.println(b);
		
	}

}
