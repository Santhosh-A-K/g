import java.util.*;
import java.lang.*;
import java.io.*;


class Alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch>='a'&&ch<='z')
		{
		System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
	}
}
