package com.liuzhe.array.dataarray;

/**
 * 对象数组
 * @author liuzhe
 *
 */
public class DataArray {
	private Person[] p;
	private int nElems;
	
	public DataArray(int max) {
		p = new Person[max];
		nElems = 0;
	}
	
	/*
	 * 查找方法
	 */
	public Person find(String lastName) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(p[i].getLastName().equals(lastName)) {
				break;
			}
		}
		if(i == nElems) {
			return null;
		} else {
			return p[i];
		}
		
	}
	
	/*
	 * 插入方法
	 */
	public void insert(Person person) {
		p[nElems] = person;
		nElems++;
	}
	
	/*
	 * 删除方法
	 */
	public boolean delete(String lastName) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(p[i].getLastName().equals(lastName)) {
				break;
			}
		}
		
		if(i == nElems) {
			return false;
		}
		
		
		for(int j = i; j < nElems; j++) {
			p[j] = p[j+1];
		}
	
		nElems--;
		return true;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(p[i].getAge() + "");
		}
	}
	
}
