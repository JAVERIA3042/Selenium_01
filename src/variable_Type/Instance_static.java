package variable_Type;
 class Instance_static {
	 
	 int a =10;
	 static int b =20;

	public static void main(String[] args) {
		Instance_static t = new Instance_static();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a = 2000;
		t.b = 3000;
		System.out.println(t.a);
		System.out.println(t.b);
		
		Instance_static t1 = new Instance_static();
		System.out.println(t1.a);
		System.out.println(t1.b);
		t1.b = 777;
		
		Instance_static t2 = new Instance_static();
		System.out.println(t2.a);
		System.out.println(t2.b);
		
	}

}
