package com.cg.demo.exceptionhandling;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s) {// parametarized constructor
		System.out.println(s);
		// TODO Auto-generated constructor stub
	}
}

public class test {

	public static void main(String[] args) {
		try {
			vote(34);
			
		}
		catch(Exception e){
			System.out.println(e);
			}
		}
	public static void vote(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("not eligible for vote");// user defined exception
			}
		else {
			System.out.println("eligible for vote");
		}
	}
}
