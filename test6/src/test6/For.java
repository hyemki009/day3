package test6;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int dan;
	int i =1;
	
	dan = sc.nextInt();
	for(; i<=9; i++) {
		System.out.println(dan + " * " + i + "=" + (dan *i));
	}
	
	
	sc.close();
	

	}

}
