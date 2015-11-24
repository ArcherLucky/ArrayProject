package com.liuzhe.array;

import junit.framework.TestCase;

public class TestClass extends TestCase {
	private void printDoubleArray(double[] datas) {
		for(int i = 0; i < datas.length; i++) {
			System.out.print(datas[i] + ",");
		}
	}
	
	public void testBinaryInsert() {
		double[] datas = new double[10];
		datas = this.binaryInsert(datas, 1);
		datas = this.binaryInsert(datas, 2);
		datas = this.binaryInsert(datas, 64);
		datas = this.binaryInsert(datas, 233);
		datas = this.binaryInsert(datas, 23);
		datas = this.binaryInsert(datas, 15);
		datas = this.binaryInsert(datas, 184);
		datas = this.binaryInsert(datas, 65);
		datas = this.binaryInsert(datas, 3);
		datas = this.binaryInsert(datas, 123);
		datas = this.binaryInsert(datas, 2003);
	}
	
	int len = 0;
	public double[] binaryInsert(double[] datas, double value) {
		if(datas == null || datas.length < len) {
			return null;
		}
		if(datas.length == len) {
			double[] newDatas = new double[len + 5];
			System.arraycopy(datas, 0, newDatas, 0, len);
			datas = newDatas;
		}
		int pos = this.findInsertPosition(datas, value, 0, len - 1);
		System.out.println();
		//System.out.println("pos:" + pos + ", value:" + value + ", len:" + len);
		//this.printDoubleArray(datas);
		for(int i = len - 1; i >= pos; i--) {
			datas[i + 1] = datas[i];
		}
		//System.out.print("||||");
		datas[pos] = value;
		len ++;
		this.printDoubleArray(datas);
		return datas;
	}
	
	/**
	 * 二分法查找有序数组插入位置
	 * @param datas 需要查找的数组
	 * @param value 需要插入的值
	 * @param start 开始查找的位置
	 * @param end 结束查找的位置
	 * @return 返回插入的位置
	 */
	private int findInsertPosition(double[] datas, double value, int start, int end) {
		int low = start;
		int high = end;
		int mid = 0;
		if(datas == null || len == 0) {
			return 0;
		}
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(datas[mid] > value) {
				high = mid - 1;
			} else if(datas[mid] < value) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		if(datas[mid] < value) {
			return mid + 1;
		} else {
			return mid;
		}
		
	
	}
}
