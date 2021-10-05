import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.stream.Collectors;import org.omg.Messaging.SyncScopeHelper;

//�Է°� �������� �ޱ� 
public class EX7 {

	public static void main(String[] args) throws IOException {
		//ex1. ���ڿ� ����Ʈ �߿���, ���̰� 5�̻� 10������ ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��� 
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1a");
		list1.add("1bb");
		list1.add("1ccc");
		list1.add("1dddd");
		list1.add("1eeeee");
		list1.add("1ffffff");
		list1.add("1ggggggg");
		list1.stream()
			.filter(str1 -> str1.length() >= 5 && str1.length() <= 10 ) //���̰� 5�̻� 10������ ���ڿ� filter 
			.map(str2 -> str2.toUpperCase())
			.forEach( str -> System.out.println(str) );
		

		//ex2. �Է¹޴� �����߿���, ���̰� 5�̻� 10������ ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��� 
		//* test ȯ��  �̸� ���� - ��������(�����غ�)
		OutputStream output = new FileOutputStream("C:/Test.txt");
		output.write("2a\n".getBytes());
		output.write("2bb\n".getBytes());
		output.write("2ccc\n".getBytes());
		output.write("2dddd\n".getBytes());
		output.write("2eeeee\n".getBytes());
		output.write("2ffffff\n".getBytes());
		output.write("2gggggg\n".getBytes());
		//�ý��� �Է¹������ �Ʒ��� ���� ���͸�
		BufferedReader br = new BufferedReader(new FileReader("C:/Test.txt"));
		br.lines()
			.filter(str1 -> str1.length() >= 5 && str1.length() <= 10 ) 
			.map(str1 -> str1.toUpperCase())
			.forEach( str2 -> System.out.println(str2) );
        
	}

}
