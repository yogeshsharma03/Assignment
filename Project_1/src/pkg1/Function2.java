package pkg1;
public class Function2{
		public int sum(int a, int b)		{
			int c;
			c=a+b;
			return c;
			
		}
		public int sub(int x, int y)		{
			int z;
			z=x-y;
			return z;
		}
		public int mul(int u,int v)		{
			int w;
			w=v*u;
			return w;
		}
		public void div(int x1,int x2)	{
			int x3;
			x3=x1/x2;
			//deepak1 = deepak1+1;
			System.out.println("Final valus of ((((10+2)+2)-2)*2)/2) is    "+x3);
		}
		public static void main(String[] args)		{
			Function2 fun=new Function2();     // TODO Auto-generated method stub
			int mul_result=fun.mul(10, 2);
			int sub_result=fun.sub(mul_result, 2);
			int sum_result=fun.sum(sub_result, 2);
			int sub_result2=fun.sub(sum_result, 2);
			fun.div(sub_result2, 2);
		}

	}



