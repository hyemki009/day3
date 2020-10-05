package test6;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt(); //21억 이하 양의 정수
			int reverseNum = 0; //n의 각자리수의 역
			int sumNum = 0; //n의 각 자리수의 합
			
			if(n<1 || n>21*100*100*100*100) {
				return;
			}
			
			while(n!=0) {
				int num = n%10;
				reverseNum *= 10;
				reverseNum += num;
				sumNum += num;
				n/=10;
			}
			System.out.println(reverseNum+" "+sumNum);
		}
	}
}