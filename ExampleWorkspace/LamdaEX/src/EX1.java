//�ν��Ͻ� �� �Ѱ��� �����ҋ�, �͸�Ŭ���� ����ص��� 
//Ŭ���� ������ ������ �ν��Ͻ� �ʿ��ϸ�, Ŭ���� ���� �س��°� ���ٰ� ���� 
public class EX1 {

	public interface SupInterface{
		String desc = "class����";
		void getFun1();
	}
	public static void main(String[] args) {
	
		//1. class������ �ν��Ͻ� 
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
		
		
		//2. �͸�class�� ������ �ν��Ͻ� 
		SupInterface sub3 = new SupInterface() {
			@Override
			public void getFun1() {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ���� ����");
			}
	    };
	    sub3.getFun1();
		
		
	}

}
