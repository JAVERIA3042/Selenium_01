package Methods_Type;

 class Test1 {
	 
	 void m1() { // instance methods
		 System.out.println("Hello m1 methods");	// methods implementation 
	 }
	 
	 static void m2() { // statics methods
		 System.out.println("Hello m2 methods"); // methods implementation
	 }

	public static void main(String[] args) {
		
		// call the methods
		Test1 t = new Test1();
		t.m1();
		Test1.m2();
	}

}
