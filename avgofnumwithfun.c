#include<stdio.h>
int main()
{
	doAvg(10,20,30);
	doAvg(30,30,30);
	return 0;
	
}
void doAvg(int n1,int n2,int n3)
{
	int sum;
	int avg;
	sum=n1+n2+n3;
	avg=sum/3;
	printf("%d\n",avg);
}
