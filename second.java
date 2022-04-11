class Mathoperations 
	{
	public void add(int d) //parameters
	
	{
		int a;
		a=10;
		int c;
		c=a+d;
		System.out.println("addition="+c);
	}
		public void sub()
		{
			int a,b,c;
			a=20;
			b=20;
			c=a-b;
			System.out.println("sub="+c);
		

		}
	}
			
			public class second {
		public static void main(String[] args) {
			
			Mathoperations ope=new Mathoperations();
			ope.add(3);
			ope.sub();
			System.out.println("workfine");
	}
} 	
