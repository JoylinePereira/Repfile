package demo1;

public class K {
	static int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main:"+x);
		test();
		System.out.println("main end:"+x);
	}
static void test()
{
	x=20;
}
}
