package com.eficid.test.resinio;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("##############################");
		System.out.println("Application begin now!");
		System.out.println("");
		
		for (;;) {
			System.out.print(".");
			Thread.currentThread().sleep(1000);
		}
	}

}
