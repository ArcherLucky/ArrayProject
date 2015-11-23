package com.liuzhe.array.dataarray;

public class DataArrayApp {
	
	public static void main(String[] args) {
		DataArray da = new DataArray(15);
		for(int i = 0; i < 10; i++) {
			da.insert(new Person("" + i, "" + i, i));
		}
//		da.display();
		
		da.find("dd");
	}

}
