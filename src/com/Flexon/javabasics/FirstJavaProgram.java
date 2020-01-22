package com.Flexon.javabasics;
import java.util.*;

import tasks.dayOne;
public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("This is my first Java Program");
//		float toConvert = 100.0f;
//		float converted = toConvert/2.2f;
//		System.out.println(converted);
//		System.out.println("input a number to convert");
//		Scanner sc = new Scanner(System.in); 
//		float toConver = sc.nextFloat();
//		System.out.println("Converted " + toConver +" to " + toConver/2.2f);
//		
		
		double var = 20;
		double var2 = 80;
		double res = (var * var2)/25;
		System.out.println(res);
		if((res % 40) <=20) {
			System.out.println("Total was over the limit");
		} else {
			System.out.println("Total was lower than the limit");
		}
		dayOne task1 = new dayOne();
		task1.task();
	}

//	public static float convert() {
//		return 0;
//		
//	}
}
