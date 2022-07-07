package pkg1;

public class ABC 
{
	public ABC() 
	{
		this(33,35,36);
		System.out.println("Default constructor"); 
	}
    public ABC(int a) 
    {
    	this();
    	System.out.println("One parametrised constructor");
    }
    public ABC(int a , int b)
    {
    	this(10);
    	System.out.println("two parameterised constructor");
    }
    public ABC(int a, int b, int c)
    {
    	System.out.println("three parameterised constructor");
    }
    public ABC(int a, int b, int c, int d)
    {
    	this(12,5);
    	System.out.println("four prameterised constructor");
    }
    public static void main(String[] args) 
    {
		ABC obj= new ABC(6,7,8,9);
	}
}





