#include<stdio.h>
int main()
{
  //Type your code here
  int a=0,b=1,temp,n,i;
  scanf("%d",&n);
  printf("%d %d ",a,b);
  for(i=2;i<n;i++)
  {
    temp=a+b;
    printf("%d ",temp);
    a=b;
    b=temp;
  }
  return 0;
}