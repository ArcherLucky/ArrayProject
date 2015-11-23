package com.liuzhe.array.ordarray;

/**
 * ��������
 * 
 * @author liuzhe
 * 
 */
public class OrdArray {
	private long[] a; // ����
	private int nElems; // Ԫ�ظ���

	public OrdArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	/**
	 * ���ַ�����
	 * 
	 * @param seachKey
	 * @return ���ز��ҵ��������±꣬���������ĳ��ȣ���û���ҵ�
	 */
	public int find(int seachKey) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == seachKey) {
				return curIn;
			} else if (lowerBound > upperBound) {
				return nElems;
			} else {
				if (a[curIn] > seachKey) {
					upperBound = curIn - 1;
				} else {
					lowerBound = curIn + 1;
				}
			}
		}
	}

	/**
	 * ���뷽��
	 * 
	 * @param value
	 */
	public void insert(int value) {

		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == value) {
				insertTemp(curIn, value);
				break;
			} else if (lowerBound > upperBound) {
				a[nElems] = value;
				nElems++;
				break;
			} else {
				if (a[curIn] > value) {

					if (curIn == 0 || a[curIn - 1] < value) {
						insertTemp(curIn, value);
						break;
					} else {
						upperBound = curIn - 1;
					}

				} else {
					if (a[curIn + 1] > value) {
						insertTemp(curIn, value);
						break;
					} else {
						lowerBound = curIn + 1;
					}

				}
			}
		}
	}

	private void insertTemp(int curIn, long value) {
		for (int j = nElems; j > curIn; j--) {
			a[j] = a[j - 1];
		}
		a[curIn] = value;
		nElems++;
	}

	/**
	 * ���Բ���
	 * 
	 * @param value
	 *            �����ֵ
	 */
	public void insertLinear(int value) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (a[i] > value) {
				break;
			}
		}
		for (int j = nElems; j > i; j--) {
			a[j] = a[j - 1];
		}
		a[i] = value;
		nElems++;
	}

	/**
	 * ɾ������
	 * 
	 * @param value
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean delete(int value) {
		int curIn = find(value);
		if (curIn == nElems) {
			return false;
		}
		for (int i = curIn; i < nElems; i++) {
			a[i] = a[i + 1];
		}
		nElems--;
		return true;
	}

	public long[] merge(long[] array1, long[] array2) {
		long[] resultArray = new long[array1.length + array2.length];
		return null;
	}

	/**
	 * �������
	 */
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
