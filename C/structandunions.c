//program for storing marks of students :
#include<stdio.h>
#include<math.h>

struct marks{
    int subject[3] ;
    int total ;
};

int main(){
    int i ,j;
    struct marks student [3]={{93,84,95},{87,76,87},{76,65,76}}   ;
    struct marks total ={0,0,0,0};

    for(i=0;i<=2;i++){ 
        for(j=0;j<=2;j++){
          student[i].total +=student[i].subject[j] ;
            total.subject[i] += student[j].subject[i] ;
        }
        total.total += student[i].total ;

    }
    printf("Student Total :\n");
    for(i=0;i<=2;i++){
        printf("Total marks of student %d are %d\n",i+1,student[i].total) ;
    }
    printf(" \nSubject  Total :\n");
    for(i=0;i<=2;i++){
        printf("total marks in subject %d are %d \n",i+1,total.subject[i]);
    }
    return 0 ;
}

//program for 
#include<stdio.h>
#include<math.h>
#include<string.h>
#define max_items 10
struct store{
    char name ;
    float price ;
    float quantity ;
    float bill ;
};
float mul(struct stores stock);

int main(){
    int i,j ;
    float p ,q ;
    struct store item[max_items] ={};
    struct store bill= {0} ;
    printf("welcome to the Om store :") ;
    printf("enter the name price and quantity of a item :");
    for(i=0;i<max_items;i++){
        scanf("%s,%f%f",item[i].name,&item[i].price,&item[i].quantity);
    }
    for(i=0;i<max_items;i++) {`
        item[i].bill= mul(item);
    }
    float mul(struct store stock)[
        return(stock.price* stock.quantity) ;
    ]
}