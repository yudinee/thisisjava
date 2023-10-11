package ch09.sec09;

import java.util.Scanner;

public class Kiosk {
	 static Scanner sc = new Scanner(System.in);
	   static String menuArr[][] = { //[4][3]
	         { "에스프레소", "0", "0" }, { "아메리카노", "0", "0" }, { "초코라떼", "0", "0" }, { "모카치노", "0", "0" } };
	   static int totalPrice = 0;
	   static boolean run = true;

	   public static void main(String[] args) {

	      while (run) {
	         System.out.println("###################################");
	         System.out.println("#############  Kiosk  #############");
	         System.out.println("###################################");
	         System.out.println("|  1.메뉴 고르기 | 2.계산하기 | 3.종료  |");
	         System.out.println("###################################");

	         System.out.print("선택하기>");
	         String input = sc.next();

	         if (input.equals("1")) {
	            menu();
	         } else if (input.equals("2")) {
	            int checking = 0;
	            for(int i = 0; i < 4; i++) {
	               checking += Integer.parseInt(menuArr[i][1]);
	            }
	            if (checking == 0) {
	               System.out.println("메뉴 미선택");
	               continue;
	            } else {
	               pay();
	            }

	         } else if (input.equals("3")) {
	            System.out.println("키오스크 종료");
	            run = false;
	         } else {
	            System.out.println("잘못된 입력");
	            continue;
	         }

	      }

	   }

	   static void menu() {
	      boolean run = true;
	      while (run) {
	         System.out.println("########################");
	         System.out.println("########  menu #########");
	         System.out.println("########################");
	         System.out.println("1. 에스프레소 | price: 1000");
	         System.out.println("2. 아메리카노 | price: 1500");
	         System.out.println("3. 초코라떼   | price: 2000");
	         System.out.println("4. 모카치노   | price: 2500");
	         System.out.println("#########################");
	         System.out.print("선택하기>");
	         String inputMenu = sc.next(); // 메뉴 선택

	         System.out.print("수량>");
	         int inputCnt = sc.nextInt(); // 음료 수량

	         if (inputMenu.equals("1")) {
	            menuArr[0][1] = String.valueOf(Integer.parseInt(menuArr[0][1]) + inputCnt);
	            menuArr[0][2] = String.valueOf(Integer.parseInt(menuArr[0][2]) + (1000 * inputCnt));
	         } else if (inputMenu.equals("2")) {
	            menuArr[1][1] = String.valueOf(Integer.parseInt(menuArr[1][1]) + inputCnt);
	            menuArr[1][2] = String.valueOf(Integer.parseInt(menuArr[1][2]) + (1500 * inputCnt));
	         } else if (inputMenu.equals("3")) {
	            menuArr[2][1] = String.valueOf(Integer.parseInt(menuArr[2][1]) + inputCnt);
	            menuArr[2][2] = String.valueOf(Integer.parseInt(menuArr[2][2]) + (2000 * inputCnt));
	         } else if (inputMenu.equals("4")) {
	            menuArr[3][1] = String.valueOf(Integer.parseInt(menuArr[3][1]) + inputCnt);
	            menuArr[3][2] = String.valueOf(Integer.parseInt(menuArr[3][2]) + (2500 * inputCnt));
	         } else {
	            System.out.println("잘못된 입력");
	         }

	         System.out.println("1.더 고르기 | 2. 계산하기");
	         System.out.print("선택하기>");
	         String selectNum = sc.next();
	         if (selectNum.equals("1")) {
	            continue;
	         } else if (selectNum.equals("2")) {
	            run = false;
	         } else {
	            System.out.println("잘못된 입력");
	         }
	      }
	   }

	   static void pay() {
	      System.out.println();
	      for (int i = 0; i < 4; i++) {
	         if (!(menuArr[i][1]).equals("0")) { // 널엑셉션ㄴ
	            System.out.println("커피:" + menuArr[i][0] + " | 수량: " + menuArr[i][1] + " | 금액: " + menuArr[i][2]);
	         }
	      }
	      for (int k = 0; k < 4; k++) {
	         totalPrice += Integer.parseInt(menuArr[k][2]);
	      }
	      System.out.println("계산할 금액: " + totalPrice + "원");
	      System.out.println("1.계산 | 2.종료");
	      System.out.print("선택하기>");
	      System.out.println();

	      String selectNum = sc.next();
	      if (selectNum.equals("1")) {
	         System.out.println("총 금액 " + totalPrice + "원 계산 완료");
	         run = false;
	      } else if (selectNum.equals("2")) {
	         System.out.println("계산 취소");
	         run = false;
	      } else {
	         System.out.println("잘못된 입력");
	      }
	   }



}
