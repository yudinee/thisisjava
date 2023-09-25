package ch06.sec15;

import java.util.Scanner;

public class BankApplication {
	

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static Account newAccount;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------------");
			System.out.println("선택 > ");
			
			int select = scanner.nextInt();
			
			if(select == 1) {
				createAccount();
			} else if (select == 2) {
				accountList();
			} else if (select == 3) {
				deposit();
			} else if (select == 4) {
				withdraw();
			} else if (select == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성하기
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("계좌주 : ");
		String owner = scanner.next();
		System.out.println("초기입금액 : ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		
		for(int i=0; i<accountArray.length; i++) {
			
			Account account = accountArray[i];
			
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("  ");
				
				System.out.print(account.getOwner());
				System.out.print("  ");
				
				System.out.print(account.getBalance());
				System.out.println("  ");
			}
		}
	} 
	
	private static void deposit() {
		
	}
	
	private static void withdraw() {
		
	}

}

	