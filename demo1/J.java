package demo1;

public class J {
	static int i=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=40;
		System.out.println(J.i);
		System.out.println(i);
		J.i=200;
		i=300;
		
		System.out.println(J.i);
		System.out.println(i);
	}

}
