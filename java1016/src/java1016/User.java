package java1016;

public class User {
	
	private int num;
	private String id;
	private String pw;
	private String nickname;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	// 출력하는 메소드에 인스턴스 이름을 대입하면 자동으로 호출되는 메소드
	// 인스턴스 내부의 값을 빠르게 확인할 목적으로 생성 
	public String toString() {
		return "User [num=" + num + ", id=" + id + ", pw=" + pw + ", nickname=" + nickname + ", name=" + name + "]";
	
	}
}
