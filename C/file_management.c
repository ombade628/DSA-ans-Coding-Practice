#include<stdio.h>

int main(){
    FILE *f1 ;
    char c ;
    f1=fopen("INPUT","w");
    while(c=getchar() != EOF){
        put(c,f1);

    }
    fclose(f1);

    f1=fopen("INPUT","r");
    while(c=getchar() != EOF){
        printf("%c",c);
    }
    fclose(f1);
}
