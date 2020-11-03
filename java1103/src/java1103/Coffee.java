package java1103;

public class Coffee {
	
	private int num;
	private String name;
	private String Milk;
	private int cal;
	
	// 비어있는 생성자, 필드를 사용하는 생성자 생성 
	// getter setter , toString 
	
	public Coffee() {
		super();
	}
	
	public Coffee(int num, String name, String milk, int cal) {
		super();
		this.num = num;
		this.name = name;
		Milk = milk;
		this.cal = cal;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMilk() {
		return Milk;
	}

	public void setMilk(String milk) {
		Milk = milk;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	@Override
	public String toString() {
		return "Coffee [num=" + num + ", name=" + name + ", Milk=" + Milk + ", cal=" + cal + "]";
	}
}

