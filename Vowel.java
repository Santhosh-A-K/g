import java.util.*;
import java.lang.*;
import java.io.*;


class Vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch>='a'&&ch<='z')
		{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		System.out.println("Vowel");
		else
		System.out.println("Consonant");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
