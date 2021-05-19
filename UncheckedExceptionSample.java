package Finally;



public class UncheckedExceptionSample {
	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		if(b != 0) {
			System.out.println(a / b);
		}
		UncheckedExceptionSample ues = new UncheckedExceptionSample();
		ues.test(null);
		System.out.println("after exception");
	}
	public void test(String name) {
		try{
			System.out.println(name.toUpperCase());
		
		}finally {
			System.out.println("Always Executed");
		}
	}
}
