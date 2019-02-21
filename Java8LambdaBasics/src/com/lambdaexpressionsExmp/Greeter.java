package com.lambdaexpressionsExmp;
interface Mylambda{
	void foo();
}
public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();	
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);

		//Inner class
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Inner Class Grreting");
			}
		};
		innerClassGreeting.perform();

		//Interface implementation
		Greeting helloWorldGreeting1 = new HelloWorldGreeting();
		helloWorldGreeting1.perform();

		//lambda implementation
		Greeting lambdagreeting =() -> System.out.println("lambda shrikar");
		lambdagreeting.perform();
		
		greeter.greet(lambdagreeting);
	}
}
