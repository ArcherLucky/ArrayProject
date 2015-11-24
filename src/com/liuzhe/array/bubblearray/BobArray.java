package com.liuzhe.array.bubblearray;

/**
 * ð������
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
	 * ð������
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
	 * ѡ������
	 */
	
	public void chooseSort() {
		
		int min; // ÿ�αȽ���С���±�
		int out; // ���ѭ�����±�
		int in; // �ڲ�ѭ�����±�
		
		for(out = 0; out < nElems - 1; out++) {
			min = out; // ��ʼ����ǰ������Сֵ
			for(in = out + 1; in < nElems; in++) {
				if(a[min] > a[in]) { // �����һ���ȵ�ǰ�Ĵ�
					min = in; // �����±�
				}
			}
			// ����ֵ
			long temp = a[min];
			a[min] = a[out];
			a[out] = temp;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
