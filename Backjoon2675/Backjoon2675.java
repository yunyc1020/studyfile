package Backjoon2675;

import java.util.*;
/*
 * ����: ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�: 2
 *      3 ABC
 *      5 /HTP 
 * ���: AAABBBCCC
 *      /////HHHHHTTTTTPPPPP    
 */
public class Backjoon2675 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int number = stdin.nextInt();
		String str4 = "";
		
		for(int i = 0; i<number; i++) {
			int number2 = stdin.nextInt();
			String str = stdin.next();
			String [] str3 = new String[str.length()];
			str3 = str.split("");
			for(int j=0; j < str.length(); j++) {
				for(int k=0; k<number2; k++){
					str4 += str3[j];
				}//for k
			}//for j
			str4 += "\n";
		}//for i
		System.out.println(str4);
	}// main
}// class
