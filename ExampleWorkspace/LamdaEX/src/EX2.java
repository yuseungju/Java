//�͸� Ŭ������ ������ ȣ����� �Ǵ°�� ���ٽ����� �����ϰ� ǥ�� 
//implement�ؾߵ� �Լ��� �ΰ��� ���Ұ���  (�Լ��� �����ǹǷ� �ϳ��϶��� �� �� ����)
public class EX2 {

	public interface SupInterface{
		String desc = "class����"; 
		void getFun1();
	}
	public static void main(String[] args) {
		//1. �͸�class�� ������ �ν��Ͻ� 
		SupInterface sub1 = new SupInterface() {
			@Override
			public void getFun1() {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ���� ����");
			}
	    };
	    sub1.getFun1();
	    
	    //2.���ٽ� �̿� 
	    //������ ǥ�� : �Լ���, new
	    SupInterface sub2 = () -> System.out.println("���ٽ� ���");
	    sub2.getFun1();
		
		
	}

}
