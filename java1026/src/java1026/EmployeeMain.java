package java1026;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// Employee 인스턴스 여러 개를 저장할 수 있는
		// List를 생성

		ArrayList<Employee> list = new ArrayList<Employee>();

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

		// 정렬 기준을 설정할 변수
		boolean flag = false;// 반복문 안에 있으면 계속 반복하기때문에 false가 되어버림

		// 무한반복
		while (true) {
			try {
				// 전체보기
				// 개수를 지정해서 보기
				// 이름으로 정렬해서 보기
				// 이름으로 검색해서 보기
				// 종료
				System.out.printf("1.전체 보기 2.개수 지정 3.이름으로 정렬 4.이름으로 검색 5.종료 \n");
				System.out.printf("메뉴 선택 : ");
				int menu = sc.nextInt();

				// menu가 1번부터 5번 사이인지 확인
				// 아닐 때는 다시 입력받도록 작성
				// 메뉴가 1보다 작거나(||) 5보다 크다면
				if (menu < 1 || menu > 5) {
					System.out.printf("메뉴 번호를 1~5 사이로 입력하세요 : \n");
					continue; // 맨 위로 이동시키고 싶은데 아래 메소드가 또 있을경우 작성
				}

				switch (menu) {
				case 1:
					System.out.printf("전체 보기\n");
					for (Employee m : list) {
						System.out.printf("%s\n", m);
					}
					break;
				case 2:
					// 출력 할 개수 입력받기
					while (true) {
						try {
							System.out.printf("출력할 개수를 입력하세요: \n");
							int cnt = sc.nextInt();

							// 데이터 개수 확인
							// 1보다 작거나 데이터 개수보다 크면 데이터 개수로 설정
							if (cnt < 1 || cnt > list.size()) {
								System.out.printf("음수나 데이터 개수보다 큰 수를 입력하면" + " 데이터 개수를 설정합니다.: \n");
								cnt = list.size();
							}

							// cnt 만큼 데이터를 가져와서 출력
							// 빠른열거는 부분적 데이터를 가져올 때는 사용할 수 없음.
							// 무조건 전체 데이터를 순회할때만 사용
							
							for (int i = 0; i < cnt; i = i + 1) {
								// 출력할 때 인스턴스를 바로 출력하는 경우는
								// toStirng이라는 메소드가 호출되어 그 결과를 출력하는 것.
								// toString이 재정의 되어있지 않으면
								// 클래스이름과 해시코드가 문자열로 리턴
								// 프로그래밍 언어마다 이 메소드의 이름은 다르므로
								// 프로그래밍 언어를 공부할 때 이러한 메소드의 이름을 알아둘 필요가 있음
								System.out.printf("%s\n", list.get(i));
							}
							break;
						} catch (Exception e) {
							System.out.printf("데이터의 개수를 숫자로 입력하세요\n");
							// 숫자 입력 뒤의 문자열을 제거하기 위해서
							sc.nextLine();
							continue;
						}
					}

				case 3:
					System.out.printf("이름으로 정렬\n");
					if (flag == false) {
						list.sort(new Comparator<Employee>() {

							@Override
							public int compare(Employee o1, Employee o2) {
								return o1.getName().compareTo(o2.getName());
							}

						});
					} else {

						list.sort(new Comparator<Employee>() {

							@Override
							public int compare(Employee o1, Employee o2) {
								return o2.getName().compareTo(o1.getName());
							}

						});

					}

					// 전체 데이터 출력
					for (Employee e : list) {
						System.out.printf("%s\n", e);
					}
					flag = !flag; // flag의 값을 변경

					break;
				case 4:
					// 검색할 이름을 입력받기
					sc.nextLine();
					// *문자열은 항상 주의* 숫자열 뒤 문자열 받을땐 항상 한번 더
					// 입력문 작성해줘야함
					System.out.printf("검색할 이름을 입력하세요:\n");
					String name = sc.nextLine();

					// 검색된 결과를 저장할 List instance 생성
					ArrayList<Employee> searchList = new ArrayList<Employee>();

					// 순회
					for (Employee e : list) {
						// 일치하는 것은 equals로 비교해서 동일한 데이터를 찾으면
						// searchList에 추가
						/* 완전일치 
						if (e.getName().equals(name)) {
							searchList.add(e);
						} */
						
						// name이 포함되어 있으면 조회. 이걸 더 많이 사용함 
						if (e.getName().indexOf(name) >= 0) { // 음수 indexOf 왜 사용?
							searchList.add(e);
						}
					}
					if(searchList.size() == 0) { //searchlist사이즈가 0이면
						System.out.printf("검색된 데이터가 없습니다.\n");
			
					} else {
					// 검색 결과 출력
					for (Employee e : searchList) {
						System.out.printf("%s\n", e);
						}
					}
					break;
					
				case 5:
					// System.out.printf("프로그램 종료\n");
					System.out.printf("프로그램을 종료합니다. \n");

					// 종료하기 전 스캐너 정리
					sc.close();
					System.exit(0);
					break;
				// 프로그램 종료하며 반복문도 같이 종료됨

				default:
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
