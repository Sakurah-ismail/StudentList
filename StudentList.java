import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("a")) {
			System.out.println("Loading data ...");			
			try {
			  	BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String studentName = bufferedReader.readLine();
			String names[] = studentName.split(",");			
			for(String j : names) {
				System.out.println(j.trim());
			 }
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String studentName = bufferedReader.readLine();
			//System.out.println(r);
			String names[] = studentName.split(",");	
			Random random = new Random();
				int index = random.nextInt(names.length);
					System.out.println(names[index].trim());
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
			BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("students.txt", true));
			String text = args[0].substring(1);
	        Date date = new Date();
	        String dateformats = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(dateformats);
	        String formatdate= dateFormat.format(date);
			bufferedWriter.write(", "+text+"\nList last updated on "+formatdate);
			bufferedWriter.close();
			} catch (Exception e){

			}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferedreader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String studentName = bufferedreader.readLine();
			String names[] = studentName.split(",");	
			boolean done = false;
			String text = args[0].substring(1);
			for(int index = 0; index<names.length && !done; index++) {
				if(names[index].equals(text)) {
					System.out.println("We found it!");
					done=true;
				}
			}
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String studentName = bufferedReader.readLine();
			char array[] = studentName.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char word:array) {
				if(word ==' ') 
				{
					if (!in_word)
					 {
						 	count++;
						    in_word =true;
					 }
					else {
						 in_word=false;
						}			
				}
			}
			System.out.println(count +" word(s) found ");
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");				
		}
	}
}