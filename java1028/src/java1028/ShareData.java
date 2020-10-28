package java1028;

// Runnable 인터페이스를 implements를 해서 Thread에 사용할 수 있는 클래스로 만들기 
public class ShareData implements Runnable { //add un~~
	// public ShareData() 가 존재 - 다른 생성자를 만들면 소멸 
	
	// 인스턴스를 저장하기 위한 static 변수 선언 
	private static ShareData obj;
	
	// 생성자를 private 으로 만들어서 외부에서 생성자를 호출할 수 없도록 
	private ShareData() {

	}
	
	// 인스턴스가 없으면 생성해서 리턴하고 그렇지 않으면 그냥 리턴하는 
	// 인스턴스를 가져다가 사용할 수 있는 메소드 
	// sharedInstance라는 인스턴스로만 사용해야함 
	// 90, 1:15분 설명 다시 듣기 
	public static ShareData sharedInstance() {
		if(obj == null) {
			obj = new ShareData();
		}
		return obj;
	}
	
	// 공유 변수
	private int result; // 합계 저장할 변수 
	private int idx; // 1부터 1씩 증가할 인덱스 변수 
	
	// result 값을 return해주는 메소드 
	public int getResult() {
		return result;
	}
	
	// idx 값을 10000번 1씩 증가시키면서 result에 더해주는 메소드 
	// 동기화 - privat 메소드에 synchronized 삽입 하면 정상 값 출력됨 
	// 공유 자원 소유한 인스턴스를 synchronized로 묶어주면 공유도가 높아짐 
	private void sum(){
		for(int i = 0; i < 10000; i = i + 1) {
			synchronized(this) {
				idx = idx + 1;
			try {
				Thread.sleep(1);
			} catch(Exception e) {}
				result = result + idx;
			}
		}
	}

	// Thread로 동작할 메소드가 만들어짐 
	@Override
	public void run() {
		sum();
		
	}
}















