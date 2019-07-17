#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int sum=0,i,j,n,rem;
  scanf("%d",&n);
  i=0;
  j=0;
  while(n>0)
  {
    rem=n%10;
    sum=sum+pow(2,i)*rem;
    i++;
    n=n/10;
  }
  int o[i+1];
  while(sum>0)
  {
    o[j]=sum%8;
    j++;
    sum=sum/8;
  }
  for(i=j-1;i>=0;i--)
  {
    printf("%d",o[i]);
  }
  return 0;
}