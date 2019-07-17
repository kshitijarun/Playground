#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n,i,c=0,d=0;
  scanf("%d",&n);
  if(n%2!=0)
  {
    for(i=1;i<n;i=i+2)
      c++;
    int a=pow(2,c);
    printf("%d",a);
  }
  else if(n%2==0)
  {
    for(i=2;i<n;i=i+2)
      d++;
    int b=pow(3,d);
    printf("%d",b);
  }

  return 0;
}