package org.assignment4;

public class Students {
	public void getstudentinfo(int id) {
		System.out.println(id);

	}

	public void getstudentinfo(int id, String name) {

		System.out.println(id + name);

	}

	public void getstudentinfo(String email, int phone) {
		System.out.println(email + phone);

	}

	public static void main(String[] args) {
		Students o = new Students();

		o.getstudentinfo(2);

		o.getstudentinfo(3, "hema");
		o.getstudentinfo("123@gmail.com", 9789480);
	}
}
