import java.io.IOException;
import java.util.ArrayList;

//입력값 루프없이 받기 
public class EX6 {

	public static void main(String[] args) throws IOException {
		//1.map() 리스트 변환 출력 
		//  forEach() 리스트 순회 
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("B");
		list1.stream()
            .map(str1 -> str1.toUpperCase()) //대문자 
            .forEach(str2 -> System.out.println("list1 - map : " + str2));

		//2.filter() 리스트 조건 필터링 
		//  forEach() 리스트 순회 
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.stream()
			.filter(i -> i > 1)
			.forEach(j -> System.out.println("list2 - filter : " + j));

		//3.reduce() 재귀호출 
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(11);
		list3.add(22);
		list3.add(33);
		int rst3 = list3.stream().reduce(0, (a,b) -> a+b );
		System.out.println("list3 - reduce : " + rst3);
		
	}

}
