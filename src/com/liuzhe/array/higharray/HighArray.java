package com.liuzhe.array.higharray;

/**
 * 一般数组
 * @author liuzhe
 *
 */
public class HighArray {
	private long[] a;
	private int nElems;
	
	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	/**
	 * 查找方法
	 * @param searchKey
	 * @return 是否查找到
	 */
	public boolean find(long searchKey) {
		int j;
		for(j=0; j<nElems; j++) {
			if(a[j] == searchKey) {
				break;
			}
		}
		if(j == nElems) {
			return false;
		} else {
			return true;
		}
		
	}
	
	/**
	 * 插入方法
	 * @param value
	 */
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	/**
	 * 删除方法
	 * @param value
	 * @return 是否删除成功
	 */
	public boolean delete(long value) {
		int j;
		for(j = 0; j < nElems; j++) {
			if(value == a[j]) {
				break;
			}
		}
		if(j == nElems) {
			return false;
		} else {
			for(int k = j; k < nElems; k++) {
				a[k] = a[k + 1];
			}
			nElems--;
			return true;
		}
	}
	
	/**
	 * 获取数组中最大关键字的值
	 * @return
	 */
	public long getMax() {
		if(nElems == 0) {
			return -1;
		}
		
		long result = a[0];
		
		for(int i = 1; i < nElems; i++) {
			if(a[i] > result) {
				result = a[i];
			}
		}
		
		return result;
	}
	

	/**
	 * 返回并删除数组中最大关键字的项目
	 * @return
	 */
	public long removeMax() {
		long max = getMax();
		delete(max);
		return max;
	}
	
	/**
	 * 打印方法
	 */
	public void display() {
		for(int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
}
