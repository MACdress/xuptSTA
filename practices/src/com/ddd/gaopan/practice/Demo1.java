package com.ddd.gaopan.practice;

public class Demo1 implements Comparable<Demo1> {
	private final String firstname;
	private final String lastname;

	public Demo1(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname;
	}

	@Override
	public int hashCode() {
		return firstname.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Demo1) {
			Demo1 dem = (Demo1) obj;
			return (this.firstname.equals(dem.firstname))
					&& (this.lastname.equals(dem.lastname));
		}
		return false;

	}

	@Override
	public int compareTo(Demo1 o) {
		Demo1 n = o;
		int lastcmp = lastname.compareToIgnoreCase(n.lastname);
		return (lastcmp != 0 ? lastcmp : firstname
				.compareToIgnoreCase(n.firstname));
	}
}
