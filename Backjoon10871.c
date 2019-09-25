#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n, x, i;
	scanf("%d %d", &n, &x);

	int a[n-1];
	for(i=0; i<n; i++){
		scanf("%d ", &a[i]);
	}

	for(i=0; i<n; i++){
		if(a[i] < x){
			printf("%d ", a[i]);
		}
	}

	return 0;
}