package test;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		boolean flag=false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
		}
	if(!flag)
	{
		System.out.println("prime no");
	}	
	else
	{
		System.out.println("not prime no");
	}
	}
}
