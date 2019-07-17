#include<stdio.h>
int main()
{
  float r,a,len;
  scanf("%f%f",&r,&a);
  len=2*3.14*r*(a/360.0);
  printf("%.2f",len);
  return 0;
}