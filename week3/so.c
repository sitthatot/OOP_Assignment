#include<stdio.h>

long NumberGroup(int start, int stop, long array[],int isTrue){
    for(int i=stop; i>=start; i--){
        printf("%d",array[i]);
    }
    if(isTrue == 1){
        printf("\n");
    }
}

int main(){
    printf("Please enter 10 number: ");
    long num;
    scanf("%ld", &num);
    printf("%ld\n", num);
    printf("variable size = %d bytes\n", sizeof(num));
    long collect = 0;
    long box[10];
    for(int i=0; i<10; i++){
        collect = num%10;
        box[i] = collect;
        num/=10;
    }
    int noComma = 1;
    int withComma = 0; 

    printf("Hundreds, Tens, Units : ");
    NumberGroup(0,2,box,noComma);
    printf("Hundred thousands, Ten thousands, thousands : ");
    NumberGroup(3,5,box,noComma);
    printf("Hundred million, Ten million, million : ");
    NumberGroup(6,8,box,noComma);
    printf("billion : ");
    NumberGroup(9,9,box,noComma);

    printf("Number with comma : ");
    NumberGroup(9,9,box,withComma);
    printf(",");
    NumberGroup(6,8,box,withComma);
    printf(",");
    NumberGroup(3,5,box,withComma);
    printf(",");
    NumberGroup(0,2,box,withComma);
    
    return 0;
}