#include <stdio.h>
int main() {
	//Type your 
  int n,num;
  scanf("%d",&n);
  num=n;
  while(n>=10)
  {
    n=n/10;
  }
  printf("%d",n+num%10);
	return 0;
}