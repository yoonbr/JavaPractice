package java1007;

public class Practice {
	
	public static void main(String[] args) {

		//하나로 표현해야 하는 데이터를 생각해보고
		//그 데이터를 저장할 수 있는 변수를 만들어서
		//데이터를 저장하고 원하는 포맷으로 출력
				
		//당구선수 데이터를 저장
	    //당구선수일련번호(문자열) p001
		//당구선수이름(문자열)
		//당구선수랭킹(정수)
		//상금총액(정수)
		//국적(문자열)
		
		//데이터 생성
		int rank1 = 1;
		String name1 = "이미래";
		int win1 = 6;
		int lose1 = 4;
		double avg1 = 0.957;
		int highrun1 = 6;
		
		int rank2 = 2;
		String name2 = "김가영";
		int win2 = 6;
		int lose2 = 4;
		double avg2 = 0.911;
		int highrun2 = 8;
		
		// 업무 처리
		
		//화면 출력
				System.out.printf(
					"%-5s%-10s%-3s%-3s%-7s%-3s\n",
					"순위", "이름", "승", "패","평균","HR");
				System.out.printf(
						"%5d%-10s%3d%3d%7.3f%3d\n",
						rank1, name1, win1, lose1,
						avg1, highrun1);
				System.out.printf(
						"%5d%-10s%3d%3d%7.3f%3d\n",
						rank2, name2, win2, lose2,
						avg2, highrun2);
		
	}
}
