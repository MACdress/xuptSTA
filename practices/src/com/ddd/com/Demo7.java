package com.ddd.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo7 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("e:/copy/co.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new T());
		oos.flush();
		oos.close();
		FileInputStream fis = new FileInputStream("e:/copy/co.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T trmp = (T) ois.readObject();
		System.out.println(trmp);
		ois.close();
	}
}

class T implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String name;
	private final String toname;

	public T() {
		name = "gao";
		toname = "fan";
	}

	@Override
	public String toString() {
		return "T [name=" + name + ", toname=" + toname + "]";
	}

}