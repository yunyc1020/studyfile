#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	
	if((a<b)&&(a<c)&&(b<c))
		printf("%d", b);
	else if((a<b)&&(b>c)&&(a<c))
		printf("%d", c);
	else if((a>b)&&(b<c)&&(a<c))
		printf("%d", a);
	else if((a<b)&&(b>c)&&(a>c))
		printf("%d", a);
	else if((a>b)&&(b<c)&&(a>c))
		printf("%d", c);
	else if((a>b)&&(b>c)&&(a>c))
		printf("%d", b);
			
	if((a==b)&&(a==c)&&(b==c))
		printf("%d", a);		
	else if((a!=b)&&(a!=c)&&(b==c))
		printf("%d", b);
	else if((a!=b)&&(a==c)&&(b!=c))
		printf("%d", a);	
	else if((a==b)&&(a!=c)&&(b!=c))
		printf("%d", b);	
	
	
	return 0;
}
