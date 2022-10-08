package com.xworkz.javaeight;

public class Cat implements Monkey{
	public void walk(Monkey monkey) {
		System.out.println("Walk");
		monkey.shout("Monkey", 100);
	}

	@Override
	public void shout(String name, double price) {
		// TODO Auto-generated method stub
		
	}

}
