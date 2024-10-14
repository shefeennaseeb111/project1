package checkaddanddivisible;

public class Class2 extends Class1 {

	
	public Class2()
	{
		super();
		
		super.display();
		
	}
	public void check()
	{
	System.out.println("the sum is "+super.c);
	
	if(c%10==0)
	{
		System.out.println("Result is divisible by 10");
		}
	else
	{
	System.out.println("Result is not divisible by 10");	
	
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 s=new Class2();
		s.check();
	}

}
