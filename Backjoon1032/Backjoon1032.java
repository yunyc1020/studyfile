package Backjoon1032;

import java.util.*;
/*
 * ����: �˻������ �־����� �� ���ϰ���� ����ϴ� ����
 *      ������ ���� ������ �� ���ڸ�, �ٸ��� ?�� ��� 
 * �Է�: ù° �ٿ� ���� �̸��� ���� N�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �̸��� �־�����. 
 * 		N�� 50���� �۰ų� ���� �ڿ����̰� ���� �̸��� ���̴� ��� ���� ���̴� �ִ� 50�̴�. 
 * 		�����̸��� ���ĺ��� "." �׸��� "?"�θ� �̷���� �ִ�.
 * ���: ù° �ٿ� ������ ����ϸ� �ȴ�.
 */
public class Backjoon1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();
		int num2 = 0;
		int i, j, k = 0;
		String[][] str1 = new String[num1][];
		for(i=0; i<num1; i++) {
			String str2 = stdin.next();
			str1[i] = new String[str2.length()];
			str1[i] = str2.split("");
			num2 = str2.length();
		}
		for(i=0; i<num2; i++) {
			k = 0;
			String s = str1[0][i];
			for(j=0; j<num1; j++) {
				if(str1[j][i].equals(s)) {
					k++;
				}
			}
			if(k==num1) {
				System.out.print(s);
			}else {
				System.out.print("?");
			}
			
		}
				
	}//main

}//class
