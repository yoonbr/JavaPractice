package java1023;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("0");
		al.add("2");

		LinkedList<String> li = new LinkedList<String>();

		li.add("0");
		li.add("2");

		// LinkedList에 전체 데이터를 읽기 
		long start = System.nanoTime();
		for (int i = 0; i < 1000000; i = i + 1) {
			li.get(i);
		}

		long end = System.nanoTime();
		System.out.printf("LinkedList:%d\n", (end - start));

		// ArrtyList에 전체 데이터를 읽기 
		long start1 = System.nanoTime();
		for (int j = 0; j < 1000000; j = j + 1) {
			al.get(j);
		}

		long end1 = System.nanoTime();
		System.out.printf("ArrayList:%d\n", (end1 - start1));
		
	}
}
