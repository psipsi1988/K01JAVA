package ex10accessmodifier;

public class E06AccountMain {

	public static void main(String[] args) {

		//DAO 객체 생성
		AccountDAO cap = new AccountDAO();
		
		//데이터 초기화를 통해 DTO 객체 생성
		cap.init("홍길동", "1234-56789-0", 10000);
		//통장정보출력
		cap.printAccount();
		//출금처리
		cap.wihdraw(20000);
		cap.wihdraw(3000);
		//입금처리
		cap.deposit(10000);
		//통장정보출력
		cap.printAccount();
	}

}
