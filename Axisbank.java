package org.assignment3;

public class Axisbank extends Bankinfo{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		System.out.println("deposite Axis bank");
	}
	
	public static void main(String[] args) {
		
		Axisbank ob = new Axisbank();
		
		ob.deposit();
	}
	

}
