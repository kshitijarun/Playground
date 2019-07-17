#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,num1,num2;
  int pos1=-1,pos2=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d%d",&num1,&num2);
  for(i=0;i<n;i++)
  {
    if(a[i]==num1)
    {
      pos1=i;
      break;
    }
  }
  
  for(i=0;i<n;i++)
  {
    if(a[i]==num2)
    {
      pos2=i;
      break;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",pos1,pos2);
}