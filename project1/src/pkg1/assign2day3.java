package pkg1;

public class assign2day3 
{
    public void m1() 
   
    {
    	this.m4(20,21,22);
    	System.out.println("default method");
    	
    }
    public void m2(int a) 
   
    {
    	this.m1();
        System.out.println("one parameterised method");	
   
    }
    public void m3(int b, int c) 
    
    {
    	this.m2(99);
        System.out.println("two parameterised method");	
    
    }
    public void m4(int d, int e, int f) 
    
    {
        System.out.println("three parameterised method");	
   
    }
    public void m5(int g, int h, int i, int j) 
   
    {
    	this.m3(26,27);
        System.out.println("four parameterised method");	
   
    }

    public static void main(String[] args)
    {
		assign2day3 ob=new assign2day3();
		ob.m5(12,13,14,15);
		
	}







}








