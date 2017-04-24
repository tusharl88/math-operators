package mathop;

public class multiplearguments {
	public static void main (String args[])
	{
		System.out.println(average(2,34,43,34));     //here arguments are directly passed hence we have used return in average method.
	}
	

 public static float average (int...numbers)
{
	 float total=0;
	 float average=0;
	 for(int x:numbers){
	 
		 total+=x;
		 average=total/numbers.length;
	 
	 }
	 return average;
}
}
