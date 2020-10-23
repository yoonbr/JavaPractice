package java1023;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// Employee 인스턴스 여러 개를 저장할 수 있는
		// List를 생성
		
		ArrayList <Employee> list = new ArrayList <Employee>();
		
		// 샘플 데이터 삽입
		Employee employee = new Employee();
		employee.setName("가가");
		employee.setPosition("학생");
		employee.setOffice("경기");
		employee.setAge(28);		
		list.add(employee);
		
		// 두번째 인스턴스 생성 부터는 클래스 이름 작성 안해도 됨**  
		employee = new Employee(); 
		employee.setName("나나");
		employee.setPosition("직장인");
		employee.setOffice("서울");
		employee.setAge(27);		
		list.add(employee);
		
		employee = new Employee();
		employee.setName("다다");
		employee.setPosition("군인");
		employee.setOffice("강릉");
		employee.setAge(24);		
		list.add(employee);
		
		employee = new Employee();
		employee.setName("라라");
		employee.setPosition("주부");
		employee.setOffice("청주");
		employee.setAge(20);		
		list.add(employee);
		
		employee = new Employee();
		employee.setName("마마");
		employee.setPosition("직장인");
		employee.setOffice("청주");
		employee.setAge(30);		
		list.add(employee);
		
		// 스캐너 삽입 
		Scanner sc = new Scanner(System.in);
		
		// 무한반복
		while(true) {
			try {
			// 전체보기
			// 개수를 지정해서 보기
			// 이름으로 정렬해서 보기
			// 이름으로 검색해서 보기
			// 종료
			System.out.printf("1.전체 보기 2.개수 지정 3.이름으로 정렬 4. 이름으로 검색 5. 종료 \n");
			System.out.printf("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			// menu가 1번부터 5번 사이인지 확인
			// 아닐 때는 다시 입력받도록 작성
			// 메뉴가 1보다 작거나(||) 5보다 크다면 
			if (menu < 1 || menu > 5) {
				System.out.printf("메뉴 번호를 1~5 사이로 입력하세요 : \n");
				continue; // 맨 위로 이동시키고 싶은데 아래 메소드가 또 있을경우 작성 
			}
			
			switch(menu) { 
			case 1 :
				System.out.printf("전체 보기\n");
				for (Employee m : list) {
					System.out.printf("%s\n", m);
				}
				break;
			case 2 : 
				System.out.printf("개수 지정\n");
				break;
			case 3 : 
				System.out.printf("이름으로 정렬\n");
				break;
			case 4 : 
				System.out.printf("이름으로 검색\n");
				break;
			case 5 :
				// System.out.printf("프로그램 종료\n");
				System.out.printf("프로그램을 종료합니다. \n");
				
				// 종료하기 전 스캐너 정리
				sc.close();
				System.exit(0);
				break;
				// 프로그램 종료하며 반복문도 같이 종료됨 
				
			default : 
				System.out.printf("잘못된 메뉴! \n");
				break;
			}
			
			// 숫자를 치면 넘어가지만 문자를 치면 넘어가지 않음 
			// 문자열을 입력해도 넘어가게 하고 싶으면 ? 예외처리를 해줌 
			} catch (Exception e) {
				sc.nextLine(); // 예외처리를 한 후 자동으로 넘어감
				// 무한반복되므로 nextLine 넣어줌 
				System.out.printf("메뉴는 정수로 입력하세요\n");
			}
		}
	
	}
}


















