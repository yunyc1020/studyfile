#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
	int num, count = 0;
	scanf("%d", &num);
	int a1, a2; 
	a1 = num/10;
	a2 = num%10;
/*	while(1){
		int a1 = num/10;
		int a2 = num%10;
		int a3 = a1+a2;
		int a4 = a2*10 + a3%10;
		count++;
		if(num == a4){
			break;
		}
	}	

	printf("%d", count);
*/
	printf("%d %d", a1, a2);
	return 0;
}