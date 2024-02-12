#include<stdio.h>
int main()
{
	doSqr(2,3);
	doSqr(5,5);
	return 0;
	
}
void doSqr(int a,int b)
{
	int f;
	f=((a*a)+(b*b)+(2*a*b));
	printf("%d\n",f);
}
