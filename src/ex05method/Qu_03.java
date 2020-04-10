package ex05method;

public class Qu_03 {

	
	public static void main(String[] args) {
		
		int ban = 10;
		double PI = 3.14;
		
		int area_int = (int)(ban*ban*PI);
		float area_float = (float)(ban*ban*PI);
		double area_double = ban*ban*PI;

		System.out.println("int형:" + area_int);
		System.out.println("float형:" + area_float);
		System.out.println("double형:" + area_double);
	}
}
