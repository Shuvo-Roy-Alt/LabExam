import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList 
{
	public static void main(String[] args) 
	{

//		Check arguments
		if(args[0].equals("a")) 
		{
			System.out.println("Loading data ...");			
			try 
			{
			   BufferedReader stdnt = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			    String read = stdnt.readLine();
			    String i[] = read.split(",");			
					   for(String j : i) 
					   {
						    System.out.println(j);
					   }

			} 
			    catch (Exception e)
			      {

			      } 
			          System.out.println("Data Loaded.");
		}
		   else if(args[0].equals("r")) 
		        {
			         System.out.println("Loading data ...");			
			           try 
			    {
			BufferedReader stdnt = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")
							)
							); 
			              String read = stdnt.readLine();
			              System.out.println(r);
			String i[] = read.split(",");	
			Random variable1 = new Random();
				int  variable2= variable1.nextInt();
					System.out.println(i[variable1]);
				}
				catch (Exception e)
			         {

			         } 
			             System.out.println("Data Loaded.");			
		        }
		         else if(args[0].contains("+"))
		             {  
			            System.out.println("Loading data ...");			
			              try 
			         {
			BufferedWriter stdnt = new BufferedWriter(
					new FileWriter("students.txt", true)
					                             );
			String t = args[0].substring(1);
	        Date d = new Date();
	        String df = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			s.write(", "+t+"\nList last updated on "+fd);
			s.close();

					 } 
					 catch (Exception e)
			              {

			              }
							
			System.out.println("Data Loaded.");	
					 }
					 else if(args[0].contains("?")) 
		             {
						 System.out.println("Loading data ...");
						 try
			 {
			BufferedReader stdnt = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")
							)
							); 
			String read = stdnt.readLine();
			String i[] = read.split(",");	
			boolean done = false;
			String t = args[0].substring(1);
				for(int idx = 0; idx<i.length && !done; idx++)
				   {
				      if(i[idx].equals(t))
				             {
					             System.out.println("We found it!");
						           done=true;
				             }
			       }
			} 
			catch (Exception e)
			{

			} 
			System.out.println("Data Loaded.");				
					 }
					 else if(args[0].contains("c")) 
					 {
			            System.out.println("Loading data ...");			
			             try 
			         {
			BufferedReader stdnt = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt")
							)
							); 
			String D = stdnt.readLine();
			char name[] = D.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:name) 
			{
				if(c ==' ') 
				{
					if (!in_word) 
					{	
						count++; in_word =true;	
					}
					else 
					{ 
						in_word=false;
					}			
				}
			}
			System.out.println(count +" word(s) found " + name.length);
					 } 
					 catch (Exception e)
					 {

					 } 
			System.out.println("Data Loaded.");				
		             }
	}
}