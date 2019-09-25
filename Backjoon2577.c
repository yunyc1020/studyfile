#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
	int a1, a2, a3;
	scanf("%d ", &a1);
	scanf("%d ", &a2);
	scanf("%d ", &a3);
	int sum = a1 * a2* a3;

	printf("%d\n", sum);
	return 0;
}