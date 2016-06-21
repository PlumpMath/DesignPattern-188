package com.interview.tricky;

public class DoubleEquals {
	public static void main(String[] args) {
		System.out.println("0.1*3 = "+0.1*3);
		System.out.println(0.1*3==0.3);
		
		long val = -1L;
		double dou = val;
		val = (long) dou;
		System.out.println("Double range: "+Double.MAX_VALUE+" to "+Double.MIN_VALUE);
	}
}
