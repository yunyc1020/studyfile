package Backjoon1934;

import java.util.*;
/*
 * 문제: 최소공배수 구하기
 * 입력: 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 * 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
 * 츨력: 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
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
