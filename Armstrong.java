import java.util.*;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,count=0,rem,temp,p,sum=0,j;
		System.out.printf("enter no");
		no=xyz.nextInt();
		temp=no;
		while(no!=0)
		{
			++count;
			no=no/10;
		}
		no=temp;
		while(no!=0)
		{
			rem=no%10;
		//p=pow(rem,count);
			j=1;
			p=1;
			while(j<=count)
			{
				p=p*rem;
				j++;
			}
			sum=sum+p;
			no=no/10;
		}
	
		if(sum==temp)
		{
			System.out.printf("Armstrong no");
		}
		else
		{
		System.out.printf("Not armstrong");
		}
	}
}