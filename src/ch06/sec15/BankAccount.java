package ch06.sec15;

import java.util.Scanner;

public class BankAccount {
	
	// 메인메소드 밖에 만든 이유는 메인메소드가 실행하지 않더라도 초기 세팅이 되어야하기 때문
	// 메인메소드 밖에 만들어서 static (메인메소드 안에서 객체 만들지 않고 자유롭게쓰기 위해)
	// 내 클래스 안에서 쓰기 위해 praivate

	// 100개 짜리의 계좌를 만들기 위해서[]배열씀, 이렇게 안하면 저장하는 변수 100개 만들어야 함
	// 일반 객체 private Account accountArray = new Account();
	// Account 클래스 타입이(선언클래스) 배열로 들어감
	// Account[]는 Accout클래스 타입의 필드3개가 동시에 들어감
	private static Account[] accountArray = new Account[100]; // account 타입 -> 계좌번호, 예금주, 초기입금액
	// 값을 입력하기 위해
	private static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------------");
			System.out.println("선택 > ");

			int select = scanner.nextInt();

			if (select == 1) {
				createAccount(); // 계좌생성 메소드
			} else if (select == 2) {
				accountList(); // 계좌목록 확인 메소드
			} else if (select == 3) {
				deposit(); // 예금 메소드
			} else if (select == 4) {
				withdraw(); // 출금 메소드
			} else if (select == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	} // 메인메소드 끝

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");

		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("계좌주 : ");
		String owner = scanner.next();

		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);

		// accountArray.length = 100
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				// acccountArray 0번지 값이 null인 경우 밑에 실행,
				// 0번지 값을 넣어서 값이 있는 경우는 null이 실행x, i++로 감
				// 1번지 값을 넣으면 null 실행....(반복)
				accountArray[i] = newAccount;
				// newAccount = 계좌번호, 계좌주, 초기입금액(내가 입금한 것)
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break; // for문 빠져나옴
				// 0번지 값 넣으면 break(계좌가 생성되어서), i++더 하지 않음
				// 값을 더 넣으면 반복 실행
			}
		}

	}

	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");

		for (int i = 0; i < accountArray.length; i++) {

			// accountArray 0번지에 있는 값을 account에 넣어라
			Account account = accountArray[i];

			if (account != null) {
				System.out.print(account.getAno()); // 위에 Account account = accountArray[i]생성 안하고
				System.out.print("  "); // account대신 accountArray[i]를 해줘도 됨
				// 선언 클래스 필드값이 private이어서 get씀

				System.out.print(account.getOwner() + "  "); // 밑에 쓰는 대신 이렇게 해줘도 됨
				// System.out.print(" ");

				System.out.print(account.getBalance());
				System.out.println("  ");
				// 다 붙여서 한줄로 만들 수도있음
			}
		}
	}

	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");

		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("예금액 : ");
		int money = scanner.nextInt();

		Account account = findAccount(ano); // 입금할 계좌 // 객체 생성
		if (account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return; // 내가 속해있는 메소드 끝냄 //메소드를 종료하기엔 break보다 return break는 반복문만 빠져나감
		}
		account.setBalance(account.getBalance() + money);
		// balance의 필드값을 바로 알 수 없기때문에(선언클래스private타입) getBalance(위에 적은 잔고)에 money값을 더해주면
		// 더해준 값을 바로 balance에 넣을 수 없어서(선언클래스private타입) setBalance사용(다시 잔액을 설정하기 때문에set)
		System.out.println("결과 : 입금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");

		System.out.println("계좌번호 : ");
		String ano = scanner.next();

		System.out.println("출금액 : ");
		int money = scanner.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		if (account.getBalance() < money) {
			System.out.println("예금액보다 출금액이 많아 출금할 수 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");
		System.out.println("잔고 : " + account.getBalance());
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기 //예금, 출금할때 사용
	private static Account findAccount(String ano) {
		// 계좌번호뿐만 아니라 잔액, 계좌주 모두 입력해야 하기 때문에 String이 아닌 Account
		Account account = null;
		// 누가 들어있는지 모르니까 null, 앞으로 검사해서 찾아줌

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) { // 122번줄 ano
					account = accountArray[i]; // account는 위에서 사용 예금, 출금부분
					break;
				}
			}
		}
		return account;

	}

}
	