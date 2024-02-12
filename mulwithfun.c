#include<stdio.h>
int main()
{
	doMul(2,3);
	doMul(5,5);
	doMul(4,4);
	return 0;
}
void doMul(int a,int b)
{
	int mul;
	mul=(a*b);
	printf("%d\n",mul);
}
