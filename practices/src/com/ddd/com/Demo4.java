package com.ddd.com;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(Math.random());
		dos.writeBoolean(true);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		DataInputStream dis = new DataInputStream(bis);
		System.out.println(dis.available());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		dos.close();
		dis.close();

	}
}
