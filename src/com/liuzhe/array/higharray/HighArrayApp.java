package com.liuzhe.array.higharray;

public class HighArrayApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighArray ha = new HighArray(15);
		
		
		ha.insert(87);
		ha.insert(23);
		ha.insert(74);
		ha.insert(42);
		ha.insert(90);
		ha.insert(17);
		ha.insert(77);
		ha.insert(45);
		ha.insert(34);
		ha.insert(23);
		ha.display();
		System.out.println();
		
		long[] array = new long[10];
		for(int i = 0; i < 10; i++) {
			array[i] = ha.removeMax();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		
	}
}
