package chapter13;

public class ThreadEx4 {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 500; i++)
			System.out.printf("%s", new String("-"));

		System.out.print("�ҿ�ð� 1:" + (System.currentTimeMillis() - startTime));
		
		System.out.println();
		
		for (int i = 0; i < 500; i++)
			System.out.printf("%s", new String("|"));

		System.out.print("�ҿ�ð� 2:" + (System.currentTimeMillis() - startTime));
	}
}