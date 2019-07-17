// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,min,i,gcd,lcm;
  scanf("%d%d",&a,&b);
  if(a>b)
    min=b;
  else
    min=a;
  for(i=min;i>0;i--)
  {
    if(a%i==0 && b%i==0)
    {
      gcd=i;
      break;
    }
  }
  lcm=(a*b)/gcd;
  printf("%d",lcm);
   return 0;
}