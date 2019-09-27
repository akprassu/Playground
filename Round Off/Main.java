#include<stdio.h>
int main()
{
  float x;
  scanf("%f",&x);
  int i=(int)x;
  printf("%d\n",i);
  printf("%.1f\n",ceil(x));
  printf("%.1f",floor(x));
}