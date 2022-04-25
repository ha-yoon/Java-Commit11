package inheritance;

 class Suv { 
	
	private String color;
	int speed = 100;
	
	public void run() {
		System.out.println("SUV 차량이 달립니다.");
	}
	
}

class Santafe extends Suv {
	
	public void run() { 
		System.out.println("SUV 차량이 달립니다.");

}


public static class Ex03 {

	public static void main(String[] args) {
		
		Santafe santafe = new Santafe();
		santafe.run();

	}

}

}
