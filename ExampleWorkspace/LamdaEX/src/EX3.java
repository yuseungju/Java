//���ٽ� ����Ͽ�, �Լ� ���� + �ν��Ͻ����� 
public class EX3 {

	public interface maxInt{
		void sum(int a, int b);
	}
	public static void main(String[] args) {
		
	    int num1 = 2;
	    int num2 = 10;
	    //n1,n2�� �ڷ��� �����ϸ�, n1,n2�� num1,num2�� ������ �̸��� �ƴ�  
	    maxInt myclass = (n1, n2) -> System.out.println(n1 + n2);
	    myclass.sum(num1, num2); //n1,n2 �� �Ķ���ͷ� ���εǾ� �Լ� ���� 
		
	}

}
