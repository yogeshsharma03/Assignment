package pkg1;
public class Functon{
	public int sum(int a, int b)	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int x, int y)	{
		int z;
		z=x-y;
		return z;
	}
	public int mul(int u,int v)	{
		int w;
		w=v*u;
		return w;
	}
	public void div(int x1,int x2)	{
		int x3;
		x3=x1/x2;
		System.out.println("Final valus of ((((10+2)+2)-2)*2)/2) is    "+x3);	}
	public static void main(String[] args)
	{
		Functon fun=new Functon();     // TODO Auto-generated method stub
		int sum_result=fun.sum(10, 2);
		int sum_result2=fun.sum(sum_result, 2);
		int sub_result=fun.sub(sum_result2, 2);
		int mul_result=fun.mul(sub_result, 2);
		fun.div(mul_result, 2);
	}
}
