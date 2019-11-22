package variable_Type;

class Ways_Static {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println(a); //1St way
			
		System.out.println(Ways_Static.a); // 2nd way
		
		Ways_Static t = new Ways_Static(); // 3rd Way
		System.out.println(t.a);
		
	}

}
