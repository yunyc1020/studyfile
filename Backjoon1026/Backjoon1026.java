package Backjoon1026;

import java.util.*;

/*
 * 문제:S = A[0]*B[0] + ... + A[N-1]*B[N-1]
 *     S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
 * 입력:첫째 줄에 N이 주어진다. 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 셋째 줄에는 B에 있는 수가 순서대로 주어진다. 
 * N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
 * 출력:첫째 줄에 S의 최솟값을 출력한다.
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
