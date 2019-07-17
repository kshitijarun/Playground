#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char str[20];
  int c=1,i;
  scanf("%s",str);
  if(strlen(str)>20)
    printf("Invalid Input");
  else
  {
  for(i=0;i<strlen(str);i++)
  {
    
    if(str[i]==str[i+1])
      c++;
    else
    {
      printf("%c%d",str[i],c);
      c=1;
    }
  }
  }
}