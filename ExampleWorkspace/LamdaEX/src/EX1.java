//인스턴스 단 한개로 생성할떄, 익명클래스 사용해도됨 
//클래스 정의후 여러번 인스턴스 필요하면, 클래스 정의 해놓는게 낫다고 생각 
public class EX1 {

	public interface SupInterface{
		String desc = "class정의";
		void getFun1();
	}
	public static void main(String[] args) {
	
		//1. class정의후 인스턴스 
		class SubClass implements SupInterface{
			@Override
			public void getFun1() {
				System.out.println(desc);
			}
		}
		SubClass sub1 = new SubClass();
		sub1.getFun1();
		SubClass sub2 = new SubClass();
		sub2.getFun1();
		
		
		//2. 익명class로 정의후 인스턴스 
		SupInterface sub3 = new SupInterface() {
			@Override
			public void getFun1() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스 정의");
			}
	    };
	    sub3.getFun1();
		
		
	}

}
