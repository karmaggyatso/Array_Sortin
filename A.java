
public class A {
	int age;
	String name;
	
	public A() {
		this(0,"not defined");
	}

	public A(int newAge, String newName) {
		set(newAge,newName);
	}
	
	public void set(int newAge, String newName) {
		age = newAge;
		name = newName;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public void print() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}
