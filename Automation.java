package org.assignment5;

public class Automation extends MultipleLangauge implements Language{

	@Override
	public void ruby() {
		System.out.println("ruby");

	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		super.python();
		System.out.println("python");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("selenium");

	}

	public void java() {
	
		System.out.println("java");

	}

	public static void main(String[] args) {

		Automation auto = new Automation();
		auto.java();
		auto.python();
		auto.ruby();
		auto.selenium();
	}

}
