package java1102;

// DTO 클래스 생성 
public class Coffee {
	private String name;
	private int ml;
	private int cal;
	
	public Coffee(String name, int ml, int cal) {
		super();
		this.name = name;
		this.ml = ml;
		this.cal = cal;
	}
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", ml=" + ml + ", cal=" + cal + "]";
	}

}
