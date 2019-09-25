#include <stdio.h>

int main(){
    int i, j=0;
    int a[8];

    for(i=0;i<8;i++){
        scanf("%d ", &a[i]);
    }

    for(i = 0; i < 7; i++){
        if(a[i]<a[i+1]){
            j++;
        }else if(a[i]>a[i+1]){
            j--;
        }
    }

    if(j==7){
        printf("ascending");
    }else if(j==-7){
        printf("descending");
    }else{
        printf("mixed");
    }

    return 0;
}