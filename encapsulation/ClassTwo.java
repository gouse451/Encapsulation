package encapsulation;

public class ClassTwo {
	public static void main(String[] args) {
		ClassOne obj = new ClassOne();
		obj.setAge(22);
		obj.setName("ShaikGouse");
		
		System.out.println("My Name is " + obj.getName());
		System.out.println("My Age is " + obj.getAge());
	}

}
