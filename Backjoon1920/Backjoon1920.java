package Backjoon1920;

import java.util.*;
/*
 * ����: N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��, �� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� �ڿ��� N(1��N��100,000)�� �־�����. ���� �ٿ��� N���� ���� A[1], A[2], ��, A[N]�� �־�����. 
 *      ���� �ٿ��� M(1��M��100,000)�� �־�����. ���� �ٿ��� M���� ������ �־����µ�, 
 *      �� ������ A�ȿ� �����ϴ��� �˾Ƴ��� �ȴ�. ��� ������ ������ -231 ���� ũ�ų� ���� 231���� �۴�.
 * ���: M���� �ٿ� ���� ����Ѵ�. �����ϸ� 1��, �������� ������ 0�� ����Ѵ�.
 */
public class Backjoon1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();	
		int[] numarray = new int[num1];
		for(int i=0; i<num1; i++)
			numarray[i] = stdin.nextInt();	
		
		int num2 = stdin.nextInt();
		int[] numarray2 = new int[num2];
		for(int i=0; i<num2; i++)
			numarray2[i] = stdin.nextInt();		
		
		
		for(int i=0; i<num2; i++) {
			int checknum = numarray2[i];
			boolean check = true;
			for(int j=0; j<num1; j++) {
				if(numarray[j] == checknum) {
					check = false;
					break;
				}//if - else
			}//for j	
			if(!check) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}//if-else
		}//for i	
	}//main
	
}//class
