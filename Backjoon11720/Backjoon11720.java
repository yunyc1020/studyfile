package Backjoon11720;

import java.util.*;

/*
 *����: N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *�Է�: ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 *���: �Է����� �־��� ���� N���� ���� ����Ѵ�.
 */
public class Backjoon11720 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		String num2 = stdIn.next();
		int sum = 0;		
		
		for(int i=0; i<num; i++) {
			sum += num2.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
