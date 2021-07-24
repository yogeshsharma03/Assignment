package pkg1;

public class Method
{
	int deepak;
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
		
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("substraction result is "+z);
		return z;
		
	}
	public void mul(int u,int v)
	{
		int w;
		w=v*u;
		System.out.println("Multiplication result is "+w);
		//return w;
		
		//int deepak=213;
		//System.out.println("c= 10+20 =    "+c);
		
	}
	public void m2()
	{
		int deepak1=1;
		deepak1 = deepak1+1;
		System.out.println("Deepak valus is    "+deepak1);
	}

	public static void main(String[] args)
	{
		Method meth=new Method();     // TODO Auto-generated method stub
		meth.sum(12, 12);
		meth.sub(5, 5);
		meth.mul(20,20);
		meth.m2();
		

	}

}
