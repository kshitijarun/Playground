#include<stdio.h>
int main()
{
  //Type your code here
  int n,i=0,j;
  int a[10];
  scanf("%d",&n);
  while(n>0)
  {
    a[i]=n%2;
    i++;
    n=n/2;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",a[j]);
  return 0;
}