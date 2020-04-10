package quiz_game;

import java.util.Scanner;


public class QuUpDownGame {
	
	static Scanner scan = new Scanner(System.in);
	//static int randomNumber = (int)((Math.random())*100)+1;
	//static int randomNumber = (int)(drandomNumber*100);
	static int gameCnt = 0;
	
	public static void  gameStart() {
		
		int randomNumber = (int)((Math.random())*100)+1;
		System.out.println("업다운 게임을 시작합니다. ");
		for (int i=0 ; i<8; i++) {
			System.out.println(7-gameCnt+"번의 기회가 있습니다. ");
			System.out.println("1~100사이 숫자를 입력하세요: ");
			int userNumber = scan.nextInt();
			scan.nextLine();
			
			if(userNumber==randomNumber) {
				System.out.println("성공!"+ randomNumber + " 정답입니다. ");
				System.out.println("게임을 다시 시작할까요? ");
				System.out.println("재시작=1   / 종료=0");
				int re = scan.nextInt();
				scan.nextLine();
				if(re==1) {
					gameCnt=0;
					
					gameStart();
				}
				else if(re==0) {
					break;
				}
				break;
			}
			if(gameCnt==6) {
				System.out.println("실패! 7번의 기회를 모두 사용하였습니다. ");
				System.out.println("게임을 다시 시작할까요? ");
				System.out.println("재시작=1   / 종료=0");
				int re = scan.nextInt();
				scan.nextLine();
				if(re==1) {
					gameCnt=0;
					
					gameStart();
				}
				else if(re==0) {
					
				}
				
			}
			if(userNumber<randomNumber) {
				System.out.println("******* 업 ********");
				gameCnt++;
				continue;
			}
			else if(userNumber>randomNumber) {
				System.out.println("*******다 운********");
				gameCnt++;
				continue;
				
			}
			System.out.println("게임 종료되었습니다.11111 ");
			System.out.println("정답은 " + randomNumber);
			System.out.println("게임을 다시 시작할까요? ");
			System.out.println("재시작=1   / 종료=0");
			int re = scan.nextInt();
			scan.nextLine();
			if(re==1) {
				gameCnt=0;
				
				gameStart();
			}
			else if(re==0) {
				
			}
			break;
			
		}
		
	}


	public static void main(String[] args) {

		gameStart();
			
		System.out.println("게임이 종료되었습니다.");
	}

}


