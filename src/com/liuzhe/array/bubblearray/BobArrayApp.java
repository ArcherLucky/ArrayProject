package com.liuzhe.array.bubblearray;

import java.util.Random;

public class BobArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BobArray ba = new BobArray(10);
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			ba.insert(random.nextInt(100));
		}
		ba.display();
		ba.chooseSort();
		ba.display();
	}

}
