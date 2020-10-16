package java1016;

public class UserPractice1Main {

	public static void main(String[] args) {
		
		UserPractice [] users = new UserPractice [3];
		
		users[0] = new UserPractice("10월 17일", "잡곡밥", "깍두기, 갈비찜, 멸치조림", "김치찌개", 576.3);
				//자신이 만든 생성자에 맞게 입력 
		users[1] = new UserPractice("10월 18일", "옥수수밥", "열무김치, 순살치킨, 연근조림", "닭곰탕", 505.1);
		
		UserPractice user = new UserPractice();
		user.setData("10월 19일");
		user.setRice("쌀밥");
		user.setSide("무생채, 시금치나물, 고기볶음, 당근볶음, 콩나물");
		user.setSoup("된장국");
		user.setCal(603.2);
		// 앞에 들어가는거 주의해서 사용 
		
		users[2] = user;
		
		// 배열의 모든데이터에 접근해서 출력
		for(UserPractice temp : users) {
		System.out.println(temp);
		}

	}
}
