package com.cg.demo.exceptionhandling;

public class userdefexc {
	public static void main(String[] args) {
		int i = 90;
		try {
			if (i < 10) {
				throw new myexception("invalid no");
			}
			else {
				System.out.println("valid no");
			}

		}

		catch (myexception e) {
			System.out.println(e);
		}
	}

}

class myexception extends Exception {
	public myexception(String s) {
		System.out.println(s);
	}
}