package Backjoon1037;
/*
 * ����: ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. 
 *      � �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� N�� ��¥ ����� ������ �־�����. �� ������ 50���� �۰ų� ���� �ڿ����̴�. 
 * 		��° �ٿ��� N�� ��¥ ����� �־�����. 1,000,000���� �۰ų� ����, 
 * 		2���� ũ�ų� ���� �ڿ����̰�, �ߺ����� �ʴ´�.
 * ���: ù° �ٿ� N�� ����Ѵ�. N�� �׻� 32��Ʈ ��ȣ�ִ� ������ ǥ���� �� �ִ�.
 */
import java.util.*;

public class Backjoon1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();
		int[] num2 = new int[num1];
		
		for(int i=0; i<num1; i++) {
			num2[i] = stdin.nextInt();
		}
		Arrays.sort(num2);
		System.out.println(num2[0]*num2[num1-1]);
		
	}

}
