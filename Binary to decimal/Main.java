#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int n,r,i=0;
  int sum=0;
  scanf("%ld",&n);
  while(n>0)
  {
    r=n%10;
    sum=sum+pow(2,i)*r;
    i++;
    n=n/10;
  }
  printf("%d",sum);
  return 0;
}