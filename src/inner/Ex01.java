package inner;



class Outer1 {
	
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	class Inner1 {
		
		private int y = 300;
	
		
		public void disp() {
			System.out.println("Outer x: " + x);
			System.out.println("Inner y: " + y);
			System.out.println("Outer y: " + Outer1.y);
			outerMethod1();
			outerMethod2();
	}
		
	}
}


public class Ex01 {

	public static void main(String[] args) {
	
		Outer1 outer = new Outer1();
		// 우선 Outer1 클래스 객체를 생성한다. 
		
		Outer1.Inner1 inner = outer.new Inner1();
		// 생성된 객체로 Inner1 클래스 객체를 생성한다. 
		
		inner.disp();
	}

}
