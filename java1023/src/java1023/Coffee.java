package java1023;

public class Coffee {
	
	// error 해결할때 밑줄 대보기 
	private int num;
	private String day;
	private String name;
	private int shot;
	private int ml;
	private double cal;
	
	// 접근자 메소드 생성 - 제네레이트 게터 앤 섹터
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShot() {
		return shot;
	}
	public void setShot(int shot) {
		this.shot = shot;
	}
	public int getMl() {
		return ml;
	}
	public void setMl(int ml) {
		this.ml = ml;
	}
	public double getCal() {
		return cal;
	}
	public void setCal(double cal) {
		this.cal = cal;
	}
	
	// Generate toString()
	
	@Override
	public String toString() {
		return "Coffee [num=" + num + ", day=" + day + ", name=" + name + ", shot=" + shot + ", ml=" + ml + ", cal="
				+ cal + "]";
	}
}