#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  int c=0, i;
  scanf("%[^\n]s",str);
  for(i=0;i<strlen(str);i++)
  {
    if(str[i]==' ')
      c++;
  }
  printf("%d",c+1);
}