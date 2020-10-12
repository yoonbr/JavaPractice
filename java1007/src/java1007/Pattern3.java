package java1007;

public class Pattern3 {

		public static void main(String[] args) {
			//초를 받아서 몇 시간 몇 분 몇 초인지 출력하기
			int s = 4700;
			int hour = (s/3600);
			int minute = (s - (hour*3600))/60;
			int second = (s - (hour*3600) - (minute*60))/1;
			System.out.printf("%2d시간%2d분%2d초", hour, minute, second);
			
			{
				int s1 = 4700;
				int hour1 = s / 3600; //1시간 = 3600초
				int minute1 = (s - hour * 3600)/60; //시간은 빼고 나머지를 60으로 나눔
				//int second1 = (s - hour * 3600 - minute * 60); 
				int second1 = s % 60; // 4700에서 시간, 분 뺀 나머지 20이므로 60으로 나누면 나머지 20 
				// 해당 방식으로 진행하면 계산이 편리해짐. 
				System.out.printf("%2d시간%2d분%2d초", hour1, minute1, second1);
		}
	}
}
