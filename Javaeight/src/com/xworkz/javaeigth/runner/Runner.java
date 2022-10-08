package com.xworkz.javaeigth.runner;

import com.xworkz.javaeight.Monkey;

public class Runner {

	public static void main(String[] args) {
		Monkey monkey=(ref,ref1)->{
			System.out.println("Monkey"+" "+ref+" "+ref1);
	
		};
		monkey.shout("DP Nair",100);
		
	}
}