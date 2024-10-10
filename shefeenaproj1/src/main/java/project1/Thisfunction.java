package project1;

public class Thisfunction {
	int a,b,c;
	public Thisfunction(int a,int b)
	{
	this.a=a;
	this.b=b;
	this.add();
	}
	public void add()
	{
		c=a+b;
		System.out.println("Sum is"+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisfunction s=new Thisfunction(100,20);
		
	}

}
