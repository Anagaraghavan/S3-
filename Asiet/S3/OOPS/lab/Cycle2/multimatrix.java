//Program to print multiplication table
//Anaga Raghavan
//Roll No:8
import java.util.*;
public class multiplicationtable
{
	public static void main(String args[])
	{
	int i,range,num;
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the number:");
	 num=S.nextInt();
	System.out.println("Enter the range:");
	 range=S.nextInt();
	System.out.println("The multiplication table is: ");
	for(i=1;i<=range;i++)
	{
		System.out.println(num+"*"+i+"="+(num*i));
	}
	S.close();
	}
}
