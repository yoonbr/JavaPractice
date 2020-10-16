package java1016;

public class UserPractice {
	
	// 인스턴스 생성
	// 프로그램 내에서 인스턴스를 1개만 만드는 경우
	// 인스턴스 이름을 클래스 이름으로 하는데 첫글자를 소문자로 변경 
	// User() 는 생성자를 호출하는 것 
	private String data;
	private String rice;
	private String side;
	private String soup;
	private Double cal;
	
	// 매개변수가 없는 생성자
	public UserPractice() {
		// System.out.printf("매개변수가 없는 생성자 \n");
	}
	
	// 생성자 오버로딩 매개변수가 있음 
	public UserPractice(String data, String rice, String side, 
			String soup, Double cal) { // 위에 동일한 이름이 있어서 에러가 뜸 
		// 매개변수 작성하면 오류 안뜸 
		// this가 붙지 않은 변수는 메소드내에서 부터 찾고 없으면 자신의 클래스에서 찾음
		// this가 붙으면 메소드 내에서는 찾지 않고 클래스에서 찾음
		this.data = data; // 앞 data는 맨 위에서, 뒤 data는 바로 위에
		this.rice = rice;
		this.side = side;
		this.soup = soup;
		this.cal = cal; 
		
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getSoup() {
		return soup;
	}
	public void setSoup(String soup) {
		this.soup = soup;
	}
	public Double getCal() {
		return cal;
	}
	public void setCal(Double cal) {
		this.cal = cal;
	}
	
	@Override
	public String toString() {
		return "UserPractice [data=" + data + ", rice=" + rice + ", side=" + side + ", soup=" + soup + ", cal=" + cal
				+ "]";
		
	}
}