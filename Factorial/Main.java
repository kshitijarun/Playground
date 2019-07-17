#include<stdio.h>
int main()
{
	//your code here
  long int n,fac=1,i;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
    fac=fac*i;
  printf("%ld",fac);
}