//static in java

class Hello
{
	public int i;	//public int i=0 Allowed
	public static int j;	//public static int j=0 Allowed
	
	static
	{
		//i=11;	not allowed (only static member allowed)
		j=21;
		System.out.println("Inside static 1");
	}
	
	static 
	{
		System.out.println("Inside static 2");
	}
	
	public Hello()
	{
		i=12;
		j=22;
		System.out.println("Inside constructor");
	}
	
	public void fun()
	{
		System.out.println("Inside non-static function");
		System.out.println(i);
		System.out.println(j);		
	}
	
	public static void gun()
	{
		System.out.println("Inside static gun");
		//System.out.println(i);	not allowed
		System.out.println(j);		
	}
}

class static_in_java
{
	static
	{
		System.out.println("Before main");
	}

	public static void main(String arg[])
	{
		System.out.println("Inside main");
//		System.out.println(Hello.i);	not allowed
		
		System.out.println(Hello.j);
		
//		Hello.fun();	not allowed
		Hello.gun();
		
		Hello href;
		href=new Hello();	//constructor
		
		System.out.println(href.i);
		System.out.println(href.j);
		href.fun();
		href.gun();
		
		Hello href2;
		href2=new Hello();
		
	}
}
	