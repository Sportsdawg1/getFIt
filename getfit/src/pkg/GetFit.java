package pkg;

/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GetFit {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr;
		File week = new File("/src/pkg/week.data⁩"); 
		fr = new FileReader(week);
		BufferedReader br = new BufferedReader(fr);
		System.out.println("d");
	}
	 String[] read (BufferedReader b) {
		String[] text = new String[7];
		for (int i = 0; i < text.length; i++) {
			try {
				text[i] = b.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return text;
	}
}*/
import java.io.File; 
import java.util.Scanner; 
public class GetFit 
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    File file = 
      new File("\\getfit\\src\\pkg\\week.data"); 
    Scanner sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
  } 
} 
