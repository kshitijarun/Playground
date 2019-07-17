#include <stdio.h>
int main() {
	//Type your code
  int n,num,sum=0;
  scanf("%d",&n);
  num=n;
  while(num>0)
  {
    sum=sum+fac(num%10);
    num=num/10;
  }
  if(sum==n)
  printf("Yes");
  else
    printf("No");
	return 0;
}
int fac(int num)
{
  int i,n,f=1;
  n=num;
  for(i=1;i<=n;i++)
    f=f*i;
	return f;
  
}