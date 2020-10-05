package test6;

public class IfElse2 {

	public static void main(String[] args) {
		int score = 80;
		
		if(score >=80) {
			System.out.println ("A플 입니다");
		    System.out.println ("점수는 80~100입니다");
		}	else if (score >=75) {
		      System.out.println ("b입니다");
			  System.out.println ("점수는 75~80입니다");
		}
			  else if (score >=72) {
				  System.out.println ("c입니다");
				  System.out.println ("점수는 72~74입니다");
				  
			  }
			  else {
				  System.out.println("점수가 70미만입니다");
				  System.out.println("d등급입니다");
		    }
		
		
	}
}

