#include <stdio.h>
int main() {
	//Type your code
  int n,num;
  scanf("%d",&n);
  num=n;
  while(n>0)
  {
    if(n<100)
    {
      num=n%10;
    }
    n=n/1000;
  }
  printf("%d",num);
	return 0;
}