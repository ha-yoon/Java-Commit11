package inheritance;

class Parent { 

	int parentField;
	
	public Parent() {
		System.out.println("부모 생성자 입니다.");
	}
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드 입니다.");
	}
}


class Child extends Parent { 
	
	int childField;
	
	public Child() {
		super(); 
		
		System.out.println("자식 생성자 입니다.");
	}
	
	public void childMethod() {
		System.out.println("자식클래스 메소드 입니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		Child child = new Child(); 
		
		child.childField = 20; 
		System.out.println(child.childField);
		
		child.parentField = 50; 
		System.out.println(child.parentField);
		
		child.childMethod(); 
		child.parentMethod(); 

	}

}
