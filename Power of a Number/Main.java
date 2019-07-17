#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here       
     int a,n,c=1,n1;
  scanf("%d%d",&a,&n);
  if(n<0)
    printf("Wrong input");
  else
  {
    n1=n;
	while(n1-->0)
    {
      c=c*a;
    }
    printf("%d",c);
  }
  return 0;
  
}