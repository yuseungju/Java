//���ٽ� ��� ���� ������̼� 
//�̹� ���ǰ� �ִ� �ڵ���� ������ �̸� �ľ��ϱ� ����, �������̽� �Լ� �߰��� ���� �ʿ� 
// -> @FunctionalInterface ������̼ǻ�� �Ͽ�, �������̽��� �Լ� 2���� ��� ������ ���� �߻� 
public class EX4 {

	//�������̽� �����ϴ� ������ 1 
	//�������̽� �����ڰ� �Լ��߰� �Ұ��ϴٴ� ���� ��������
	public interface maxInt1{
		void sum(int a, int b);
		void mul(int a, int b); //���� �κ� 
	}
	
	//�������̽� �����ϴ� ������ 1 
	//�������̽� �����ڰ� �Լ��߰� �Ұ��ϴٴ� ���� ������ �� ����(�������̽��� ������)
	@FunctionalInterface
	public interface maxInt2{
		void sum(int a, int b);
		void mul(int a, int b); //���� �κ� 
	}
	
	
	//�̹� ���ǰ� �ִ� �����ڵ��� �ڵ忡���� �Լ��߰��� ���� ���� 
	public static void main(String[] args) {
		
		//���ٽ� ����Ͽ�, �Լ� ���� + �ν��Ͻ����� 
	    int num1 = 2;
	    int num2 = 10;
	    //n1,n2�� �ڷ��� �����ϸ�, n1,n2�� num1,num2�� ������ �̸��� �ƴ�  
	    maxInt myclass = (n1, n2) -> System.out.println(n1 + n2);
	    myclass.sum(num1, num2); //n1,n2 �� �Ķ���ͷ� ���εǾ� �Լ� ���� 
		
	}

}