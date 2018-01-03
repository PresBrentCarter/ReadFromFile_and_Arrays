
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class Tester
{
    public static void main( String[] args ) throws IOException
    {
        String[] lines = ReadFromFile.ReadFile("G:/Work/CompSci/Computer Science Class Files/input.txt");
        
        if( lines != null)
        {
            // Example to print out the lines from data
            for( int i = 0; i < lines.length; i++)
            {
                System.out.println( lines[i] );
            }
        }
        
    }
}
