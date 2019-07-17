#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,num;
  scanf("%d",&n);
  while(n>0)
  {
    num=n%10;
    sum=sum+num;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}