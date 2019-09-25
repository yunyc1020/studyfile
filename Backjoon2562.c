#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
	int a[9], i, count =0;
	for(i = 0; i < 9; i++)
		scanf("%d", &a[i]);

	int num1 = a[0];
	for(i=0; i<9; i++){
		if(num1 < a[i]){
			num1 = a[i];
			count = i;
		}
	}

	printf("%d\n", num1);
	printf("%d", count+1);

	return 0;
}