package Methods_Type;
class X {	}
class Emp{}
class Y {}
class Student{}
class RealTimeExample3 {

	void m1(X x, Emp e) {
		System.out.println(" m1 Methods");
	}
	
	static void m2(Y y, Student s) {
		System.out.println(" m2 Methods");
	}
	public static void main(String[] args) {
		RealTimeExample3  t = new RealTimeExample3();
		X x = new X();
		Emp e1 = new Emp();
		t.m1(x, e1);
		t.m1(new X(), new Emp()); // Use only in real time project level
		
		
		Y y = new Y();
		Student s = new Student();
		RealTimeExample3.m2(y, s);
		RealTimeExample3.m2(new Y(), new Student()); // Use only in real time Project
	}

}
