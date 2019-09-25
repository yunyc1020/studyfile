#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
	int num, count = 0;
	scanf("%d", &num);
	int a1, a2, a3, a4; 
	a4 = num;
	
	while(1){
		a1 = a4/10;
		a2 = a4%10;
		a3 = a1+a2;
		a4 = a2*10 + a3%10;
		count++;
		if(num == a4)
			break;
	}	

	printf("%d", count);


	return 0;
}