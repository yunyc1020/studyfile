#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a, b, c, d, e;
	int x, y;
	scanf("%d %d", &a, &b);
	c = b%10;
	x = b-c;
	d = (x%100)/10;
	e = (b/100);
	printf("%d \n", a*c);
	printf("%d \n", a*d);
	printf("%d \n", a*e);
	printf("%d \n", a*b);
	
	return 0;
}
