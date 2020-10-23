package java1023;

import java.util.PriorityQueue;
import java.util.Stack;

public class ListPractice {

	public static void main(String[] args) {
		
		// 문자열 스택을 생성
		Stack <String> stack = new Stack<String>();
		
		// 데이터 5개를 추가
		stack.push("Java");
		stack.push("Data Base");
		stack.push("Web Prigramming");
		stack.push("Andriod");
		stack.push("iOS");
		
		// 마지막에 삽입한 2개의 데이터를 출력
		System.out.printf("%s\n", stack.pop()); // 맨 마지막 데이
		System.out.printf("%s\n", stack.pop()); // 그다음 데이터 
		
		// 우선순위 큐를 생성해서 데이터를 삽입 
		// 우선순위 큐는 데이터를 정렬해서 저장하는 큐 
		// 실제 정렬하는 것이 데이터를 꺼낼 때 정렬 
		// poll을 하게되면 정렬을 한 것 처럼 꺼냄
		
		// 정수 PriorityQueue 인스턴스 생성 
		PriorityQueue<Integer> queue = new PriorityQueue<Integer> ();
		
		// 데이터 추가 
		queue.add(89);
		queue.add(32);
		queue.add(100);
		
		// 전체 데이터를 출력 - 
		System.out.printf("%s\n", queue); // 정렬되어 나오지 않음 

		System.out.printf("%d\n", queue.poll()); // 이렇게 하면 데이터가 오름차순으로 나옴 
		System.out.printf("%d\n", queue.poll());
		System.out.printf("%d\n", queue.poll());

	}
}




















