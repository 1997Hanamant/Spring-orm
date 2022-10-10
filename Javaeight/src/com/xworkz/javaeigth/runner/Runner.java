package com.xworkz.javaeigth.runner;

import com.xworkz.javaeight.Monkey;
import com.xworkz.javaeight.Weekend;

public class Runner {

	public static void main(String[] args) {
		Monkey monkey=(ref,ref1)->{
			System.out.println("Monkey"+" "+ref+" "+ref1);
	
		};
		monkey.shout("DP Nair",100);
		
		Weekend  weekend=()->{
			System.out.println( "Calling ");
			
		};
		weekend.function();
	}
		
		
		
	
}