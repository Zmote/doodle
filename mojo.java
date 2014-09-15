package doodle;

public class mojo {
	public static void main(String[] args) {
		int a = 10;
		int b = 28;
		mojo x = new mojo();
		//int n = x.multiply(a,b);
		System.out.println(x.multiply(a,b));
	
	}
	
	public int multiply(int a, int b){
		int n;
		n = a * b;
		return n;
	}
}
