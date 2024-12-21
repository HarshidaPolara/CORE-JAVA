class result
{
	public static void main(String args[])
	{
		int[] marks = new int[5];
		int total=0;
		float per;
		for (int i=0;i<5;i++)
		{
			marks[i]=Integer.parseInt(args[i]);				
			total=total+marks[i];
		}
		per=(total*100)/500;
		System.out.println("Marks of subject:");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Subject"+(i+1)+":"+marks[i]);
		}
		System.out.println("Total of subjects:"+total);
		System.out.println("Percentage of subjects:"+per);
	}
}
