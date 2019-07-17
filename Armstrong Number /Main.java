#include <stdio.h>
int main() {
	//Type your code
  int n,i,num,c=0,sum=0;
  scanf("%d",&n);
  num=n;
  while(num>0)
  {
    c++;
    num=num/10;
  }
  //printf("%d",c);
  num=n;
  while(num>0)
  {
    i=num%10;
    sum=sum+pow(i,c);
    num=num/10;
  }
 // printf("%d",sum);
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}