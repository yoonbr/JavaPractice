package java1026;

public class Employee {
	
	// 일련번호 생성 - static 변수 생성 
	// static 변수는 한개만 생성 가능. static이 없는 변수는 여러개 생성 가능 
	private static int autoIncrement;
	
	// num을 사용 할 수 는 있지만 못바꾸게 하는 방법 : setter을 없애버림 
	// setter 메소드를 제거해서 읽기 전용을 생성 
	private int num;
	private String name;
	private String position;
	private String office;
	private int age;
	
	// 생성자 
	public Employee() { 
		// 일련번호를 만들어서 num에 저장. 1씩 증가하면서 일련번호를 지정 
		autoIncrement = autoIncrement + 1;
		num = autoIncrement;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", position=" + position + ", office=" + office + ", age="
				+ age + "]";
	}
}


