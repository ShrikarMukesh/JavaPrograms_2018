package com.lambdaexpressionsExmp;

public class TypeInferenceExample {
	public static void main(String[] args) {
		StringLengthLambda lambda = (s) ->s.length();
		System.out.println(lambda.getLength("lambda"));
		
		//second way
		printlambda(s ->s.length());
	}
	
	private static void printlambda(StringLengthLambda l) {
	   	System.out.println(l.getLength("mukesh"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
