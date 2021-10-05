import java.util.Collections;

//익명 클래스를 여러번 호출햐야 되는경우 람다식으로 간결하게 표현 
//implement해야될 함수가 두개면 사용불가함  (함수명 생략되므로 하나일때만 알 수 있음)
public class EX2 {

	public interface SupInterface{
		String desc = "class정의"; 
		void getFun1();
	}
	public static void main(String[] args) {
		//1. 익명class로 정의후 인스턴스 
		SupInterface sub1 = new SupInterface() {
			@Override
			public void getFun1() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스 정의");
			}
	    };
	    sub1.getFun1();
	    
	    //2.람다식 이용 
	    //생략된 표현 : 함수명, new
	    SupInterface sub2 = () -> System.out.println("람다식 사용");
	    sub2.getFun1();
	    
		
	}

}
