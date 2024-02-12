#include<stdio.h>
int main()
{
	doSum(10,20);
	doSum(20,30);
	doSum(30,30);
	return 0;
	
}
void doSum(int n1,int n2)
{
	int result;
	result=n1+n2;
	printf("%d\n",result);
}
