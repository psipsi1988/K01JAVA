package ex11static;
/*
정적 변수(Static variable)
-멤버 변수 앞에  static 지정자가 붙으면 정적 변수가 된다. 
-정적 변수 JVM(자바가상머신)에 의해 프로그램이 로드되는 시점에서 초기화 된다. 
-main메소드가 실행되기 전에 이미 초기화 되므로 main메소드 실행시 
	별도로 선언 없이  변수를 사용할 수 있다.

 접근 방법
 	-클래스 내부
 		변수명으로 접근 가능 (일반적인  멤버변수와 동일)
 	-클래스 외부
 		참조변수.변수명 혹은 클래스명.변수명 형태로 접근
 		(참조변수로 접근하는 것은 java에서 권장하지 않는다.)
 */

class MyStatic {
	/*
	[멤버변수] 인스턴스형 멤버변수는 반드시 클래스의 객체를 생성한 후 
		참조 변수를 통해 접근해야 한다. 
	 */
	int instanceVar;
	/*
	[정적멤버변수] 객체를 생성할 필요없이 클래스명으로 바로 접근이 가능하다. 
		프로그램 시작 시 이미 메소드 영역에 초기화 된다. 
	 */
	static int staticVar;
	
	/*
	[인스턴스형 멤버메소드] 인스턴스형 메소드에서는 모든 멤버를 사용할 수 있다. 
		인스턴스형변수, 정적변수 둘 다 가능. 
	 */
	void instanceMethod() {
		System.out.println("instanceVar=" + instanceVar);//접근 가능
		System.out.println("staticVar=" + staticVar);// 접근 가능
		staticMethod();//접근 가능
	}
	/*
	[정적 멤버 메소드] : 정적 메소드 안에서는 인스턴스 멤버를 사용할 수 없다. 
			정적 멤버만 사용이 가능하다. 
	
	(※main메소드에서는 static으로 선언된 메소드만 호출할 수 있었음을 기억하자)
	 */
		
	static void  staticMethod() {
		//System.out.println("instanceVar=" + intanceVar);//[오류 발생]
		System.out.println("staticVar=" + staticVar);
		//instanceMethod();//[오류 발생]

	}
}

public class E01StaticModifier {

	public static void main(String[] args) {

		
		/*
		MyStatic 클래스의 인스턴스형 멤버변수에 접근하는 방법
		-> 인스턴스 생성 후 참조변수를 통해 접근한다. 
		 */
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar=" + myStatic.instanceVar);
		
		/*
		static (정적) 멤버변수 접근 방법
		방법1 : 클래스명을 통해서 접근한다. 
			객체 생성 없이  바로 접근하는 것이 가능하다. 
		 */
		myStatic.staticVar = 200;
		System.out.println("myStatic.staticVar=" + myStatic.staticVar);
		
		
		/*
		방법2 : 인스턴스 변수처럼 참조변수를 통해 접근할 수 있다. 
			단, 이 경우는 정적변수를 인스턴스변수로 착각할 수 있으므로 권장하지 않는다. 
		 */
		myStatic.staticVar = 300;
		System.out.println("myStatic.staticVar=" + myStatic.staticVar);
		
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		/*
		인스턴스 멤버변수는 객체별로 각각 존재하므로 아래 초기화된 값은 객체별로 각각 저장된다. 
		따라서 출력 결과는 100, 1000이 된다. 
		 */
		
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;

		System.out.println("ms1.instanceVar=" +  ms1.instanceVar);//100
		System.out.println("ms2.instanceVar=" +  ms2.instanceVar);//1000
		
		
		/*
		정적멤버는 인스턴스화된 객체마다 따로 있는 멤버가 아니라 
		멤소드 영역에 하나만 생성되어 모든 객체가 공유하게 된다.
		따라서 아래 출력 결과는 900, 900이 된다.  
		 */
		ms1.staticVar = 800;
		ms2.staticVar = 900;/*
			위 두 개의 문장은 동일한 변수에 접근하고 있으나 코드 레벨에서는 
			마치 다른 번수처럼 보인다. 
			따라서 위 문장은 MyStatic.staticVar로 기술하는 것이 좋다. 
		*/
		
		System.out.println("ms1.staticVar=" +  ms1.staticVar);//900
		System.out.println("ms2.staticVar=" +  ms2.staticVar);//900
		
		
		/*
		정적 멤버메소드의 접근 방법도 정적 변수와 동일한 규칙을 가진다. 
		 */
		
		
		myStatic.instanceMethod();
		myStatic.staticMethod();
		
		//MyStatic.instanceMethod(); // 에러 발생(참조 변수를 통해서만 호출 가능)
		MyStatic.staticMethod();
		
		
	}

}
