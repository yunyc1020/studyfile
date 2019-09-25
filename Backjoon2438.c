#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n, i, j, count = 0;

	scanf("%d", &n);

	for(i = 0; i<n; i++){
		count++;
		for(j=0; j<count; j++){
			printf("*");
		}
		printf("\n");
	}	
	return 0;
}