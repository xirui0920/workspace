package biji.javatexing;
/*
 *  1）调用super()必须写在子类构造方法的第一行，否则编译不通过。每个子类构造方法的第一条语句，都是隐含地调用super()，
 *    如果父类没有这种形式的构造函数，那么在编译的时候就会报错。
	2）super()和this()类似,区别是，super从子类中调用父类的构造方法，this()在同一类内调用其它方法。
	3）super()和this()均需放在构造方法内第一行。
	4）尽管可以用this调用一个构造器，但却不能调用两个。
	5）this和super不能同时出现在一个构造函数里面，因为this必然会调用其它的构造函数，其它的构造函数必然也会有super语句的存在，所以在同一个构造函数里面有相同的语句，就失去了语句的意义，编译器也不会通过。
	6）this()和super()都指的是对象，所以，均不可以在static环境中使用。包括：static变量,static方法，static语句块。
	7）从本质上讲，this是一个指向本对象的指针, 然而super是一个Java关键字。

 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	//super()和this()均需放在构造方法内第一行。
	public Person(int age){
		age = 0;
		this(" ",1);
	}

}
