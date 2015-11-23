package com.liuzhe.array.ordarray;

import java.util.Random;

public class OrdArrayApp {
	public static void main(String[] args) {
		OrdArray oa = new OrdArray(100);
		Random random = new Random();
		
//		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 10; i++) {
			oa.insert(random.nextInt(100));
		}
		
		oa.display();
		System.out.println();
//		System.out.println("二分法  " + (System.currentTimeMillis() - startTime));
		
		
		OrdArray oa1 = new OrdArray(100);
//		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {
			oa1.insert(random.nextInt(100));
		}
		
//		System.out.println("线性  " + (System.currentTimeMillis() - startTime));
		oa1.display();

		
	}
}
