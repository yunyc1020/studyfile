package Backjoon1920;

import java.util.*;
/*
 * 문제: N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 자연수 N(1≤N≤100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
 *      다음 줄에는 M(1≤M≤100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 
 *      이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
 * 출력: M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
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
