
/**
 * Write a description of class EditorDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EditorDriver
{
   public static void main(String[] args) {
       
       ReadFiles rf = new ReadFiles();
       rf.readTextFile();
       rf.readDictionary();
       PrimitiveJavaEditor pje = new PrimitiveJavaEditor();
       pje.spellCheckAll();
       //here is where you would do the loop
       // check for input numbers 1 through 10 via keyboard and call
       //the methods accordingly.  
       
       
    }
}
