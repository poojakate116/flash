package com.cg.demo.method;

public class App {

	public static void main(String[] args) {

		int num = 10;
// from user input create here scanner obj
		// Class object = new Constructor();
		Employee obj = new Employee();
		obj.id = 101;//sc.next
		obj.name = "Abc";
		obj.salary = 10.5;
		System.out.println(obj.toString());

		Employee obj2 = new Employee();
		obj2.id = 102;
		obj2.name = "Bbc";
		obj2.salary = 15.25;
		System.out.println(obj2.toString());

		Employee obj3 = new Employee();
		obj3.id = 103;
		obj3.name = "Cbc";
		obj3.salary = 20.75;
		System.out.println(obj3.toString());

		Employee obj4 = new Employee(104, "Ddd", 45.85);
		System.out.println(obj4.toString());

	}
}