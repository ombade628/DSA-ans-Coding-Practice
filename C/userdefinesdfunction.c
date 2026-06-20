#include<stdio.h>
#include<math.h>
#define max 5

int main(){
    void input(void);
    int fact(int n) ;   
    int a,b,c ;
    input();
    float h_series(int , int);
    printf("after evaluation of the series we get :%f  " , h_series(value, number));

}
int fact(int n){
    int i ,factorial=0;
    for(i=1;i<=n;i++){
        if (n==0 ||n==1){
            break ;
        }
        else {
            factorial =factorial * fact(n-1) ;

            
        }
        return factorial ;

    }
}
float h_series(int x,int num){
    float f=0.0, value ;
    int i, j;

    for (i=0;i<=num;i++){
        if (num==0 || num<=0){
            break ;
        }  
        else{
            for(j=1;j<num ;j++){
                value = x - (pow(x,num+2)/fact(num+2) +(pow(x,num+4))/fact(num) -(pow(x,num))/fact(num)  ;
            }
        }
        return f ; 
    }

}
void input(void){
    int x,num ;
    printf("enter the element x for finding :");
    scanf("%d",&x,&num);
    return ;
}
