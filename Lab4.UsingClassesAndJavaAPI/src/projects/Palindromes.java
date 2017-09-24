package projects;
import java.io.*;
import java.util.Scanner;
public class Palindromes {

	public static void main(String[] args) throws FileNotFoundException {
	
		String str, another = "y";
		int left, right;
		Scanner in = new Scanner( new File ("palindrome.txt"));
		
		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			try {
				File file= new File("palindromes.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer= new StringBuffer();
				String line;
				while(( line= bufferedReader.readLine())!=null) {
					stringBuffer.append(line);
					stringBuffer.append("\n");
					str= in.nextLine();
					
					left=0;
					right=str.length()-1;
					
					while (str.charAt(left) == str.charAt(right) && left < right)
					{
						left++;
						right--;
					}
					System.out.println();
					
					if(left< right)
						System.out.println("That string is NOT a palindome.");
						else
							System.out.println("That string IS a palindrome.");
						
					System.out.println();
					System.out.print("Test another palindrome (y/n)?");
					another = in.nextLine();
				}
				System.out.println("done");;
				fileReader.close();
				System.out.println("Contents of file: ");;
				System.out.println(stringBuffer.toString());
			} catch (IOException e) {
				e.printStackTrace();
				}
		}}}
