#include <stdio.h>
int main() {
	//Type your code
  int i,n,a=1,sum=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    sum=sum+a;
    a++;
  }
  printf("%d",sum);
	return 0;
}