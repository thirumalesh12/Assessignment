package com.corejava.lambdaexpression.functionalinterfaceQ3;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Supplier<String>supplyOTP=()->{
			String s="";
			for(int i=0;i<6;i++) {
				int num=(int)(Math.random()*10);
				
			//	s+=num;
				s+=(char)(num+65);
			}
			return s;
		};
		System.out.println(supplyOTP.get());
		System.out.println(supplyOTP.get());
		System.out.println(supplyOTP.get());
		System.out.println(supplyOTP.get());

	}

}
