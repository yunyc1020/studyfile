package Backjoon10809;

import java.util.*;

/*
 * ����:���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� 
 *     ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *     
 * �Է�:ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * ���:������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� 
 *     ��ġ�� �������� �����ؼ� ����Ѵ�.����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. 
 *     �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
 */

public class Backjoon10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String str1 = stdin.next(); 
		String [] str2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String [] str3 = new String[str1.length()];
		str3 = str1.split("");
		
		for(int j=0; j<26; j++) {
			for(int i=0; i<str1.length(); i++) {				
				if(str2[j].equals(str3[i])) {					
					System.out.print(i+" ");
					break;
				}
				if(i == str1.length()-1) {
					System.out.print("-1 ");
				}
			}
		}
		
	}
	
}
