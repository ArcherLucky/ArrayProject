package com.liuzhe.array.higharray;

/**
 * һ������
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
	 * ���ҷ���
	 * @param searchKey
	 * @return �Ƿ���ҵ�
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
	 * ���뷽��
	 * @param value
	 */
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	/**
	 * ɾ������
	 * @param value
	 * @return �Ƿ�ɾ���ɹ�
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
	 * ��ȡ���������ؼ��ֵ�ֵ
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
	 * ���ز�ɾ�����������ؼ��ֵ���Ŀ
	 * @return
	 */
	public long removeMax() {
		long max = getMax();
		delete(max);
		return max;
	}
	
	/**
	 * ��ӡ����
	 */
	public void display() {
		for(int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
}
