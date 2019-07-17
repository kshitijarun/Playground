#include<stdio.h>
int main()
{
	//type your code here
	int a=0,b=0,i,n,t;
  scanf("%d",&n);
  if(n>=1 && n%2==1)
  {
    t=(n-1);
  }
  else
    t=(n-2)*(0.5);
  printf("%d",t);
}