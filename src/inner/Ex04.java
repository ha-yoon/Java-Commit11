package inner;



class LocalEx {
	
	public void method() {
		
		class LocalInner {
			
			int x = 100;
		
			
			void disp() {
				System.out.println("methodInner x: " + x);
			}
			
		}
		
		LocalInner inner = new LocalInner();
		inner.disp();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		LocalEx ex = new LocalEx();
		ex.method();
		
	}

}
