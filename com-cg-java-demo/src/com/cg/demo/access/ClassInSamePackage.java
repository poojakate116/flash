package com.cg.demo.access;

import com.cg.demo.method.DemoClass;

public class ClassInSamePackage {
	public static void main(String[] args) {
		DemoClass obj =new DemoClass();
		System.out.println(obj.publicField);
		System.out.println(obj.protectedeField);
		System.out.println(obj.packageField);
		System.out.println(obj.privateField);


}
