package Ren01;

public class Test01 {

	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object c = null;
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));//覚える
		System.out.println(a.equals(a));
		
		String x = "Hello";
		String y = "Hello";
		Integer z = 2;
		Integer w = 2;
		Object p ="Hello";
		Object k = 2;
		
		System.out.println(x == y);
		System.out.println(z == w);
		System.out.println(x == p);
		System.out.println(z == k);
		System.out.println(x.equals(y));
		
		
		
	}

}
