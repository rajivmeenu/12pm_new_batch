package pkg1;

public class assign2day2 


{
 
	
	public int div(int a, int b)
	{
		int d1;
		d1=a/b;
		System.out.println("The result of division = " +d1);
		return d1;
	}
	public int sub(int p, int q)
	{
		int s;
		s=p-q;
		System.out.println("The result of subtraction = " +s);
		return s;
	}
	public int sub1(int j, int k)
	{
	    int l;
	    l=j-k;
	    System.out.println("The result of subtraction = " +l);
		return l;
	}
	public int sum(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("The result of sum = " +z);
		return z;
	}
	public int mul(int e, int f)
	{
		int g;
		g=e*f;
		System.out.println("The result of multiplication = " +g);
		return g;
	}
	public static void main(String[] args)
	{
		assign2day2 ob=new assign2day2();
		int divresult=ob.div(10, 2);
		int subresult=ob.sub(divresult, 2);
		int subresult1=ob.sub1(subresult, 2);
		int sumresult=ob.sum(subresult1, 2);
		int mulresult=ob.mul(sumresult, 2);
		
	}
}
