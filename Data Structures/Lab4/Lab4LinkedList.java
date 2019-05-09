import java.io.File;
import java.util.*;

public class Lab4LinkedList {
	
	public static void main(String[] args) {
	
		LinkedList<String> wordList = new LinkedList<>();
	
	Scanner fileScanner;
	String word;
	int duplicates = 0;
	
	long time1=System.currentTimeMillis();
	
	try {
		fileScanner = new Scanner (new File("EnglishWordList.txt"));
	
		while (fileScanner.hasNext())
		{
			 word = fileScanner.nextLine();
			 
			 if(wordList.contains(word)) 
				 duplicates++;
			 
			 wordList.add(word);
			
			 
		} //while
		
		} //try
		catch (Exception e) {
			
		}//catch
	
	long time2=System.currentTimeMillis();
	
	System.out.println("program took  " + (time2-time1) + "  milliseconds");
	
	System.out.println(wordList.size());
	System.out.println(duplicates);
	
	//program took  1112675  milliseconds
	//251885
	//1731
	
	
	}

}
