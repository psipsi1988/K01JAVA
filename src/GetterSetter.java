

class Person{
	//멤버변수
	private String name;
	private boolean isMarried;
	//멤버메소드
	public void showInfo() {
		System.out.println("이름:" + name) ;
		System.out.println("결혼 여부:" + isMarried);
	}
	//생성자
	public Person(String name, boolean isMarried) {
		super();
		this.name = name;
		this.isMarried = isMarried;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class GetterSetter {

	public static void main(String[] args) {
		Person p1 = new Person("길동", false);
		//p1.name = "우성";
		p1.setName("우성");
		System.out.println("p1객체의 이름:"+ p1.getName());
		p1.showInfo();
	}
}
