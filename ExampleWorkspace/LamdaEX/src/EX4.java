//람다식 사용 유의 어노테이션 
//이미 사용되고 있는 코드들의 오류를 미리 파악하기 위해, 인터페이스 함수 추가시 오류 필요 
// -> @FunctionalInterface 어노테이션사용 하여, 인터페이스에 함수 2개인 경우 컴파일 오류 발생 

//아래 주석 해제하면 오류 확인가능
/*  
public class EX4 {

	//인터페이스 수정하는 개발자 1 
	//인터페이스 개발자가 함수추가 불가하다는 것을 인지못함
	public interface maxInt1{
		void sum(int a, int b);
		void mul(int a, int b); //오류 부분 
	}
	
	//인터페이스 수정하는 개발자 1 
	//인터페이스 개발자가 함수추가 불가하다는 것을 인지할 수 있음(인터페이스명 빨간줄)
	@FunctionalInterface
	public interface maxInt2{
		void sum(int a, int b);
		void mul(int a, int b); //오류 부분 
	}
	
	
	//이미 사용되고 있는 개발자들의 코드에서는 함수추가로 오류 가능 
	public static void main(String[] args) {
		
		//람다식 사용하여, 함수 구현 + 인스턴스생성 
	    int num1 = 2;
	    int num2 = 10;
	    //n1,n2는 자료형 생략하며, n1,n2는 num1,num2와 동일한 이름이 아님  
	    maxInt1 myclass = (n1, n2) -> System.out.println(n1 + n2);
	    myclass.sum(num1, num2); //n1,n2 의 파라미터로 매핑되어 함수 실행 
		
	}

}

*/