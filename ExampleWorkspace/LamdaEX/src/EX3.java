//람다식 사용하여, 함수 구현 + 인스턴스생성 
public class EX3 {

	public interface maxInt{
		void sum(int a, int b);
	}
	public static void main(String[] args) {
		
	    int num1 = 2;
	    int num2 = 10;
	    //n1,n2는 자료형 생략하며, n1,n2는 num1,num2와 동일한 이름이 아님  
	    maxInt myclass = (n1, n2) -> System.out.println(n1 + n2);
	    myclass.sum(num1, num2); //n1,n2 의 파라미터로 매핑되어 함수 실행 
		
	}

}
