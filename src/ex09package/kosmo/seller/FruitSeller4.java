package ex09package.kosmo.seller;


	public class FruitSeller4{
		int numOfApple ; //판매자의  사과 보유 개수
		int myMoney;  //판매 수익
		final int APPLE_PRICE; //다시 상수로 선언함.
		
		
		public FruitSeller4(int money, int appleNum, int price) {
			myMoney = money;
			numOfApple = appleNum;
			APPLE_PRICE  =price; // <= 생성자 내에서는 상수를 초기화할 수 있음. 
		}	
		public int saleApple(int money) {
			int num = money / APPLE_PRICE;
			numOfApple  -= num;
			myMoney += money;
			return num;
		}
		public void showBuyResult() {
			System.out.println("[판매자]남은 사과 개수:" + numOfApple);
			System.out.println("[판매자]판매수익:" + myMoney);
		}
	}

