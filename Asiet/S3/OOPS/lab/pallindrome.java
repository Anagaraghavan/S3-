import java.util.*;
class pallindrome
{
	public static void main(String args[])
	{
		String str,rev="";
		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
		System.out.println("is a pallindrome"+ str);
		}
		else
		{
		System.out.println("not a pallindrome"+ str);
		}
		
	}
}
		
		
		
