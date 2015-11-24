package com.liuzhe.array.bubblearray;

/**
 * 冒泡数组
 * 
 * @author liuzhe
 * 
 */
public class BobArray {
	private long[] a;
	private int nElems;

	public BobArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 冒泡排序
	 */
	public void bubbleSort() {
		for (int i = 0; i < nElems; i++) {
			for (int j = 0; j < nElems - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					long tmep = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmep;
				}
			}
		}
	}

	/**
	 * 选择排序
	 */
	
	public void chooseSort() {
		
		int min; // 每次比较最小的下标
		int out; // 外层循环的下标
		int in; // 内层循环的下标
		
		for(out = 0; out < nElems - 1; out++) {
			min = out; // 初始化当前就是最小值
			for(in = out + 1; in < nElems; in++) {
				if(a[min] > a[in]) { // 如果下一个比当前的大
					min = in; // 交换下标
				}
			}
			// 交换值
			long temp = a[min];
			a[min] = a[out];
			a[out] = temp;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
