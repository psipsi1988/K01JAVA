package ex02variable;

public class Qu_02 {

	public static void main(String[] args) {
		
		
		int kor=99, eng=80, math=96;
		double avg = (kor+eng+math) / 3.0;
		
		System.out.printf("%d점, %d점, %d점의 평균 점수는 %.2f입니다. %n", 
				kor, math, eng, avg);
		System.out.printf("%d점, %d점, %d점의 평균 점수는 %.0f입니다. %n", 
				kor, math, eng, avg);
	}
}
