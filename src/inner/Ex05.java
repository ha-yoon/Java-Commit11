package inner;

class Outer5 {
	
	public void aaa( ) {
		System.out.println("aaa");
	}
	
	public void bbb() {
		System.out.println("bbbbb");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
}


public class Ex05 {

	public static void main(String[] args) {
		
		Outer5 outer = new Outer5() {
			
			public void bbb() {
				System.out.println("bbbbb");
			}
		
		}; 
		
		outer.aaa();
		outer.bbb();
		outer.ccc();
		
	}

}
