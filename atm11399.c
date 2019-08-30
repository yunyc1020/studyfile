#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int num, num2, i, j, sum, max = 0;
	int minute[1000], minute2[1000];
	
	scanf("%d", &num);
	for(i=0; i<num; i++){
		scanf("%d", &minute[i]);
	}
	
	for(i=0;i<num;i++)
		for(j=0;j<num;j++)
			if(i != j)
				if(minute[i] < minute[j]){
					num2 = minute[i];
					minute[i] = minute[j];
					minute[j] = num2;
				}
	
	int alpha = 0;
	for(i=0; i<num; i++){
		alpha++;
		for(j=0; j<alpha; j++){
			sum += minute[j];
		}
		minute2[i] = sum;
	}
		
	printf("%d\n", minute2[num-1]);
	
	return 0;
}
