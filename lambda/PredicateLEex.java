package com.corejava.lambdaexpression.functionalinterfaceQ3;

import java.util.function.Predicate;

public class PredicateLEex {

	public static void main(String[] args) {
	Predicate <Integer>p1=i->{
		if(i>10) {
			return true;
		}
		else {
			return false;
		}
	};
	System.out.println(p1.test(15));
	System.out.println(p1.test(2));
	
	Predicate <Integer> p2=i->{
		if(i%2==0) {
			return true;
		}
		else {
			return false;
		}
	};
	System.out.println(p2.test(15));//f
	System.out.println(p2.test(2));//t
	
	//Predicate and method
	System.out.println(p1.and(p2).test(14));//t
	System.out.println(p1.and(p2).test(13));//f
	
	//Predicate or method
	System.out.println(p1.or(p2).test(15));//t
	System.out.println(p1.or(p2).test(5));//f
	
	//Predicate negate method
	System.out.println(p1.negate().test(2));//t
	System.out.println(p1.negate().test(14));//f
	}

}
