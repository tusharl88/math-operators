package mathop;

public class mathoperator{
public static void main (String args[])
	{
		int tushar[]={5,8,15,23};			 //here arguments are not directly passed. here they are first stored in array 
											//and array is passed. thats why we have not used return statement in change method.
		
		change (tushar);
		for( int y: tushar)
		{
			System.out.println(y);
		}
		
	}
	

 public static void change(int x[])
{
	 
	 for(int i=0;i<x.length; i++)
	 {
		 x[i]+=5; 
		 
	 }
	 
	 
}
}
 
