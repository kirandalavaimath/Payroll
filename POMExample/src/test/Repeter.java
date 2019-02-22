package test;

public class Repeter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count=0;
		String s="kiranKumar";
		for(char i=32;i<=127;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(j)==i)
				{
					count++;
				//	break;
				}
			}
			if(count!=0)
			{
				System.out.println(i+" = "+count);
				count=0;
			}
		}
		}}
