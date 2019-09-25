#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
	int num, i, min, max;
	scanf("%d", &num);
	
	int a[num];
	for(i=0; i<num; i++)
		scanf("%d ", &a[i]);

	int num1, num2;
	num1 = a[0];
	num2 = a[0];
	for(i=0; i<num; i++){
		if(num1<a[i]){
			num1 = a[i];
		}
		if(num2>a[i]){
			num2 = a[i];
		}
	}

	printf("%d %d", num2, num1);

	return 0;
}