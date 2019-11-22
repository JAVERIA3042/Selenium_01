package variable_Type;

class Static_variable {
	
	// static variable
	static int a =10;
	static int b=20;
	
	
	//instance method
	 void m1() {
		//instance area
		System.out.println(Static_variable.a);
		System.out.println(Static_variable.b);
	}
	
	
	//static methods
	public static void main(String[] args) {//main methods
		//static area
		System.out.println(Static_variable.a);
		System.out.println(Static_variable.b);
		 Static_variable t = new Static_variable();
		 t.m1();
	}

}
