//���� Ȱ�� ������ 

public class EX5 {
 
	public static void main(String[] args) {
		//���1. Ŭ���� ������ �������� 
		class MyRun implements Runnable{
			@Override
			public void run() {
				// TODO Auto-generated method stub
	            for (int i = 0; i < 1000; i++) {
	                System.out.println(Thread.currentThread());
	            }
			}
		}
		MyRun rn1 = new MyRun();
        Thread thread1 = new Thread(rn1);
        thread1.setName("11111111111");
        thread1.start();
        
        
        //���2. ���ٽ� �̿� ������ 
		Runnable rn2 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread());
            }
        };
        Thread thread2 = new Thread(rn2);
        thread2.setName("2222222222222222222");
        thread2.start();
	}

}
