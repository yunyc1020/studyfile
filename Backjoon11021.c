#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n, i;
	scanf("%d", &n);
	
	int a[n-1], b[n-1];
	for(i=0;i<n;i++){
		scanf("%d %d", &a[i], &b[i]);
	}
	
	for(i=0;i<n;i++){
		printf("Case #%d: %d\n", i+1, a[i]+b[i]);
	}
	
	return 0;
}
