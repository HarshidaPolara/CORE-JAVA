import java.util.StringTokenizer;  
public class stringtokenizer
{  
		public static void main(String args[])
		{  
	   		StringTokenizer st = new StringTokenizer("Hi i am here"," ");  
			while (st.hasMoreTokens()) 
			{  
		        System.out.println(st.nextToken());  
   		}  
   }  
} 
