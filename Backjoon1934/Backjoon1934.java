package Backjoon1934;

import java.util.*;
/*
 * ����: �ּҰ���� ���ϱ�
 * �Է�: ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
 * ��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)
 * ����: ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.
 */
public class Backjoon1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		int[] numarray = new int[num];
		for(int i=0; i<num; i++) {
			int num1 = stdin.nextInt();
			int num2 = stdin.nextInt();
			int num3 = 0;
			int k= 1;
			boolean check = false;
			while(!check) {
				num3 = num1*k;
				if(num3%num2 == 0) {
					check = true;
					numarray[i] = num3;
				}
				k++;
			}
		}// for
		
		for(int i=0; i<num; i++)
			System.out.println(numarray[i]);
	}// main
	
}// class
