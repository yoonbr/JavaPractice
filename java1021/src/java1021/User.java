package java1021;

public class User implements Cloneable{
	
	private int num;
	private String name; // 제네레이트 게터앤세터 실행 
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

	// num과 name의 값이 같으면 동일한 것으로 간주하도록 하는 메소드
	// 숫자 데이터와 boolean 은 == 로 비교하고 
	// 그ㅣ외의 자료형은 equals로 내용 비교 
	public boolean equals(User user) {
			if(this.num == user.num && this.name.equals(user.name)) {
				return true;
			}else{
					return false; 
			}
	}
	
	// 인스턴스 자신의 내용을 복제해서 리턴하는 메소드
	public User clone() {
			// 새로운 인스턴스를 생성하고 현재 인스턴스의 내용을 복제
			User user = new User();
			user.num = this.num;
			user.name = this.name;
			return user;
	}

	//제네레이트 투스트링 
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + "]";
		
	}
}


