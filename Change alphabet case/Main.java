#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if(c>='a' && c<='z')
    c=c-32;
  else
    c=c+32;
  printf("%c",c);
	return 0;
}