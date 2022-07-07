package pkg1;


public class assignment1 
{
	int age;
	int rollno;
	public void method1()
	{
		System.out.println("welcome to all");
	}
	public void method2() 
	{
        System.out.println("Automation is very easy");
    }
	public static void main(String[] args) 
	{
		assignment1 a1=new assignment1();
		a1.age= 23;
		a1.rollno= 12;
		System.out.println("age of student is : " +a1.age);
		System.out.println("roll no of student is : " +a1.rollno);
		a1.method1();
		a1.method2();
	}
    	 
    
}
