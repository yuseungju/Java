import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.stream.Collectors;import org.omg.Messaging.SyncScopeHelper;

//입력값 루프없이 받기 
public class EX7 {

	public static void main(String[] args) throws IOException {
		//ex1. 문자열 리스트 중에서, 길이가 5이상 10이하인 문자열을 대문자로 변환하여 출력 
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1a");
		list1.add("1bb");
		list1.add("1ccc");
		list1.add("1dddd");
		list1.add("1eeeee");
		list1.add("1ffffff");
		list1.add("1ggggggg");
		list1.stream()
			.filter(str1 -> str1.length() >= 5 && str1.length() <= 10 ) //길이가 5이상 10이하인 문자열 filter 
			.map(str2 -> str2.toUpperCase())
			.forEach( str -> System.out.println(str) );
		

		//ex2. 입력받는 값들중에서, 길이가 5이상 10이하인 문자열을 대문자로 변환하여 출력 
		//* test 환경  미리 세팅 - 파일저장(사전준비)
		OutputStream output = new FileOutputStream("C:/Test.txt");
		output.write("2a\n".getBytes());
		output.write("2bb\n".getBytes());
		output.write("2ccc\n".getBytes());
		output.write("2dddd\n".getBytes());
		output.write("2eeeee\n".getBytes());
		output.write("2ffffff\n".getBytes());
		output.write("2gggggg\n".getBytes());
		//시스템 입력받을경우 아래와 같이 필터링
		BufferedReader br = new BufferedReader(new FileReader("C:/Test.txt"));
		br.lines()
			.filter(str1 -> str1.length() >= 5 && str1.length() <= 10 ) 
			.map(str1 -> str1.toUpperCase())
			.forEach( str2 -> System.out.println(str2) );
        
	}

}
