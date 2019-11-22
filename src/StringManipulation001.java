
public class StringManipulation001 {

	public static void main(String[] args) {
		String s1 = "abc";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));
		
		
		String s3 = "abc";
		String s4 = new String("abc");
		s4.intern();
		System.out.println(s3 ==s4);
	}

}
