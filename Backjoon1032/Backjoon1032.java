package Backjoon1032;

import java.util.*;
/*
 * 문제: 검색결과가 주어졌을 때 패턴결과를 출력하는 문제
 *      문자의 값이 같으면 그 문자를, 다르면 ?를 출력 
 * 입력: 첫째 줄에 파일 이름의 개수 N이 주어진다. 둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. 
 * 		N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다. 
 * 		파일이름은 알파벳과 "." 그리고 "?"로만 이루어져 있다.
 * 출력: 첫째 줄에 패턴을 출력하면 된다.
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
