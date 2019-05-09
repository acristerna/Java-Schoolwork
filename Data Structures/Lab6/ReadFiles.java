

import java.util.*;
import java.io.*;
public class ReadFiles {

    
     Scanner fileScanner;
     static LinkedList<String> textFile;
     static HashSet<String> wordList;
     String dictionaryFile = "EnglishWordList.txt";
     String textFileName ="alcott-little-261.txt";
     
     public ReadFiles () {
         
         fileScanner=null;
         textFile = new LinkedList<>();
         wordList = new HashSet<>();
         
        }
        
        
        public void readTextFile()
   {
       
          String line=null;
          //String[] words;
               try
               {
                  
                   fileScanner = new Scanner (new File (textFileName));
                   
                   while (fileScanner.hasNext()) {
           
                    line = fileScanner.nextLine();
                    String[] words=line.split(" ");
                    for (int i=0;i<words.length;i++) {
                        String s = words[i].replaceAll("[\\[\\]_:\"'`?;\\â€�0-9â€”;â€œ()-/.,*! ]", "").trim().toLowerCase();
                        if (!s.isEmpty())textFile.add(s);
                    }
                    
                }
               }
               catch (IOException e)
               {
                   System.out.println(e);
               }
       
   }
     
   
   
   public void readDictionary()
   {
       
          String word=null;
               try
               {
                  
                   fileScanner = new Scanner (new File (dictionaryFile));
                   
                   while (fileScanner.hasNext()){
           
                    word = fileScanner.nextLine();
                    wordList.add(word);
                }
       
               }
               catch (IOException e)
               {
                   System.out.println(e);
               }
       
   }
           
}

