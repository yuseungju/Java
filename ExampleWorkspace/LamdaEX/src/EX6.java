import java.io.IOException;
import java.util.ArrayList;

//�Է°� �������� �ޱ� 
public class EX6 {

	public static void main(String[] args) throws IOException {
		//1.map() ����Ʈ ��ȯ ��� 
		//  forEach() ����Ʈ ��ȸ 
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("B");
		list1.stream()
            .map(str1 -> str1.toUpperCase()) //�빮�� 
            .forEach(str2 -> System.out.println("list1 - map : " + str2));

		//2.filter() ����Ʈ ���� ���͸� 
		//  forEach() ����Ʈ ��ȸ 
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.stream()
			.filter(i -> i > 1)
			.forEach(j -> System.out.println("list2 - filter : " + j));

		//3.reduce() ���ȣ�� 
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(11);
		list3.add(22);
		list3.add(33);
		int rst3 = list3.stream().reduce(0, (a,b) -> a+b );
		System.out.println("list3 - reduce : " + rst3);
		
	}

}
