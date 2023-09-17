package ch04.sec02;
/*
 * if(조건식1) {
 * 			if(조건식2)  {
 * 
 * 		} else {
 * 	
 * 		}
 * 
 * } else {
 * 
 * }
 * 			
 * 
 */

public class IfNestedExample {

	public static void main(String[] args) {

		int score = (int)(Math.random()*20) +81;
		System.out.println("점수 : " +score);
		
		String grade;
		
		if(score >= 90) {  // if가 true면 두번째 if문으로 false면 세번째 if문으로 
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {            //아마 첫번째 if괄호 닫힘
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} 
		
		System.out.println("학점 : " + grade);
		
		
		
		
		
		
	}

}
