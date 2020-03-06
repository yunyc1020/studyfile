package Backjoon1026;

import java.util.*;

/*
 * ����:S = A[0]*B[0] + ... + A[N-1]*B[N-1]
 *     S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �� �ȴ�.
 * �Է�:ù° �ٿ� N�� �־�����. ��° �ٿ��� A�� �ִ� N���� ���� ������� �־�����, ��° �ٿ��� B�� �ִ� ���� ������� �־�����. 
 * N�� 50���� �۰ų� ���� �ڿ����̰�, A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.
 * ���:ù° �ٿ� S�� �ּڰ��� ����Ѵ�.
 */

public class Backjoon1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();
		int [] A = new int[num1];
		int [] B = new int[num1];
		int sum = 0;
		
		for(int i=0; i<num1; i++) {
			A[i] = stdin.nextInt();		
		}
		for(int i=0; i<num1; i++) {
			B[i] = stdin.nextInt();			
		}
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<num1; i++) {
			sum += A[i]*B[num1-1-i];
		}
		
		System.out.println(sum);
	}// main

}// class
