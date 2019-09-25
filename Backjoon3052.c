#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a[10], b[10], i, j, count = 0, count2 = 0;
	int num1 = 0, num2 = 0, c[10];

	for(i = 0; i<10; i++)
		scanf("%d ", &a[i]);

	for(i = 0; i<10; i++)
		b[i] = -1;

	for(i = 0; i<10; i++){
		b[i] = (a[i]%42);
		num1 = 0;
		for(j=0; j<10; j++){
			if(b[j] != b[i])
				num1++;
		}
		if(num1 == 9)
			num2++;
	}

	printf("%d", num2);
	return 0;
	
}