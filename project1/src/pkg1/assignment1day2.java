package pkg1;

public class assignment1day2 

{

	public int sum(int a, int b) 
 {
  int d1;
  d1=a+b;
  System.out.println("The sum result is = " +d1);
  return d1;
 
 }
	public int sum1(int j, int k) 
	{
		int d2;
		d2=j+k;
		System.out.println("The sum result is = " +d2);
		return d2;
	}

	public int sub(int x, int y)
 {
   int z;
   z=x-y;
   System.out.println("The subtraction is = " +z);
   return z;
   
 }

	public int multi(int p, int q)
 {
	int r;
	r=p*q;
	System.out.println("the multiplication result is = " +r);
	return r; 
 }

  public int div(int s, int t) 

  {
	int u;
	u=s/t;
	System.out.println("The division result is =" +u);
	return u;
  }

   public static void main(String[] args) 
  {
	assignment1day2 ob=new assignment1day2();
	int sumresult=ob.sum(10, 2);
	int sumresult1=ob.sum1(sumresult, 2);
	int subresult=ob.sub(sumresult1, 2);
	int multiresult=ob.multi(subresult, 2);
	int divresult=ob.div(multiresult, 2);
   }	
}





