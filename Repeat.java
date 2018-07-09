import java.util.*;

public class Repeat
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int ar[]=new int[no];
		int res[]=new int[no/2];
		int cr=0;
		for(int i=0;i<no;i++)
		{
		    ar[i]=s.nextInt();
		}
		for(int i=0;i<no;i++)
		{
		    int flag=0;
		    for(int j=i+1;j<no;j++)
		    {
		        if(ar[i]==ar[j])
		        {
		            for(int k=j;k<no-1;k++)
		            {
		                ar[k]=ar[k+1];
		            }
		            no--;
		            flag=1;
		        }
		    }
		    if(flag==1)
		    {
		        res[cr]=ar[i];
		        cr++;
		    }
		}
		if(res[0]==0)
		{
		    System.out.println("unique");
		}
		else
		{
		    for(int i=0;i<cr;i++)
		    {
		        for(int j=i+1;j<cr;j++)
		        {
		            if(res[i]>res[j])
		            {
		                int temp=res[i];
		                res[i]=res[j];
		                res[j]=temp;
		            }
		        }
		    }
		    for(int i=0;i<cr;i++)
		    {
		        System.out.print(res[i]+" ");
		    }
		}
	}
}
