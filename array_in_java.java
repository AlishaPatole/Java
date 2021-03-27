//array in java

class array_in_java
{
	public static void main(String arg[])
	{
		//ways in which we can create array
		
		int arr1[];	//reference
		arr1=new int[4];	//memory allocation
		
		int arr2[]=new int[4];
		int []arr3=new int[4];
		int arr4[]= {10,20,30,40};	//internally dynamic
		int arr5[]=new int[]{10,20,30,40};
		int arr6[]=new int[4];
		arr6[0]=10;
		arr6[1]=20;
		arr6[2]=30;
		arr6[3]=40;
		
		System.out.println(arr6.length);	//4
		System.out.println("For loop ");	
		
		for(int i=0;i<arr6.length;i++)
		{
			System.out.println(arr6[i]);	
		}
		
		System.out.println("While loop ");
		int j=0;
		
		while(j<arr6.length)
		{
			System.out.println(arr6[j]);
			j++;
		}
		
		System.out.println("Do while ");
		int k=0;
		do
		{
			System.out.println(arr6[k]);
			k++;
		}while(k<arr6.length);
		
		System.out.println("For each loop ");
		for(int x:arr6)
		{
			System.out.println(x);
		}
		
		
		//JAGGED ARRAY
		
		System.out.println("JAGGED ARRAY");
		
		int arr7[][];
		 arr7=new int[3][2];
		
		int arr8[][]=new int[3][2];
		int arr9[][]= {{10,20,30},{40,50,60}};
		int arr10[][]=new int[][] {{10,20,30},{40,50,60}};
		int arr11[][]=new int[3][2];
		
		arr11[0][0]=10;
		arr11[0][1]=20;
		arr11[1][0]=30;
		arr11[1][1]=40;
		arr11[2][0]=50;
		arr11[2][1]=60;
		
		for(int i=0;i<arr11.length;i++)
		{
			for(j=0;j<arr11[i].length;j++)
			{
//				System.out.println("Printing jagged array...");
				System.out.println(arr11[i][j]);
			}
		}
		
		int brr[][]=new int[3][];
		brr[0]=new int[4];
		brr[1]=new int[5];
		brr[2]=new int[2];
		
		for(int i=0;i<brr.length;i++)
		{
			for(j=0;j<brr[i].length;j++)
			{
//				System.out.println("Inside jagged array...");
				System.out.println(brr[i][j]);
			}
		}
		
		System.out.println(brr.length);	//3
		System.out.println(brr[0].length);	//4
		System.out.println(brr[1].length);	//5
		System.out.println(brr[2].length);	//2
		
	}
}