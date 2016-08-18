package biji.javatexing;

public class Student extends Person{
	private int age;
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.age = age;
	}
	
	
	
	//这里报错 因为子类构造函数第一句会隐式调用super（） 如果父类没有这种构造函数就会报错
	public Student(String name){
		
	}
	
}
